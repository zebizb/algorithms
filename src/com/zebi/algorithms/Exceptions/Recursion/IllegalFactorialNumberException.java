package com.zebi.algorithms.Exceptions.Recursion;

public class IllegalFactorialNumberException extends Exception {
    public IllegalFactorialNumberException() {
    }

    public IllegalFactorialNumberException(Exception e) {
        super(e);
    }

    public IllegalFactorialNumberException(String msg) {
        super(msg);
    }

    public IllegalFactorialNumberException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
