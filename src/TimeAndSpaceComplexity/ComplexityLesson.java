package TimeAndSpaceComplexity;

public class ComplexityLesson {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        function1(n);

        solveFibonacciProblem(7);
    }

    static void function1(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(i);
        }
        System.out.println("Time complexity for this function is O(n)");
    }

    static void function2(int n) {
        for(int i = 0; i < n; i++){
            //time complexity for this is O(n)
            for(int j = i; j < n; j++) {
                //time complexity for this is O(n+1) because J is dependent on i
                //i.e it runs  n-1, n-2, n-3 etc
            }
        }

        // total time complexity = O(n) . O(n+1/2) = O(n^2 + n/2)
        // = O(n^2 + n)
    }

    static int solveFibonacciProblem(int n) {
        if(n <= 1) {
            return n;
        }

        int firstValue = solveFibonacciProblem(n - 1);
        int secondValue = solveFibonacciProblem(n - 2);

        int result = firstValue + secondValue;
        System.out.println( "result is:" + result);

        return result;

        //the time complexity for this algorithm = O(2^n)
    }

}


