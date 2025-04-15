public class Exercises {
    /// question 3
    public boolean isPrime(long n) {
        if(n == 1){
            return false;
        }
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
/// question 2
    public long fibonacciIndex(long n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int i = 2;
            int number1 = 1;
            int number2 = 1;
            while(number1 < n){
                // Swap(number1,number2) -->
                int temp;
                temp = number2;
                number2 = number1;
                number1 = temp;
                // <--
                number1 += number2;
                i++;
            }
            if(number1 == n){
                return i;
            }
        }
        return -1;
    }
/// question 3
    public char[][] generateTriangle(int n) {
        char[][] triangle = new char[n][];
        if (n <= 0) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == n - 1 || j == 0 || j == i) {
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }

        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}
