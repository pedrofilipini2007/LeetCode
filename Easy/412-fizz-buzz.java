class Solution {
    public ArrayList<String>  fizzBuzz(int n){
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (i % 3 == 0 ){
                if(i % 5 == 0 ){
                    temp.add("FizzBuzz");
                }
                else{
                    temp.add("Fizz");
                }
            }
            else if(i % 5 == 0 ){
                temp.add("Buzz");
            }
            else{
                temp.add(String.valueOf(i));
            }
        }
        return temp;
    }
}
