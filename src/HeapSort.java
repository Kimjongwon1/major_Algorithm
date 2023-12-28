import java.util.Arrays;

//public class HeapSort {
//    public static void main(String[] args) {
//        int[] arr = {7,6,5,8,3,5,9,1,7};
////        최초 Heap 구성 n/2번만큼 heapify
//        for(int i= (arr.length/2)-1;i>=0;i--){
//            heapify(arr,i);
//        }
//        System.out.println(Arrays.toString(arr));
//    }
////    static void heapify(부모 index){
//////        change 로직 (xx조건)
////
////        if(change 발생){
////            heapify(change가 발생한 부모 index);
////        }
////    }
//static void heapify(int[] arr,int root){
////        change 로직 (xx조건) : left,right 비교하여 자리 change
//    boolean count = false;
//    int temp =0;
//    int next =0;
//    if(arr[(root*2)+1]<arr.length && arr[(root*2)+1]>arr[(root*2)+2]){
//        temp = arr[(root*2)+1];
//        arr[(root*2)+1] = arr[(root*2)+2];
//        arr[(root*2)+2] = temp;
//        next =root+1;
//        count = true;
//    }
//    if(arr[(root*2)+2]<arr.length && arr[(root*2)+1]<arr[(root*2)+2]){
//        temp = arr[(root*2)+2];
//        arr[(root*2)+2] = arr[(root*2)+1];
//        arr[(root*2)+1] = temp;
//       next = root;
//       count = true;
//    }
//
//    if(count == true){
//        heapify(arr,next);
//        }
//    }
//}
import java.util.Arrays;

//public class HeapSort {
//    public static void main(String[] args) {
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 7};
////        최초 Heap 구성 n/2번만큼 heapify
//
//        // Build heap (rearrange array)
//        int n = arr.length;
//        for (int i = n / 2 - 1; i >= 0; i--)
//           // heapify(arr, n, i);
//        heapify_small(arr, n, i);
////        for(int j=0;j<n;j++)
////            heapify(arr, n, i);
////        최소힙구성
//        System.out.println(Arrays.toString(arr));
//    }
//
//    //    static void heapify(부모 index){
//////        change 로직 (xx조건)
////
////        if(change 발생){
////            heapify(change가 발생한 부모 index);
////        }
////    }
//    static void heapify(int[] arr, int n, int i) {
//        int largest = i; // Initialize largest as root
//        int left = 2 * i + 1; // left = 2*i + 1
//        int right = 2 * i + 2; // right = 2*i + 2
//
//        // If left child is larger than root
//        if (left < n && arr[left] > arr[largest])
//            largest = left;
//
//        // If right child is larger than largest so far
//        if (right < n && arr[right] > arr[largest])
//            largest = right;
//
//        // If largest is not root
//        if (largest != i) {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//
//            // Recursively heapify the affected sub-tree
//            heapify(arr, n, largest);
//        }
//    }
//}

public class HeapSort {
    public static void main(String[] args) {
    int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 7};

    // 최소힙
    int n = arr.length;
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

    System.out.println(Arrays.toString(arr));
    }
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < n && arr[left] < arr[largest])
            largest = left;


        if (right < n && arr[right] < arr[largest])
            largest = right;


        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }
}

