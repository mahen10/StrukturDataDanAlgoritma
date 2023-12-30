package Bubble;

public class BubbleSort {
    public static void main(String[] args) {
        // Array yang akan diurutkan
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Memanggil fungsi untuk melakukan Bubble Sort
        bubbleSort(arr);

        // Menampilkan hasil setelah diurutkan
        System.out.println("Array setelah diurutkan:");
        printArray(arr);
    }

    // Fungsi untuk melakukan Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Membandingkan dua elemen berurutan
                // Jika elemen ke-j lebih besar dari elemen ke-(j+1), tukar
                if (arr[j] > arr[j+1]) {
                    // Melakukan pertukaran nilai
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Fungsi untuk menampilkan array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
