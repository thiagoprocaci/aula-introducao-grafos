package com.tbp;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    List<Aresta> listaAresta;

    public List<No> vizinhos(No no) {
        List<No> nosVizinhos = new ArrayList<No>();
        for(Aresta aresta: listaAresta) {
            if(aresta.origem.equals(no)) {
                nosVizinhos.add(aresta.destino);
            } else if(aresta.destino.equals(no)) {
                nosVizinhos.add(aresta.origem);
            }
        }
        return nosVizinhos;
    }



    public Grafo() {
        listaAresta = new ArrayList<Aresta>();
    }

    public void adicionarAresta(Aresta aresta) {
        listaAresta.add(aresta);
    }



}



