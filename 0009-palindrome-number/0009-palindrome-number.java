import java.util.*;
class Solution {
    public static boolean isPalindrome(int n) {
        int t=n,rev=0;
        while (n>0)
        {
            int digit= n%10;
            rev= rev * 10 +digit;
            n=n/10;
        }
        return t==rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}