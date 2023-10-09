package exercicio1;

public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo(); // constroi grafo
		
		Grafo.Vertice v1, v2, v3, v4, v5; // declara vertices
		
		Grafo.Aresta a12, a15; // define as arestas
		Grafo.Aresta a21, a23, a24, a25;
		Grafo.Aresta a32, a34;
		Grafo.Aresta a42, a43, a45;
		Grafo.Aresta a51, a52, a54;
		
		v1 = grafo.AdicionaVertice(1);
		v2 = grafo.AdicionaVertice(2);
		v3 = grafo.AdicionaVertice(3);
		v4 = grafo.AdicionaVertice(4);
		v5 = grafo.AdicionaVertice(5);
		
		a12 = grafo.AdicionaAresta(v1, v2); // define as arestas que se encontram
		a15 = grafo.AdicionaAresta(v1, v5);
		
		a21 = grafo.AdicionaAresta(v2, v1);
		a23 = grafo.AdicionaAresta(v2, v3);
		a24 = grafo.AdicionaAresta(v2, v4);
		a25 = grafo.AdicionaAresta(v2, v5);
		
		a32 = grafo.AdicionaAresta(v3, v2);
		a34 = grafo.AdicionaAresta(v3, v4);
		
		a42 = grafo.AdicionaAresta(v4, v2);
		a43 = grafo.AdicionaAresta(v4, v3);
		a45 = grafo.AdicionaAresta(v4, v5);
		
		a51 = grafo.AdicionaAresta(v5, v1);
		a52 = grafo.AdicionaAresta(v5, v2);
		a54 = grafo.AdicionaAresta(v5, v4);
		
		System.out.print(grafo.ImprimeGrafo());

  }
}
