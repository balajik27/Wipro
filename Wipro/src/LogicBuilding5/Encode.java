package LogicBuilding5;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int arr[] = {11,3,2,1,7,8,12,2,3,7};
		int flag = 0 , count=1  , freq=0;
		int a[] = new int[arr.length];
 		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				flag = 1;
				count++;
				continue;
			}
			if(flag == 1) {
				a[freq] = count;
				freq++;
				count=1;
				flag = 0;
			}
		}
 		int large = 0;
 		for(int i : a) {
 			if(i>large) {
 				large = i;
 			}
 		}
 		System.out.println(freq);
 		System.out.println(large);
	}

}
