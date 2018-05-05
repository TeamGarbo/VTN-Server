package message;

import java.io.Serializable;

public abstract class Message implements Serializable{

	String playerID;

	public Message(	String playerID){
		this.playerID = playerID;
	}
	public String getPlayerID() {
		return playerID;
	}
	
}
