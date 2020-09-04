package com.lening.mapper;

import com.lening.entity.Player;
import com.lening.entity.School;
import com.lening.entity.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {

    List<Player> getPlayer();

    void deletePlayer(@Param("id") Integer id);

    List<School> getSchool();

    List<Team> getTeam();

    void save( Player player);

    void getSss(@Param("pname") String pname);
}
