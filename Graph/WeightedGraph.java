
package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Edge {
    String destination; // Node tujuan dari edge
    int weight; // Bobot (weight) dari edge

    // Konstruktor untuk membuat objek Edge
    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

// Class untuk merepresentasikan weighted graph
class WeightedGraph {
    private Map<String, List<Edge>> adjacencyList; // Struktur data untuk menyimpan adjacency list

    // Konstruktor untuk inisialisasi weighted graph
    public WeightedGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node ke dalam weighted graph
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge (sisi) ke dalam weighted graph
    public void addEdge(String source, String destination, int weight) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());

        // Menambahkan edge baru ke dalam list edge pada node source
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    // Menampilkan isi weighted graph
    public void printGraph() {
        for (String node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (Edge edge : adjacencyList.get(node)) {
                System.out.print(edge.destination + "(" + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    // Metode utama untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek WeightedGraph
        WeightedGraph graph = new WeightedGraph();

        // Menambahkan node-node ke dalam graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Menambahkan edge-edge ke dalam graph dengan bobot
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 3);
        graph.addEdge("B", "C", 2);
        graph.addEdge("C", "D", 4);

        // Menampilkan isi graph
        graph.printGraph();
    }
}