import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import io.battlearena.leekhub.model.entity.Board;
import io.battlearena.leekhub.model.exception.webscript.WebScriptException;
import io.battlearena.leekhub.model.webscript.query.impl.GetBoard;
import io.battlearena.leekhub.model.webscript.query.impl.GetIdEquipe;
import io.battlearena.leekhub.model.webscript.query.impl.Ping;
import io.battlearena.leekhub.model.webscript.response.impl.BoardResponse;
import io.battlearena.leekhub.model.webscript.response.impl.IdEquipe;
import io.battlearena.leekhub.model.webscript.response.impl.Pong;
import io.battlearena.leekhub.tools.graphe.GraphLeek;
import io.battlearena.leekhub.tools.graphe.NodeLeek;
import io.battlearena.leekhub.tools.webscript.client.impl.SimpleWSClient;

public class test
	{

	public static void main(String[] args)
			throws MalformedURLException, WebScriptException
		{
		SimpleWSClient<Ping,String> wsc= new SimpleWSClient<>();
		Ping query;
		query= new Ping();
		Pong response;
		response= (Pong)wsc.call(query);
		System.out.println(response.getText());

		GetIdEquipe bquery= new GetIdEquipe("leekhub", "1234");
		SimpleWSClient<GetIdEquipe,String> bwsc= new SimpleWSClient<>();
		IdEquipe bresponse= (IdEquipe)bwsc.call(bquery);
		System.out.println(bresponse.getIdEquipe());

		GetBoard cquery= new GetBoard(bresponse.getIdEquipe());
		SimpleWSClient<GetBoard,Board> cwsc= new SimpleWSClient<>();
		BoardResponse cresponse= (BoardResponse)cwsc.call(cquery);
		cresponse.displayResult();

		int nbNodes = 9;
		List<NodeLeek> nodes = new ArrayList<NodeLeek>();
		int length = 3;
		int height = 3;
		for(int i= 0 ; i < length ; i++)
			{
			for(int j= 0 ; j < height ; j++)
			{
			nodes.add(new NodeLeek(j, i));
			System.out.print("("+j+","+i+")");
			}
			System.out.println();
			}
		List<ArrayList<NodeLeek>> edges = new ArrayList<ArrayList<NodeLeek>>();
		for(int i = 1; i<nodes.size()+1 ;i++)//a supposer que l'on commence en haut à gauche
			{
				if((i%length)>0&&i<nbNodes)//on lie la case juste à droite
					{
					ArrayList<NodeLeek> edge = new ArrayList<NodeLeek>();
					edge.add(nodes.get(i-1));
					edge.add(nodes.get(i+1-1));
					edges.add(edge);
					//et inversement
					ArrayList<NodeLeek> reverseEdge = new ArrayList<NodeLeek>();
					reverseEdge.add(nodes.get(i+1-1));
					reverseEdge.add(nodes.get(i-1));
					edges.add(reverseEdge);
					System.out.println("("+nodes.get(i-1).getX()+","+nodes.get(i-1).getY()+")<->("+nodes.get(i+1-1).getX()+","+nodes.get(i+1-1).getY()+")");
					}
				if(((double)i/(double)length)<=height-1)//on lie la case juste en dessous
					{
					ArrayList<NodeLeek> edge = new ArrayList<NodeLeek>();
					edge.add(nodes.get(i-1));
					edge.add(nodes.get(i+length-1));
					edges.add(edge);
					//et inversement
					ArrayList<NodeLeek> reverseEdge = new ArrayList<NodeLeek>();
					reverseEdge.add(nodes.get(i+length-1));
					reverseEdge.add(nodes.get(i-1));
					edges.add(reverseEdge);
					System.out.println("("+nodes.get(i-1).getX()+","+nodes.get(i-1).getY()+")<->("+nodes.get(i+length-1).getX()+","+nodes.get(i+length-1).getY()+")");
					}
			}
		double[] weights = new double[24];
		for(int j= 0 ; j < 24 ; j++)
			{
			weights[j] = j+1;
			}
		GraphLeek graph= new GraphLeek(nodes, edges, weights);
		NodeLeek startVertex = graph.getNode(new NodeLeek(0,0));
		NodeLeek endVertex = graph.getNode(new NodeLeek(2,2));
		
		System.out.println(graph.getGraph().containsVertex(startVertex));
		System.out.println(graph.getGraph().containsVertex(endVertex));
//		DefaultDirectedWeightedGraph<NodeLeek,DefaultWeightedEdge> truc = graph.getGraph();
//		System.out.println(truc.containsVertex(startVertex));
		
		System.out.println("taille:"+graph.getWeightOfShortestPath(startVertex, endVertex));
		}

	}
