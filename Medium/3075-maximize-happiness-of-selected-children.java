class Solution {
  public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        Arrays.sort(happiness);

        for(int i = 0 ; i < k; i++)
        {
            if (happiness[happiness.length - i - 1] - i < 0)continue;
            sum += happiness[happiness.length - i - 1] - i;
        }
        return sum;
    }
}
