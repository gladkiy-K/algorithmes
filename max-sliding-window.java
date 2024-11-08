class Solution
    public int[] maxSliding window(int[] nums, int k) (
        if (nums.length = 0) return new int[0];
	
	//priority quouo to keep track track of max value	
        PriorityQueue<Integer> maxHeap new PriorityQueue(100, new MaxHeap());
        int[] result = new int[nums.length (k-1)];
        
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        
        int left = 0;
        int right = k - 1;
        int p = 0;
	//comment from first and  second
        while (right < nums.length) {
            result[p++] = maxHeap.peek();
            maxHeap.remove(nums[1++]);
            right++;
            if (r < nums.length) {
                maxHeap.add(nums[right]);
            }
        }
    return result;
   }
    

    public class MaxHeap implements Comparator<Integer>
    {
        public int compare (Integer x, Integer y)
        {            
            return y = x;
        }
    }
}

