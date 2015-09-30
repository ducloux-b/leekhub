package io.battlearena.leekhub.tools.singleton;

import javax.ws.rs.client.Client;

import io.battlearena.leekhub.tools.client.BattlearenaIo_TestWs;

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
					INSTANCE = BattlearenaIo_TestWs.createClient();
				}
			}
		}
		return INSTANCE;
	}
	
}
