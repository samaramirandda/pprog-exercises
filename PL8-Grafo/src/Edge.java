
public class Edge {
    private Vertice origem;
    private Vertice destino;
    private int distancia;

    public Edge(Vertice origem, Vertice destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public int getDistancia() {
        return distancia;
    }
}