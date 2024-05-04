//2nd
class Palindrome_No{
    public boolean isPalindrome(int x) {
        int rem;
        int q;
        int d = 0;
        q = x;
        if(x<0){
            return false;
        }
        while(x>0){
            rem = x % 10;
            x = x / 10;
            d = d * 10 + rem;
        }
        if (d == q) {
            return true;
        } else {
            return false;
        }
    }
}