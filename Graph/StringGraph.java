package Graph;

import java.util.*;

// Class untuk merepresentasikan graph dengan tipe data String
class StringGraph {
    private Map<String, List<String>> adjacencyList; // Struktur data untuk menyimpan adjacency list

    // Konstruktor untuk inisialisasi graph
    public StringGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node ke dalam graph
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge (sisi) ke dalam graph
    public void addEdge(String source, String destination) {
        // Menambahkan destination ke dalam list neighbors pada node source
        adjacencyList.get(source).add(destination);
    }

    // Menampilkan isi graph
    public void printGraph() {
        for (String node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (String neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Metode utama untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek StringGraph
        StringGraph graph = new StringGraph();

        // Menambahkan node-node ke dalam graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Menambahkan edge-edge ke dalam graph
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.addEdge("C", "D");

        // Menampilkan isi graph
        graph.printGraph();
    }
}
