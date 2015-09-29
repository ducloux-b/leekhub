package io.battlearena.leekhub.tools.graphe;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class GraphLeek
	{
	DefaultDirectedWeightedGraph<NodeLeek,DefaultWeightedEdge> graph= new DefaultDirectedWeightedGraph<NodeLeek,DefaultWeightedEdge>(DefaultWeightedEdge.class);
	List<NodeLeek> nodes = new ArrayList<NodeLeek>();
	
	public GraphLeek(	List<NodeLeek> nodes, List<ArrayList<NodeLeek>> edges,
						double[] weights)
		{
		this.setGraph(nodes, edges, weights);
		}

	private void setGraph(	List<NodeLeek> nodes,
							List<ArrayList<NodeLeek>> edges,
							double[] weights)
		{
		this.graph = new DefaultDirectedWeightedGraph<NodeLeek,DefaultWeightedEdge>(DefaultWeightedEdge.class);
		this.nodes = nodes;
		for(NodeLeek node: nodes)
			{
			this.graph.addVertex(node);
			}
		int i= 0;
		for(ArrayList<NodeLeek> edge: edges)
			{
			DefaultWeightedEdge weightedEdge= new DefaultWeightedEdge();
			this.graph.addEdge(edge.get(0), edge.get(1), weightedEdge);
			this.graph.setEdgeWeight(weightedEdge, weights[i]);
			i++;
			}
		}

	public DefaultDirectedWeightedGraph<NodeLeek,DefaultWeightedEdge> getGraph()
		{
		return this.graph;
		}

	public GraphPath<NodeLeek,DefaultWeightedEdge> getShortestPath(NodeLeek startVertex, NodeLeek endVertex)
	{
		DijkstraShortestPath<NodeLeek,DefaultWeightedEdge> shortestPath = new DijkstraShortestPath<NodeLeek,DefaultWeightedEdge>(this.getGraph(), startVertex, endVertex);
		return (shortestPath.getPath());
	}
	
	public double getWeightOfShortestPath(NodeLeek startVertex, NodeLeek endVertex)
		{
			DijkstraShortestPath<NodeLeek,DefaultWeightedEdge> shortestPath = new DijkstraShortestPath<NodeLeek,DefaultWeightedEdge>(this.getGraph(), startVertex, endVertex);
			return (shortestPath.getPathLength());
		}

	public List<NodeLeek> getNodes()
		{
		return this.nodes;
		}
	
	public NodeLeek getNode(NodeLeek searchedNode){
		NodeLeek result = null;
		for(NodeLeek node: this.getNodes())
			{
			if(searchedNode.equals(node))
			{
			result = node;
			break;
			}
			}
		return result;
	}
}
