package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CRICKET_PLAYERS")
public class Player {
	@Id
	@Column(name="PLAYER_ID")
	private Integer  playerid;
	
	@Column(name="PLAYER_NAME")
	private String playerName;
	
	@Column(name="PLAYER_AGE")
	private Integer playerage;
	private String location;
	public Integer getPlayerid() {
		return playerid;
	}
	public void setPlayerid(Integer playerid) {
		this.playerid = playerid;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerage() {
		return playerage;
	}
	public void setPlayerage(Integer playerage) {
		this.playerage = playerage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playerName=" + playerName + ", playerage=" + playerage
				+ ", location=" + location + "]";
	}
	
	

}
