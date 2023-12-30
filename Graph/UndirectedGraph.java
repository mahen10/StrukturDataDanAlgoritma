package Graph;
import java.util.*;

// Class untuk merepresentasikan graph tidak berarah (undirected graph)
class UndirectedGraph {
    private Map<String, List<String>> adjacencyList; // Struktur data untuk menyimpan adjacency list

    // Konstruktor untuk inisialisasi undirected graph
    public UndirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    // Menambahkan node ke dalam undirected graph
    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    // Menambahkan edge (sisi) ke dalam undirected graph
    public void addEdge(String source, String destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());

        // Menambahkan edge (sisi) dari source ke destination dan sebaliknya
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    // Mendapatkan tetangga-tetangga (neighbors) dari suatu node
    public List<String> getNeighbors(String node) {
        return adjacencyList.getOrDefault(node, Collections.emptyList());
    }

    // Menampilkan isi undirected graph
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
        // Membuat objek UndirectedGraph
        UndirectedGraph graph = new UndirectedGraph();

        // Menambahkan node-node ke dalam graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Menambahkan edge-edge ke dalam graph
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");

        // Menampilkan isi graph
        graph.printGraph();
    }
}

