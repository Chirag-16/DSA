import java.util.Arrays;
import java.util.Scanner;

public class two_D_Array {
    public static void main(String[] args) {
        // int[][] variable name = new int [row][col]
        Scanner in = new Scanner(System.in);
//        int [][]arr2D = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//
//        };

        int[][] arr = new int[3][3];
        //this loop take input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }

        }
        //this loop give output
//       for(int row=0; row<arr.length; row++) {
//            for(int col=0; col<arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //2nd Method for output
//        for(int row=0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//     }

        //3rd method  - every array inside array itself array
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
