package com.bips.javaday.springDataJpaBasic;

import com.bips.javaday.springDataJpaBasic.entity.Player;
import com.bips.javaday.springDataJpaBasic.entity.Team;
import com.bips.javaday.springDataJpaBasic.repository.TeamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Rafi on 2016-11-22.
 */
@Component
public class ProduceData {

    @Resource
    private TeamRepository teamRepository;

//    private static final Logger logger = LoggerFactory.getLogger(ProduceData.class);
    private static final String RIGHT_HANDED = "Right handed";
    private static final String LEFT_HANDED = "Left handed";
    private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-M-dd");


    public void produceAndPersist() {

        Team bangladeshTeam = Team.teamBuilder().setName("Bangladesh");
        bangladeshTeam.setPlayers(createBangladeshiPlayers(bangladeshTeam));
//        logger.info("Saving team: " + bangladeshTeam.getName());
        teamRepository.save(bangladeshTeam);

        Team indiaTeam = Team.teamBuilder().setName("India");
        indiaTeam.setPlayers(createIndianPlayers(indiaTeam));
//        logger.info("Saving team: " + indiaTeam.getName());
        teamRepository.save(indiaTeam);

        Team pakistanTeam = Team.teamBuilder().setName("Pakistan");
        pakistanTeam.setPlayers(createPakistaniPlayers(pakistanTeam));
//        logger.info("Saving team: " + pakistanTeam.getName());
        teamRepository.save(pakistanTeam);

        Team srilankaTeam = Team.teamBuilder().setName("Srilanka");
        srilankaTeam.setPlayers(createSrilankanPlayers(srilankaTeam));
//        logger.info("Saving team: " + srilankaTeam.getName());
        teamRepository.save(srilankaTeam);

    }

    private List<Player> createBangladeshiPlayers(Team team) {
        Player tamimIqbal = Player.playerBuilder()
                .setFirstName("Tamim")
                .setLastName("Iqbal")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(LEFT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player shakib = Player.playerBuilder()
                .setFirstName("Shakib Al")
                .setLastName("Hasan")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(LEFT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player mushfiq = Player.playerBuilder()
                .setFirstName("Mushfiqur")
                .setLastName("Rahim")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        return Arrays.asList(tamimIqbal, shakib, mushfiq);
    }

    private List<Player> createIndianPlayers(Team team) {
        Player tamimIqbal = Player.playerBuilder()
                .setFirstName("Virat")
                .setLastName("Kohli")
                .setDateOfBirth(getDate("1987-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player shakib = Player.playerBuilder()
                .setFirstName("Rohit")
                .setLastName("Sharma")
                .setDateOfBirth(getDate("1985-12-21"))
                .setBattingStyle(LEFT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player mushfiq = Player.playerBuilder()
                .setFirstName("Mahendra Singh")
                .setLastName("Dhoni")
                .setDateOfBirth(getDate("1980-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        return Arrays.asList(tamimIqbal, shakib, mushfiq);
    }

    private List<Player> createPakistaniPlayers(Team team) {
        Player tamimIqbal = Player.playerBuilder()
                .setFirstName("Misbah Ul")
                .setLastName("Haque")
                .setDateOfBirth(getDate("1978-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player shakib = Player.playerBuilder()
                .setFirstName("Shahid")
                .setLastName("Afridi")
                .setDateOfBirth(getDate("1979-12-21"))
                .setBattingStyle(LEFT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player mushfiq = Player.playerBuilder()
                .setFirstName("Umar")
                .setLastName("Akmal")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        return Arrays.asList(tamimIqbal, shakib, mushfiq);
    }

    private List<Player> createSrilankanPlayers(Team team) {
        Player tamimIqbal = Player.playerBuilder()
                .setFirstName("Sanath")
                .setLastName("Jayasuriya")
                .setDateOfBirth(getDate("1975-12-21"))
                .setBattingStyle(LEFT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player shakib = Player.playerBuilder()
                .setFirstName("Aravinda Di")
                .setLastName("Silva")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        Player mushfiq = Player.playerBuilder()
                .setFirstName("Chamara")
                .setLastName("Silva")
                .setDateOfBirth(getDate("1990-12-21"))
                .setBattingStyle(RIGHT_HANDED)
                .setTotalMatches(200)
                .setTotalInnings(200)
                .setNotOuts(10)
                .setTotalRuns(5000)
                .setHighestScore(154)
                .setFifties(30)
                .setHundreds(7)
                .setTeam(team);

        return Arrays.asList(tamimIqbal, shakib, mushfiq);
    }

    private Date getDate(String dateString) {
        try {
            return DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

}
