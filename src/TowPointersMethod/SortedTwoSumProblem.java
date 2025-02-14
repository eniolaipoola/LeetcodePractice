package TowPointersMethod;

/**
 *  Given a sorted array of unique integers and a target integer,
 *  return true if there exists a pair of numbers that sum to target, false otherwise.
 *  This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
 * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
 * */
public class SortedTwoSumProblem {


    public static void main(String[] args) {
        //test this
        int[] arr = {1, 2, 4, 6, 8, 9, 14, 15};
        boolean result = sumUpToTarget(arr, 13);
        System.out.println(result);
    }

    public static boolean sumUpToTarget(int[] arr, int targetValue) {
        int left = 0;
        int right = arr.length - 1;

        //since we were told the array is sorted
        while(left < right) {
            int sumResult = arr[left] + arr[right];
            if(sumResult == targetValue) {
                return true;
            }
            if(sumResult > targetValue) {
                right--;
            } else {
                left++;
            }
        }

        return true;
    }
}
