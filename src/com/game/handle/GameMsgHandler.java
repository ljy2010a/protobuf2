package com.game.handle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.game.protobuf.GameProto;

public class GameMsgHandler {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void GameMsgHandle(GameProto.GameMsg agr_GameMsg)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException,
			SecurityException, InstantiationException, ClassNotFoundException {
		
		String ActionPath = agr_GameMsg.getMsgType();
		System.out.println("ActionPath : " + ActionPath);
		
// TODO: maybe get more detail value for the method
//		String[] subPaths = ActionPath.split("\\.");
//		for (int i = 0; i < subPaths.length; i++) {
//			System.out.println(subPaths[i]);
//		}		


		Class<?> c = Class.forName("com.game." + ActionPath);
		
		
//		Object invokeTester = c.newInstance();
		// 调用InvokeTester对象的add()方法
		for(int i = 0 ; i<c.getMethods().length; i++ ){			
			System.out.println(c.getMethods()[i].getName());
		}
		Method method = c.getMethod("call");
		
		
		
		
//		Object result = method.invoke(invokeTester, agr_GameMsg);
//		System.out.println(result);
//		Class<?> debugSwitcherClass = Class.forName("com.game." + ActionPath);
//	for(int i = 0 ; i<debugSwitcherClass.getMethods().length; i++ ){			
//	System.out.println(debugSwitcherClass.getMethods()[i].getName());
//}
//        debugSwitcherClass.getMethod("call").invoke(agr_GameMsg);
	}

}

