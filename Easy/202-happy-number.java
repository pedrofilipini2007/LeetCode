class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> conjunto = new ArrayList<Integer>();

        while(!conjunto.contains(n)){
            conjunto.add(n);
            int temp = 0;
            int sum = 0;

            while(n>0){
                temp = n%10;
                n = n / 10;
                sum += temp * temp;
            }
            n = sum;
            if (n == 1) return true;

        }
        return false;
    }
}
