package LogicBuilding4;

public class MulMaxMIn {
	public static void main(String a[]) {
		int min = 10;
		int num = 3521;
		int input2 =2452;
		int input3 = 1352 , input4 = 38;
		while(num>0) {
			if(num%10<min) {
				min = num%10;
			}
			num/=10;
		}
		int arr[]= {input2,input3} , large = 0 , fl = 1;
		for(int n:arr) {
			while(n>0) {
				if(n%10>large) {
					large = n%10;
				}
				n/=10;
			}
			fl = fl * large;
		}
		System.out.println(min*fl+input4);
	}
}
