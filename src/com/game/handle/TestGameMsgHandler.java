package com.game.handle;

import java.lang.reflect.InvocationTargetException;

import com.game.gameObj.Soldier;
import com.game.gameObj.bufBuilder.GameMsgBuilder;
import com.game.gameObj.bufBuilder.SoldierBuilder;
import com.game.protobuf.GameProto;
import com.game.protobuf.GameProto.GameMsg;
import com.google.protobuf.InvalidProtocolBufferException;

public class TestGameMsgHandler {

	/**
	 * @param args
	 * @throws InvalidProtocolBufferException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws InvalidProtocolBufferException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Soldier soldier = new Soldier(); 
		
		byte[] bytes= GameMsgBuilder.buildGameMsg(SoldierBuilder.getGameAction("update", soldier),"Notice.GameAction");
		
		GameMsg builder = GameProto.GameMsg.parseFrom(bytes);
		
		GameMsgHandler.GameMsgHandle(builder);
		
	}

}
