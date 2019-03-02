package roadgraph;

import geography.GeographicPoint;
import java.util.ArrayList;
import java.util.List;
import roadgraph.MapEdge;

public class MapNode {
	
	private GeographicPoint location;
	private List<MapEdge> edges;
	
	public MapNode(GeographicPoint p) {
		
		location = new GeographicPoint(p.x,p.y);
		edges = new ArrayList<MapEdge>();
	}
	
	public void addEdge(MapEdge m) {
		edges.add(m);
	}
	
	public int numEdges() {
		
		
		return edges.size();
	}
	
	
}
