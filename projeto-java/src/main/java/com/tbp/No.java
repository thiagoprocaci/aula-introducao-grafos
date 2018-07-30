package com.tbp;

import java.util.ArrayList;
import java.util.List;

public class No {
    int id;
    String nome;

    public No(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public static void main(String... args) {

        No maria = new No(1, "Maria");
        No rita = new No(2, "Rita");
        No joao = new No(3, "João");
        No jose = new No(4, "José");
        No mauro = new No(5, "Mauro");
        No jorge = new No(6, "Jorge");


        Aresta mariaRita = new Aresta(maria, rita);
        Aresta ritaJoao = new Aresta(rita, joao);
        Aresta ritaJorge = new Aresta(rita, jorge);
        Aresta joaoJose = new Aresta(joao, jose);
        Aresta joseMauro = new Aresta(jose, mauro);
        Aresta jorgeMauro = new Aresta(jorge, mauro);

        Grafo grafo = new Grafo();
        grafo.adicionarAresta(mariaRita);
        grafo.adicionarAresta(ritaJoao);
        grafo.adicionarAresta(ritaJorge);
        grafo.adicionarAresta(joaoJose);
        grafo.adicionarAresta(joseMauro);
        grafo.adicionarAresta(jorgeMauro);


        List<No> recomendacaoAmizade = new ArrayList<No>();
        List<No> vizinhosDeRita = grafo.vizinhos(rita);
        for(No vizinhoRita: vizinhosDeRita) {
            List<No> vizinhosDoVizinhoDeRita = grafo.vizinhos(vizinhoRita);
            for(No no: vizinhosDoVizinhoDeRita) {
                if(!rita.equals(no)) {
                    recomendacaoAmizade.add(no);
                    System.out.println(no.nome);
                }
            }
        }

    }

    @Override
    public String toString() {
        return "No{" +
                "nome='" + nome + '\'' +
                '}';
    }
}


