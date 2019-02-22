package com.company;

/*
  * number of my number book is 8220
  * C2 = 0, 01 = "+"
  * C3 = 0, C = 0
  * C5 = 0, 02 = "*"
  * C7 = 2, type of index i and j = int
 */
class FirstLab {
    static String Calculations() {
        return Calculations(-2,1,-1,3);
    }
    static String Calculations(int a, int b, int n, int m){
        double S = 0;
        final int C = 0;
        if (a>=n || b>=m){
            return "Boundary not correct";
        } else if (a<=0 && n>=0) {
            return "Exception: division by zero";
        }
        for (int i=a; i<=n; i++){
            for (int j=b; j <= m; j++){
                S = S + (((double)i*j)/(i+C));
            }
        }
        return Double.toString(S);
    }
}

public class Main {
    public static void main(String[] args) {

            System.out.print(FirstLab.Calculations());

        }
    }

