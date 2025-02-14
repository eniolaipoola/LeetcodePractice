package TowPointersMethod;


import java.util.ArrayList;
import java.util.List;

/**
 * Example 3: Given two sorted integer arrays arr1 and arr2, return a new
 * array that combines both of them and is also sorted.
 */
public class MergeArrayProblem {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2, 5, 6, 7, 24};
        System.out.println(mergeArrays(arr1, arr2));
    }

    public static List<Integer> mergeArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        List<Integer> newArray = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            int iValue = arr1[i];
            int jValue = arr2[j];

            if(iValue < jValue){
                newArray.add(iValue);
                i++;
            } else if(iValue > jValue){
                newArray.add(jValue);
                j++;
            }

        }

        while (i < arr1.length) {
            newArray.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            newArray.add(arr2[i]);
            j++;
        }

        System.out.println(newArray);
        return newArray;
    }
}
