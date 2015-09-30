package io.battlearena.leekhub.tools.singleton;

import com.sun.jersey.api.client.Client;

import io.battlearena.leekhub.tools.client.IP521913975_BattleWs;
import io.battlearena.leekhub.tools.client.IP521913975_BattleWs.Duel;

public class RootSingleton {
	
	private static Duel INSTANCE = null;
 
	public static Duel getInstance(Client client)
	{	
		if (INSTANCE == null)
		{ 	
			synchronized(Client.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = IP521913975_BattleWs.duel(client, IP521913975_BattleWs.BASE_URI);
				}
			}
		}
		return INSTANCE;
	}
	
}
