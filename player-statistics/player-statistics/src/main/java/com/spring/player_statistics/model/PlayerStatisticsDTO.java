package com.spring.player_statistics.model;

public class PlayerStatisticsDTO {
    private int memberTeams;
    private int numberPlayers;
    private String country;

    public PlayerStatisticsDTO(int memberTeams, int numberPlayers, String country) {
        this.memberTeams = memberTeams;
        this.numberPlayers = numberPlayers;
        this.country = country;
    }

    public int getMemberTeams() {
        return memberTeams;
    }

    public void setMemberTeams(int memberTeams) {
        this.memberTeams = memberTeams;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
