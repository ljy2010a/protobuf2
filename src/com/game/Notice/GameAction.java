package com.game.Notice;

import com.game.protobuf.GameProto;

public class GameAction {

	public void append(GameProto.GameMsg agr_GameMsg){
		System.out.println("append");
	}	
	
	public void delete(GameProto.GameMsg agr_GameMsg){
		System.out.println("delete");
	}	
	
	public void update(GameProto.GameMsg agr_GameMsg){
		System.out.println("update");
	}	
	
	public void get(GameProto.GameMsg agr_GameMsg){
		System.out.println("get");
	}
	
	public static void call(GameProto.GameMsg agr_GameMsg){
		System.out.println("GameAction call");
		//TODO:  reflect to detail gameObj and func  
	}
	
}
