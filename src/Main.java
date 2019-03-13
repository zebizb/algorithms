import com.zebi.algorithms.Exceptions.Recursion.IllegalFactorialNumberException;
import com.zebi.algorithms.Recursion.Factorial.Factorial;
import com.zebi.algorithms.Recursion.Factorial.FactorialAlgorithm;
import com.zebi.algorithms.Recursion.Palindrome.Palindrome;
import com.zebi.algorithms.Recursion.Palindrome.PalindromeAlgorithm;
import com.zebi.algorithms.Recursion.Recursion;

public class Main {


    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.factorialExample();
        main.palindromeExample();
    }

    public void factorialExample() throws Exception {
        try {
            Factorial factorial = new Factorial(5);
            FactorialAlgorithm factorialAlgorithm = new FactorialAlgorithm();
            Recursion<FactorialAlgorithm> recursion = new Recursion<FactorialAlgorithm>(factorialAlgorithm, factorial);
            recursion.init();
            recursion.start();
        } catch (IllegalFactorialNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public void palindromeExample() throws Exception {
        try {
            Palindrome palindrome = new Palindrome("abc");
            PalindromeAlgorithm palindromeAlgorithm = new PalindromeAlgorithm();
            Recursion<PalindromeAlgorithm> recursion = new Recursion<PalindromeAlgorithm>(palindromeAlgorithm, palindrome);
            recursion.init();
            recursion.start();
        } catch (IllegalFactorialNumberException e) {
            System.out.println(e.getMessage());

        }
    }
}
