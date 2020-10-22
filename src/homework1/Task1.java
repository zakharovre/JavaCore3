package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        String[] someStr = {"one", "two", "three", "four", "five"};
        replace(someStr, 0, 4);
        System.out.println(Arrays.toString(someStr));

        Integer[] someInt = {1, 2, 3, 4, 5};
        replace(someInt, 1, 3);
        System.out.println(Arrays.toString(someInt));

        ArrayList<String> arrList1 = toArrList(someStr);
        ArrayList<Integer> arrList2 = toArrList(someInt);

        System.out.println(arrList1);
        System.out.println(arrList2);
    }

    public static <T> void replace(T[] arr, int a, int b) {
        T c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static <T> ArrayList<T> toArrList(T[] arr){
        ArrayList<T> arList= new ArrayList<>();
        Collections.addAll(arList, arr);
        return arList;
    }
}

