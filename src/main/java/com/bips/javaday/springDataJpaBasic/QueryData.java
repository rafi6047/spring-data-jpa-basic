
package com.bips.javaday.springDataJpaBasic;

import com.bips.javaday.springDataJpaBasic.repository.PlayerRepository;
import com.bips.javaday.springDataJpaBasic.repository.TeamRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Rafi on 2016-11-22.
 */
@Component
public class QueryData {

//    private static final Logger logger = LoggerFactory.getLogger(QueryData.class);

    @Resource
    private TeamRepository teamRepository;

    @Resource
    private PlayerRepository playerRepository;

    @Transactional
    public void runQueries() {

        // from CRUD interface
        // teamRepository
        System.out.println(teamRepository.findOne(1L).getName());
        teamRepository.delete(teamRepository.findOne(1L));
        teamRepository.findAll().forEach(team -> System.out.println(team.getName()));
        System.out.println(teamRepository.count());
        System.out.println(teamRepository.exists(2L));
        playerRepository.findAllByOrderByLastNameAsc().forEach(player -> System.out.println(player.getFirstName() + " " + player.getLastName()));


        // Custom methods
        // playerRepository
        System.out.println(playerRepository.countByLastName("Iqbal"));
        playerRepository.findByLastName("Silva").forEach(player -> System.out.println(player.getFirstName() + " " + player.getLastName()));
        System.out.println(playerRepository.deleteByLastName("Iqbal"));
        System.out.println(playerRepository.countByLastName("Iqbal"));

        System.out.println(playerRepository.countByLastNameIgnoreCase("silva"));
        System.out.println(playerRepository.removeByLastNameIgnoreCase("silva"));
        System.out.println(playerRepository.countByLastNameIgnoreCase("silva"));

        // Little more complex custom methods
        // teamRepository
        teamRepository.findTeamByPlayersFirstName("Mushfiqur").forEach(team -> System.out.println(team.getName()));
        teamRepository.findTeamByPlayersFirstNameStartingWith("Sha").forEach(team -> System.out.println(team.getName()));
        teamRepository.findTeamByPlayersFirstNameContaining("Sha").forEach(team -> System.out.println(team.getName()));
        playerRepository.findByFirstNameOrLastName("Shahid", "Silva").forEach(player -> System.out.println(player.getFirstName() + " " + player.getLastName()));
        playerRepository.findFirst10ByLastName("Kohli").forEach(player -> System.out.println(player.getFirstName() + " " + player.getLastName()));
        playerRepository.getByBattingStyle("Right handed").forEach(player -> System.out.println(player.getFirstName() + " " + player.getLastName()));

    }

}
