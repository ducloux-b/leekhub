import javax.ws.rs.client.Client;

import io.battlearena.client.BattlearenaIo_TestWs;
import io.battlearena.client.BattlearenaIo_TestWs.Root;
import io.battlearena.client.BattlearenaIo_TestWs.Root.GameBoardIdPartie;
import io.battlearena.client.BattlearenaIo_TestWs.Root.Ping;

public class App {
	
	public static void main(String args[]) {
		Client client = BattlearenaIo_TestWs.createClient();
		Root root = BattlearenaIo_TestWs.root(client, BattlearenaIo_TestWs.BASE_URI);
		Ping ping = root.ping();
		System.out.println(ping.getAsTextPlain(String.class));
		GameBoardIdPartie idPartie = root.gameBoardIdPartie("dkl");
		System.out.println(idPartie.getAs(String.class));
	}
}
