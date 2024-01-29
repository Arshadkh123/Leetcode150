class Solution {
    public boolean isPalindrome(int x) {
        int e = x;
        if(e<0)return false;
        if(e==0)return true;
        int j = 0,num = 0;
        while(e!=0)
        {
            j = e%10;
            num =(num*10) + j;
            e = e/10;
        }
        if(num == x)
        return true;
        return false;
    }
}