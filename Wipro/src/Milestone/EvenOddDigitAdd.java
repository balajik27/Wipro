package Milestone;

public class EvenOddDigitAdd {
	public static void main(String a[]) {
		int input1 = 3521 , input2 = 2452 , input3 = 1352 , input4 = 38;
		int even =0,odd = 0;
		int arr[] = {input1 , input2 , input3 };
		for(int num : arr) {
			while(num>0) {
				if((num%10)%2==0) {
					even = even + (num%10);
				}
				else {
					odd = odd + (num%10);
				}
				num/=10;
			}
		}
		if(input4 %2==0) {
			return even;
		}
		else {
			return odd;
		}
	}
}
