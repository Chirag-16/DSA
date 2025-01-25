import java.util.*;

public class ArrayListEx {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(5);
//        list.add(4);
//        list.add(54);
//        list.add(52);
//        list.add(23);
//        list.add(22);
//        list.add(33);

//        System.out.print(list);

        for(int i=0; i<5; i++) { //input the list
            list.add(in.nextInt());
        }

        for(int i=0; i<5; i++) { // get item at any index
            System.out.print(list.get(i));
        }

        System.out.println(list);

        // ArrayList features - get, set, remove and more

    }




}