package com.spring.player_statistics.controller;

import com.spring.player_statistics.model.PlayerStatisticsDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/players-management")
public class PlayerStatisticsController {

    @Value("${player.statistics.memberTeams}")
    private int memberTeams;
    @Value("${player.statistics.numberPlayers}")
    private int numberPlayers;
    @Value("${player.statistics.country}")
    private String country;

    @GetMapping("/statistics")
    public PlayerStatisticsDTO getPlayerStatistics() {
        return new PlayerStatisticsDTO(memberTeams, numberPlayers, country);
    }

}
