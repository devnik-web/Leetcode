class Solution {
    public int reverse(int x) {
        int n=x;
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            if (rev>214748364 || rev< -214748364)
                return 0;
            rev=(rev*10)+digit;
            n/=10;
        }
        return rev;


    }
}