class Solution {
  // no trasform int in String
     public boolean isPalindrome(int x) {
        if (x<0) return false;

        int reverse_x = 0;
        int copy_x = x;

        while(x>0){
            reverse_x = (reverse_x * 10) + (x % 10);
            x /= 10;
        }
        return reverse_x == copy_x;
    }
}
