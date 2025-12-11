class Solution {
   public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int big_row = 0;
        int[] whelths = new int[rows];
        for(int i = 0; i < rows; i++) {
            whelths[i] = sum_row(accounts[i]);
            if (big_row < whelths[i]) {
                big_row = whelths[i];
            }
        }
        return big_row;
    }

    public int sum_row (int[] row)
    {
        int sum = 0;
        for (int i = 0 ; i < row.length; i++){
            sum += row[i];
        }
        return sum;
    }
}
