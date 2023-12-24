public class BubbleSort {

    //fungsi untuk memproses bubblesort
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1; j++) 
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j] = temp;
                }
    }

    // fungsi untuk memprint array
    void printArray(int arr[]) {
        int n = arr.length; //panjang array = 7
        for (int i = 0; i < n; i++) 
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    //output
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {54, 24, 35, 22, 10, 15, 80};

        System.out.println("Array Sebelum Diurutkan");
        obj.printArray(arr);

        //calling fungsi bubblesort
        obj.bubbleSort(arr);

        System.out.println("Array Sesudah Diurutkan");
        obj.printArray(arr);
    }
}
