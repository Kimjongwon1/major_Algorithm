import java.time.LocalDateTime;

public class BinarySerch {

    public static void main(String[] args) {
        int[] bin = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int start = 0;
        int end = bin.length-1;
        int find = 4;
            while (true){
            int mid = (start+end)/2;
            if(start>end){break;};
            if(bin[mid] == find){
                System.out.println("find 값 :" + mid);
                break;
            }
            if(bin[mid]<find){
                start = mid+1;
            }
            if(bin[mid]>find){
                end = mid-1;
            }
        }
    }

}

//프로그래머스 입국심사

//public class BinarySerch {
//
//    public static void main(String[] args) {
//        int[] bin = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//        int start = 0;
//        int end = bin.length - 1;
//        int find = 1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (bin[mid] == find) {
//                System.out.println("찾은 값의 인덱스: " + mid);
//                break;
//            }
//            if (bin[mid] < find) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        if (start > end) {
//            System.out.println(find + " 값을 배열에서 찾을 수 없습니다.");
//        }
//    }
//}

