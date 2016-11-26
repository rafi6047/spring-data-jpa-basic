package com.bips.javaday.springDataJpaBasic.repository;

import com.bips.javaday.springDataJpaBasic.entity.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rafi on 2016-11-14.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

    Long countByLastName(String lastname);
    Long countByLastNameIgnoreCase(String lastname);

    List<Player> deleteByLastName(String lastname);
    List<Player> removeByLastNameIgnoreCase(String lastname);

    List<Player> findByFirstName(String firstName);
    List<Player> findByLastName(String lastName);
    List<Player> findByFirstNameOrLastName(String firstName, String lastName);
    List<Player> findAllByOrderByLastNameAsc();
    List<Player> findFirst10ByLastName(String lastName);

    @Query("select p from Player p where p.battingStyle = ?1")
    List<Player> getByBattingStyle(String battingStyle);

}
