package algorithms;

public class BubbleSort {
	
	public static void main(String[] a) {
		
		int nums[] = {6,5,2,8,9,4};
		int size = nums.length;
		int temp = 0;
		
		System.out.println("Before sorting");
		for(int num : nums) {
			System.out.print(num + " ");		
		}
		
		//bubble sort logic
		for(int i=0;i<size;i++) 
		{
			for(int j=0;j<size-i-1;j++)   // when we are comparing last values 6,5,2,8,9,4 where 9=j 4=j-1
				{						// after every pass last values will be sorted no need to pass it again so j<size-i-1
					if(nums[j] > nums[j+1]) {
						temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;	
					}
				}
				
				System.out.println();
				for(int num: nums) {
					System.out.print(num + " ");		
				}
			}
		
	
		System.out.println();
		System.out.println("After sorting");
		for(int num : nums) {
			System.out.print(num + " ");		
		}

	}

}
