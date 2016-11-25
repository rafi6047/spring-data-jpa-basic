
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

    @Resource
    private TeamRepository teamRepository;

    @Resource
    private PlayerRepository playerRepository;

    @Transactional
    public void runQueries() {

    }

}
