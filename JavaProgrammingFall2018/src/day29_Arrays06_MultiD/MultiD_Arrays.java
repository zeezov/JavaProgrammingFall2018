package day29_Arrays06_MultiD;

public class MultiD_Arrays {
	public static void main(String[] args) {
		
		int[][] nums = new int[2][3];
		
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		
		
		nums[1][0] = 40;
		nums[1][1] = 50;
		nums[1][2] = 60;
		
		int[][] nums2 = { {10,20,30}, {40,50,60} };
		
		System.out.println(nums[0][0]); // print 10
		System.out.println(nums[0][2]); // print 30
		
	}

}
