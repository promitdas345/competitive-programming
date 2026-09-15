class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map <Integer, Integer> count = new HashMap<>();

        for( int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for(int  num: count.keySet()){
            int frequency = count.get(num);

            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        int[] r = new int[k];
        int index = 0;
        for(int i = buckets.length - 1; i >= 0; i--){

            if(buckets[i] != null){
                
                for( int val:buckets[i]){
                    r[index] = val;
                    index++;
                    if(index == k){
                        return r;
                    }
                }
            }

        }
        return r;
    }
}
