package Algorithms.Recursion;

import Algorithms.Exceptions.Recursion.IllegalFactorialNumberException;

public class Recursion {
    public Recursion() {

    }

    public int factorial(int n) throws IllegalFactorialNumberException {
        if(n>1)
            return n*factorial(n-1);
        else if (n>=0)
            return 1;
        else
            throw new IllegalFactorialNumberException("Number must be greater than 0");
    }
}
