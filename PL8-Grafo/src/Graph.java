import java.util.*;
import java.lang.String;

public class Graph {
    private List<Edge> edge;

    public Graph() {
        this.edge = new ArrayList<>();
    }

    public Collection<Vertice> getVertices() {
        ArrayList<Vertice> vertices = new ArrayList<>();
        for (Edge edge : edge) {
            vertices.add(edge.getOrigem());
            vertices.add(edge.getDestino());
        }
        return vertices;
    }

    public Set<Vertice> getVerticesConnectedTo(Vertice v) {
        Set<Vertice> verticesConectados = new HashSet<>();
        for (Edge edge : edge) {
            if (edge.getOrigem().equals(v)) {
                verticesConectados.add(edge.getDestino());
            }
        }
        return verticesConectados;
    }

    // Outros métodos da classe Graph...
}
