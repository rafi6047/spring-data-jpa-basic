package com.bips.javaday.springDataJpaBasic.repository;

import com.bips.javaday.springDataJpaBasic.entity.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rafi on 2016-11-14.
 */
@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

    List<Team> findByName(String name);
    List<Team> findTeamByPlayersFirstName(String name);
    List<Team> findTeamByPlayersFirstNameStartingWith(String name);
    List<Team> findTeamByPlayersFirstNameContaining(String name);

}
