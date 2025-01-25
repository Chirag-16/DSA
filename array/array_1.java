import java.util.*;
public class array_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //arr primitive
//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 2;
//        arr[2] = 1;
//        arr[3] = 120;
//        arr[4] = 124;
//
//        System.out.println(arr[4]);
//
//        //input using for loops
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        // old method for print array
////        for (int i=0; i < arr.length; i++){
////            System.out.print(arr[i] + " ");
//        // }
//
//        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for(int i=0; i < str.length; i++) {
            str[i] = in.next();
            str[3] = "kunal";
        }
        System.out.println(Arrays.toString(str));
    }
}
