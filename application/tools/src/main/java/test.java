import java.net.MalformedURLException;

import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.impl.GetIdEquipe;
import io.battlearena.leekhub.model.webscript.query.impl.Ping;
import io.battlearena.leekhub.model.webscript.response.impl.IdEquipe;
import io.battlearena.leekhub.model.webscript.response.impl.Pong;
import io.battlearena.leekhub.tools.webscript.client.impl.SimpleWSClient;

public class test {

	public static void main(String[] args) throws MalformedURLException, WebScriptException {
		SimpleWSClient<Ping, String> wsc = new SimpleWSClient<>();
		Ping query;
		query = new Ping();
		Pong response;
		response = (Pong) wsc.get(query, "io.battlearena.leekhub.model.webscript.response.impl.Pong");
		System.out.println(response.getText());
		
		GetIdEquipe bquery = new GetIdEquipe("leekhub","1234");
		SimpleWSClient<GetIdEquipe, String> bwsc = new SimpleWSClient<GetIdEquipe, String>();
		IdEquipe bresponse = (IdEquipe) bwsc.get(bquery, "io.battlearena.leekhub.model.webscript.response.impl.IdEquipe");
		System.out.println(bresponse.getIdEquipe());
	}

}
