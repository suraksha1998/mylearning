package algorithms;

public class RecursiveBinarySearch {
	
	public static void main(String[] a) {
	
	int nums[] = {5,7,9,11,13};
	int target = 11;
	
	int result = recBinaySearch(nums,target,0,nums.length-1);
	
	if(result != -1)
		System.out.println("The element found at index: " +result);
	else
		System.out.println("Not able to find the elment in list");
	
}
	public  static int recBinaySearch(int[] nums, int target, int left, int right) {
		
		if(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) 
				return recBinaySearch(nums,target,left+1,right);
				else
				return recBinaySearch(nums,target,left,right-1);
		}			
	return -1;
	}



}
