import java.net.MalformedURLException;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.impl.GetBoard;
import io.battlearena.leekhub.model.webscript.query.impl.GetIdEquipe;
import io.battlearena.leekhub.model.webscript.query.impl.Ping;
import io.battlearena.leekhub.model.webscript.response.impl.BoardResponse;
import io.battlearena.leekhub.model.webscript.response.impl.IdEquipe;
import io.battlearena.leekhub.model.webscript.response.impl.Pong;
import io.battlearena.leekhub.tools.webscript.client.impl.SimpleWSClient;

public class test {

	public static void main(String[] args) throws MalformedURLException, WebScriptException {
		SimpleWSClient<Ping, String> wsc = new SimpleWSClient<>();
		Ping query;
		query = new Ping();
		Pong response;
		response = (Pong) wsc.call(query);
		System.out.println(response.getText());
		
		GetIdEquipe bquery = new GetIdEquipe("leekhub","1234");
		SimpleWSClient<GetIdEquipe, String> bwsc = new SimpleWSClient<>();
		IdEquipe bresponse = (IdEquipe) bwsc.call(bquery);
		System.out.println(bresponse.getIdEquipe());
		
		GetBoard cquery = new GetBoard(bresponse.getIdEquipe());
		SimpleWSClient<GetBoard, Board> cwsc = new SimpleWSClient<>();
		BoardResponse cresponse = (BoardResponse) cwsc.call(cquery);
		cresponse.displayResult();
	}

}
