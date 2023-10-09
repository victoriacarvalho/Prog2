package exercicio1;

import java.util.List;
import java.util.ArrayList;

public class Grafo 
{
	public class Vertice
	{
		int numero; // variável que receberá a quantidade de vértices do grafo
		List <Aresta> adjacente; //
		
		public Vertice(int numero) // define as vertices
		{
			this.numero = numero; // vertices do grafo
			this.adjacente = new ArrayList<Aresta>(); //array com as adjacências do grafo
		}
		
		void AdicionaAdjacente(Aresta curva) // cria as adjacencias do grafo
		{
			adjacente.add(curva); 
		}
	}
	
	public class Aresta
	{
		Vertice inicio; // define primeira vertice
		Vertice fim; //define ultima vertice
		
		public Aresta(Vertice inicio, Vertice fim)
		{
			this.inicio = inicio;
			this.fim = fim;
		}
	}
	
	List<Vertice> vertices;
	List<Aresta> arestas;
	
	public Grafo() // monta o grafo
	{
		vertices = new ArrayList<Vertice>();
		arestas = new ArrayList<Aresta>();
		
	}
	
	public Vertice AdicionaVertice(int numero) // cria as vertices do grafo
	{
		Vertice vert = new Vertice(numero); 
		vertices.add(vert);
		
		return vert;
	}
	
	public Aresta AdicionaAresta(Vertice inicio, Vertice fim) // cria as arestas
	{
		Aresta curva = new Aresta(inicio, fim);
		inicio.AdicionaAdjacente(curva);
		arestas.add(curva);
		
		return curva;
	}
	
	public String ImprimeGrafo() // imprime
	{
		String nome = "";

		System.out.print(" ");
		for(Vertice vrt : vertices)
		{
			nome += vrt.numero + " > | ";
			for(Aresta curva : vrt.adjacente)
			{
				Vertice vert = curva.fim;
				nome += vert.numero + " | ";
			}
			
			nome += " \n ";
		}
		return nome;
	}
}

