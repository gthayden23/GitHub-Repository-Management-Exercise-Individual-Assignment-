/**
 *	This creates various recursive functions.
 *
 *       	Date Last Modified: 09/12/2016
 *	@author Gabriel Hayden, Zack Drumheller
 *
 *	CS1122, Fall 2023
 *	Lab Section 3
 */

public class Lab7 {

    public int sumDigits(int n)
    {
        if(n<0)
            return -1 * sumDigits(-n);
        if(n<10)
            return n;
        else
            return n%10 + sumDigits(n/10);
    }

    public Integer maxValue( Integer[ ] a ){
        if (a.length == 1) {
            return a[0];
        }

        Integer [] b = new Integer [a.length-1];
        for(int i = 0; i < a.length-1; i++){
            b[i] = a[i+1];
        }
        int max = a[0];
        if (maxValue(b) > max){
            max = maxValue(b);
        }

        return max;
    }

    public boolean isPalindrome( String s ) {
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return true;
            } else {
                return false;
            }
        }

        if (s.length() == 1){
            return true;
        }
        if (s.charAt(0) == (s.charAt(s.length()-1))) {
            return isPalindrome(s.substring(1, s.length()-1));

        } else {
            return false;
        }
    }

    public long fib(long n) {
        if (n * -1 < 0) {
            if (n <= 1) {
                return n;
            }
            return fib(n - 2) + fib(n - 1);
        }else if (n * -1 > 0){
            if (n >= -1) {
                return n;
            }
             return fib( n+ 2) + fib(n + 1);

        }else{
            return 0;
        }
    }
}