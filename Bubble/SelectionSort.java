package Bubble;
// Metode untuk mengurutkan array integer dalam urutan menurun menggunakan algoritma Selection Sort.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        // Panggil metode untuk melakukan selection sort
        selectionSort(arr);

        // Tampilkan array setelah diurutkan
        System.out.println("Array setelah diurutkan:");
        printArray(arr);
    }

    // Metode untuk melakukan selection sort pada array
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterasi melalui seluruh elemen array
        for (int i = 0; i < n-1; i++) {
            // Temukan nilai minimum dalam sisa array yang belum diurutkan
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen minimum dengan elemen pertama yang belum diurutkan
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Metode untuk menampilkan elemen-elemen array
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
