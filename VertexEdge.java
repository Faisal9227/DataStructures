import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Vertex {
	String vname;
	ArrayList<Vertex> red = new ArrayList<Vertex>();
	ArrayList<Vertex> black = new ArrayList<Vertex>();

	public Vertex(String vname) {
		this.vname = vname;
	}
}

class Edge {
	Vertex v1;
	HashMap<Vertex, Integer> red = new HashMap<Vertex, Integer>();
	HashMap<Vertex, Integer> black = new HashMap<Vertex, Integer>();
	char color;

	public Edge(Vertex v1) {
		this.v1 = v1;
	}
}

public class VertexEdge {

	static Vertex v1 = new Vertex("v1");
	static Vertex v2 = new Vertex("v2");
	static Vertex v3 = new Vertex("v3");
	static Vertex v4 = new Vertex("v4");
	static Vertex v5 = new Vertex("v5");
	static Vertex v6 = new Vertex("v6");

	public static void main(String args[]) {

		v1.black.add(v2);
		v2.red.add(v3);
		v2.red.add(v5);
		v2.black.add(v4);
		v3.black.add(v4);
		v4.red.add(v5);
		v4.red.add(v6);
		v5.red.add(v6);

		System.out.println("Finding v1 to v6");
		if(findroute(v1, v6, 'b')){
			
		}
	}

	private static boolean findroute(Vertex start, Vertex dest, char next) {
		System.out.println(start.vname + "------" + dest.vname);
		if (next == 'r') {
			if (start.red.contains(dest)) {
				System.out.println("Route found");
				return true;
			}
			for (int i = 0; i < start.red.size(); i++) {
				if(findroute((Vertex) start.red.get(i), dest, 'b'))
					return true;
			}
		}
		if (next == 'b') {
			if (start.black.contains(dest)) {
				System.out.println("Route found");
				return true;
			}
			for (int i = 0; i < start.black.size(); i++) {
				if(findroute((Vertex) start.black.get(i), dest, 'r'))
					return true;
			}
		}
		return false;
	}
}
