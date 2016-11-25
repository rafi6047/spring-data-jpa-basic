package com.bips.javaday.springDataJpaBasic.repository;

import com.bips.javaday.springDataJpaBasic.entity.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import static sun.audio.AudioPlayer.player;

/**
 * Created by Rafi on 2016-11-14.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {


}
