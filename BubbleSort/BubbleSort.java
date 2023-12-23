import java.util.Arrays;

class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;

        System.out.print("[");
        for(int i = 0; i < n; i++) {

            if(i < n -1) {
                System.out.print(arr[i] + ", ");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
    
public static void main(String[] args) {      

        System.out.println("");
        System.out.println("BUBBLE SORT\n");

        BubbleSort obj = new BubbleSort();
        int arr[] = {54, 24, 35, 22, 10, 15, 80};

        System.out.println("Array Awal ");
        System.out.println(Arrays.toString(arr));
        System.out.print("");

        obj.bubbleSort(arr);
        System.out.println("Array Urut ");
        obj.printArray(arr);
        
    }

}