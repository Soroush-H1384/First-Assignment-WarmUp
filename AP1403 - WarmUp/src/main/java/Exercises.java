import com.sun.tools.javac.Main;

public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
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
    // Question 1 >> Tested >> Correct

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
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
    // Question 2 >> Tested >> Correct


    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        char[][] Triangle = new char[n][];
        if(n <= 3){
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= i ; j++){
                    Triangle[i][j] = '*';
                }
            }
        }
        else if(n > 3){
            Triangle[0][0] = '*';
            for(int i = 0; i < n; i++){
                for(int j = 0; j <= i; j++){
                    if(j == 0 || j == n){
                        Triangle[i][j] = '*';
                    }
                    else{
                        Triangle[i][j] = ' ';
                    }
                }
            }
            for(int i = 0; i < n; i++){
                Triangle[n][i] = '*';
            }
        }
        else{
            return null;
        }
        return Triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
        
    }
}
