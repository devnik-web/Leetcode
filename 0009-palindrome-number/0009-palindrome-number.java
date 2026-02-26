class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int temp=0,rev=0;
        while(n>0)
        {
            temp=n%10;
            n/=10;
            rev=(rev*10)+temp;
        }

        if(x==rev)
            return true;
        else
            return false;
    }
}