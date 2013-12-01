package com.game.Response;

import com.game.protobuf.GameProto;

public class LoginResponse {

	public void call(GameProto.GameMsg agr_GameMsg){
		System.out.println("LoginResponse call");		
	}
}
