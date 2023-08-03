package LogicBuilding4;
import java.util.*;
public class FindStringCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine().toLowerCase();
		System.out.println(str);
		String temp = "";
		String words[] = str.split(" ");
		
//		System.out.println(words[0]);
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==' ') {
//				al.add(temp);
//				temp = "";
//				continue;
//			}
//			else if(i==str.length()-1) {
//				temp = temp + str.charAt(i);
//				al.add(temp);
//				temp = "";
//				continue;
//			}
//			temp = temp + str.charAt(i);
//		}
		String finalval = "";
		int sum = 0 , val = 0;
		for(String word : words) {
			char arr[] = new char[word.length()];
			arr = word.toCharArray();
			if(arr.length%2!=0) {
				for(int i = 0;i<=arr.length/2;i++) {
					if(arr.length%2!=0 && i==(arr.length/2)) {
						sum = sum + ((int)arr[i]-96);
						continue;
					}
					val = (int)arr[i]-96 - ((int)arr[arr.length -i - 1] - 96);
					sum = sum + val;
				}
				finalval = finalval + sum;
			}
			else {
				for(int i = 0;i<arr.length/2;i++) {
					if(arr.length%2!=0 && i==(arr.length/2)) {
						sum = sum + ((int)arr[i]-96);
						continue;
					}
					val = (int)arr[i]-96 - ((int)arr[arr.length -i - 1] - 96);
					sum = sum + val;
				}
				finalval = finalval + sum;
			}
 			sum = 0;
		}
		System.out.println(finalval);
	}

}
