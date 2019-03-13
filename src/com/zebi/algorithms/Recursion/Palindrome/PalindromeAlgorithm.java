package com.zebi.algorithms.Recursion.Palindrome;

import com.zebi.algorithms.AlgorithmInterface;

public class PalindromeAlgorithm implements AlgorithmInterface {
    private Palindrome palindrome;

    public void setData(Object object) {
        this.palindrome = (Palindrome) object;
    }

    private boolean palindrome(String str) throws NullPointerException {
        if (str.length() < 2)
            return true;
        else
            return str.charAt(0) == str.charAt(str.length() - 1) && palindrome(str.substring(1, str.length() - 1));
    }

    public void execute() throws NullPointerException {
        boolean isPalindrome = palindrome(this.palindrome.getStr());
        System.out.print("The string: " + this.palindrome.getStr() + " is");
        System.out.println(isPalindrome == true ? " palindrome" : "not palindrome");
    }
}