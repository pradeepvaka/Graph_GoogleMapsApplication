package roadgraph;

import geography.GeographicPoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import roadgraph.MapEdge;

public class MapNode {
	
	private GeographicPoint location;
    private Set<MapEdge> edges;

    public MapNode(GeographicPoint location) {
        this.location = location;
        edges = new HashSet<>();
    }

    /**
     * Add an edge which is connected to node
     * @param edge MapEdge connected to node
     * @return boolean
     */
    public boolean addEdge(MapEdge edge) {
        return this.edges.add(edge);
    }

    /**
     * Check whether a node contains an edge
     * @param edge MapEdge to check
     * @return boolean
     */
    public boolean containsEdge(MapEdge edge) {
        return edges.contains(edge);
    }

    /**
     * Return all edges connected to node
     * @return boolean
     */
    public Set<MapEdge> getEdges() {
        return this.edges;
    }

    /**
     * Getter for this nodes location
     * @return GeographicPoint
     */
    public GeographicPoint getLocation() {
        return this.location;
    }
}
