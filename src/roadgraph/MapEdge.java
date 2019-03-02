package roadgraph;

import java.util.List;
import java.util.ArrayList;
import geography.GeographicPoint;



public class MapEdge {

	private GeographicPoint startv,endv;
	private String roadname;
	private String roadt;
	private double roadl;
	
	public MapEdge(GeographicPoint startv, GeographicPoint endv, String stname,
			double roadlen, String roadtype) {
		
		startv = new GeographicPoint(startv.x,startv.y);
		endv = new GeographicPoint(endv.x,endv.y);
		roadname = stname;
		roadt = roadtype;
		roadl = roadlen;
		
		
	}
}
