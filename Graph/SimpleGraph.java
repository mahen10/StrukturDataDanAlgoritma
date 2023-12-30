package Graph;
import java.util.*;

// Class untuk merepresentasikan graph sederhana (unweighted, directed)
class SimpleGraph {
    private Map<Integer, List<Integer>> adjacencyList; // Struktur data untuk menyimpan adjacency list

    // Konstruktor untuk inisialisasi graph
    public SimpleGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node ke dalam graph
    public void addNode(Integer node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge (sisi) ke dalam graph
    public void addEdge(int source, int destination) {
        // Menambahkan destination ke dalam list neighbors pada node source
        adjacencyList.get(source).add(destination);
    }

    // Mendapatkan tetangga (neighbors) dari suatu node
    public List<Integer> getNeighbors(int node) {
        // Mengembalikan list neighbors dari node, atau list kosong jika node tidak ada
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    // Mencetak isi graph
    public void printGraph() {
        for (int node : adjacencyList.keySet()) {
            System.out.print("Node " + node + " terhubung dengan: ");
            for (int neighbor : adjacencyList.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Metode utama untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek SimpleGraph
        SimpleGraph graph = new SimpleGraph();

        // Menambahkan node-node ke dalam graph
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);

        // Menambahkan edge-edge ke dalam graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);

        // Menampilkan isi graph
        graph.printGraph();
    }
}
