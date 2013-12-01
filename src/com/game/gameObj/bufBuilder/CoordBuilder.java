package com.game.gameObj.bufBuilder;

import com.game.protobuf.GameProto;

public class CoordBuilder {

	public static GameProto.Coordinate.Builder buildCoord(long x,long y,long z){
		GameProto.Coordinate.Builder builder = GameProto.Coordinate.newBuilder();
		builder.setX(x);
		builder.setY(y);
		builder.setZ(z);
		return builder;		
	}
	
}
