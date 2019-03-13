package com.zebi.algorithms.Recursion.Factorial;


import com.zebi.algorithms.AlgorithmInterface;
import com.zebi.algorithms.Exceptions.Recursion.IllegalFactorialNumberException;

public class FactorialAlgorithm implements AlgorithmInterface {
    private Factorial factorial;

    public void setData(Object object) {
        factorial = (Factorial) object;
    }

    private int factorial(int factorialNumber) throws IllegalFactorialNumberException {
        if (factorialNumber > 1)
            return factorialNumber * factorial(factorialNumber - 1);
        else if (factorialNumber >= 0)
            return 1;
        else
            throw new IllegalFactorialNumberException("Number must be >= 0");
    }

    public void execute() throws IllegalFactorialNumberException {
        int fact = factorial(factorial.getFactorialNumber());
        System.out.println(fact);
    }
}