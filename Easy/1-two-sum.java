public int[] twoSum(int[] nums, int target) {
        //  try use only one Hashmap
        Map<Integer,Integer> collect = new HashMap<>();
        for (int i = 0; i< nums.length; i++)
        {
            if(collect.containsKey(target - nums[i])) return new int[] {i, collect.get(target - nums[i])};
            collect.put(nums[i], i);
        }
        return new int[] {};

    }





//    brute force method
//    for (int i = 0; i < nums.length; i++)
//    {
//        for (int j = 0; j < nums.length; j ++){
//
//            if (i == j) continue;
//
//            if (nums[i] + nums[j] == target){
//                int[] index = new int[]{i,j};
//                return index;
//            }
//
//        }
//    }
   // return null;
//    }
