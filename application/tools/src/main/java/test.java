import java.net.MalformedURLException;
import java.net.URL;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.impl.Ping;
import io.battlearena.leekhub.model.webscript.response.impl.Pong;
import io.battlearena.leekhub.tools.webscript.client.impl.SimpleWSClient;

public class test {

	public static void main(String[] args) throws MalformedURLException, WebScriptException {
		SimpleWSClient<Ping, String> wsc = new SimpleWSClient<>();
		URL address = new URL("http://www.battlearena.io/test-ws/ping");
		Ping query;
		query = new Ping();
		Pong response;
		response = (Pong) wsc.get(address, query, "io.battlearena.leekhub.model.webscript.response.impl.Pong");
		System.out.println(response.getText());
	}

}
