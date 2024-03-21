package Milestone;

public class FindRoom 
{
	    public static int findRoomNumber(int[] input1, int[] input2, int[] input3, int input4) {
	        int[] Result = new int[input4];
	        for(int i=0;i<input4;i++){
	            Result[i] = input1[i] + input2[i] + input3[i];
	        }
	        int sum = 0;
	        for(int i=0;i<input4;i++) {
	        	if(Result[i]==0) {
	        		continue;
	        	}
	        	else if(Result[i]%input4 == 0) {
	        		sum += input1[input4-1];
	        	}
	        	else if(Result[i]%input4!=0) {
	        		sum += input1[(Result[i]%input4) - 1];
	        	}
	        	if(i+1 < input4) {
	        		if(Result[i+1]==0) {
		        		continue;
		        	}
		        	else if(Result[i+1]%input4 == 0) {
		        		sum += input2[input4-1];
		        	}
		        	else if(Result[i+1]%input4!=0) {
		        		sum += input2[(Result[i+1]%input4) - 1];
		        	}
	        	}
	        	if(i+2 < input4) {
	        		if(Result[i+2]==0) {
		        		continue;
		        	}
		        	else if(Result[i+2]%input4 == 0) {
		        		sum += input3[input4-1];
		        	}
		        	else if(Result[i+2]%input4!=0) {
		        		sum += input3[(Result[i+2]%input4) - 1];
		        	}
	        	}
	        	i = i+2;
	        }
	        return sum;
	    }
		public static void main(String[] args) {
//			int arr1[] = {1,2,3,4};
//			int arr2[] = {2,3,4,5};
//			int arr3[] = {1,3,5,7};
//			int len = 4;
			int arr1[] = {10,33,5,40,120,98,1};
			int arr2[] = {121,78,21,32,91,340,72};
			int arr3[] = {65,320,72,84,32,843,40};
			int len = 7;
			System.out.println(findRoomNumber(arr1 , arr2 , arr3 ,len));
		}
	}
