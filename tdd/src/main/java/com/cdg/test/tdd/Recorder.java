package com.cdg.test.tdd;

public class Recorder {
	
	public void speak(Player player,FraudPlayer fplayer){
		System.out.println(player.getName()+player.getScore()+fplayer.getName()+fplayer.getScore());
	}
}
