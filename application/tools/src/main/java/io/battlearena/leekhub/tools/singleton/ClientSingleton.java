package io.battlearena.leekhub.tools.singleton;

import com.sun.jersey.api.client.Client;

import io.battlearena.leekhub.tools.client.IP521913975_BattleWs;

public class ClientSingleton {
	
	private static Client INSTANCE = null;
 
	public static Client getInstance()
	{	
		if (INSTANCE == null)
		{ 	
			synchronized(Client.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = IP521913975_BattleWs.createClient();
				}
			}
		}
		return INSTANCE;
	}
	
}
