package com.football.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quarterbacks")
public class Quarterbacks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quarterback_id;
    private String player_name;
    private String team_name;
    private String espn_headshot_url;
    private String yahoo_proj;
    private String espn_proj;
    private String sleeper_proj;
    private int team_id;

    public int getQuarterback_id() {
        return quarterback_id;
    }

    public void setQuarterback_id(int quarterback_id) {
        this.quarterback_id = quarterback_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getEspn_headshot_url() {
        return espn_headshot_url;
    }

    public void setEspn_headshot_url(String espn_headshot_url) {
        this.espn_headshot_url = espn_headshot_url;
    }

    public String getYahoo_proj() {
        return yahoo_proj;
    }

    public void setYahoo_proj(String yahoo_proj) {
        this.yahoo_proj = yahoo_proj;
    }

    public String getEspn_proj() {
        return espn_proj;
    }

    public void setEspn_proj(String espn_proj) {
        this.espn_proj = espn_proj;
    }

    public String getSleeper_proj() {
        return sleeper_proj;
    }

    public void setSleeper_proj(String sleeper_proj) {
        this.sleeper_proj = sleeper_proj;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
