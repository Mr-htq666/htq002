package com.lening.controller;

import com.lening.entity.Player;
import com.lening.entity.School;
import com.lening.entity.Team;
import com.lening.service.PlayerService;
import com.lening.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/pc")
public class PlayerController {
    @Resource
    private PlayerService playerService;
    @RequestMapping("/getPlayer")
    public List<Player> getPlayer(){
        List<Player> list = playerService.getPlayer();
        return list;
    }
    @RequestMapping("/deletePlayer")
    public Result deletePlayer(@RequestBody Integer[] ids){
        try {
            playerService.deletePlayer(ids);
            return new Result(true,"删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"删除失败");
        }

    }
    @RequestMapping("/getSchool")
    public List<School> getSchool(){
        List<School> slist = playerService.getSchool();
        return slist;
    }
    @RequestMapping("/getTeam")
    public List<Team> getTeam(){
        List<Team> tlist = playerService.getTeam();
        return tlist;
    }
    @RequestMapping("/save")
    public Result save(@RequestBody Player player){
        try {
            playerService.save(player);
            return new Result(true,"新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"新增失败");
        }
    }
    @RequestMapping("/getSss")
    public Result getSss(@RequestBody Player player){

        try {

            return new Result(true,"名称存在");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"可以使用");
        }
    }
}
