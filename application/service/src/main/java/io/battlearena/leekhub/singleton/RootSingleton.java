package io.battlearena.leekhub.singleton;

import javax.ws.rs.client.Client;

import io.battlearena.client.BattlearenaIo_TestWs;
import io.battlearena.client.BattlearenaIo_TestWs.Root;

public class RootSingleton {
	
	private static Root INSTANCE = null;
 
	public static Root getInstance(Client client)
	{	
		if (INSTANCE == null)
		{ 	
			synchronized(Client.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = BattlearenaIo_TestWs.root(client, BattlearenaIo_TestWs.BASE_URI);
				}
			}
		}
		return INSTANCE;
	}
	
}
