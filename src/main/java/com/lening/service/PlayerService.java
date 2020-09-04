package com.lening.service;

import com.lening.entity.Player;
import com.lening.entity.School;
import com.lening.entity.Team;

import java.util.List;

public interface PlayerService {
    List<Player> getPlayer();

    void deletePlayer(Integer[] ids);

    List<School> getSchool();

    List<Team> getTeam();

    void save(Player player);


}
