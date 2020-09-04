package com.lening.service.impl;

import com.lening.entity.Player;
import com.lening.entity.School;
import com.lening.entity.Team;
import com.lening.mapper.PlayerMapper;
import com.lening.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Resource
    private PlayerMapper playerMapper;

    @Override
    public List<Player> getPlayer() {
        return playerMapper.getPlayer();
    }

    @Override
    public void deletePlayer(Integer[] ids) {
        if(ids!=null&&ids.length>=1){
            for (Integer id : ids) {
                playerMapper.deletePlayer(id);
            }
        }
    }

    @Override
    public List<School> getSchool() {
        return playerMapper.getSchool();
    }

    @Override
    public List<Team> getTeam() {
        return playerMapper.getTeam();
    }

    @Override
    public void save(Player player) {
        playerMapper.save(player);
    }


}
