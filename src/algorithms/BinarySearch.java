package algorithms;

public class BinarySearch {
	
	public static void main(String[] a) {
		
		int nums[] = {5,7,9,11,13};
		int target = 5;
		
		int result = binaySearch(nums,target);
		
		if(result != -1)
			System.out.println("The element found at index: " +result);
		else
			System.out.println("Not able to find the elment in list");
		
	}

	private static int binaySearch(int[] nums, int target) {
		   //5,7,9,11,13
		int left =0;
		int right = nums.length -1;
		
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			if(nums[mid] == target)
				return mid;
			
			else if(nums[mid] < target) {
				left = mid +1;
			}
				else
				right = mid -1;
			}
		return -1;
	}

}
