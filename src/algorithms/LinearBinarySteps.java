package algorithms;

public class LinearBinarySteps {
	
	public static void main(String[] a) {
	
	//int nums[] = {1,2,4,5,7,9,11,13};
	//int target = 11;
		
	int nums[] = new int[1000000];
	int target = 900;
	
	int result1 = linearSearch(nums,target);
	int result2 = binaySearch(nums,target);
	
	if(result1 != -1)
		System.out.println("The element found at index: " +result1);
	else
		System.out.println("Not able to find the elment in list");

	}
	
	public static int linearSearch(int[] nums, int target) {
		int step =0;
		for(int i=0;i<nums.length;i++) {
			step++;
			if(nums[i] == target) {
				System.out.println("Steps taken by linear: " + step);
			return i;
		}
	}
		System.out.println("Steps taken by linear: " + step);
		return -1;
	}
	
	public static int binaySearch(int[] nums, int target) {
			int step =0;
			int left =0;
			int right = nums.length -1;
			
			while(left <= right) {
				step++;
				
				int mid = (left+right)/2;
				
				if(nums[mid] == target) {
					System.out.println("Steps taken by Binary :" + step);
					return mid;
				}
				else if(nums[mid] < target) {
					left = mid +1;
				}
					else
					right = mid -1;
				}
			System.out.println("Steps taken by Binary :" + step);
			return -1;
		}
}	
