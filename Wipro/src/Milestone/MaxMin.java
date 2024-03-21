package Milestone;

public class MaxMin {
	public static void main(string a[]) {
		
		        int  u1=input1%10,u2=input2%10,u3=input3%10;
		        int  t1=(input1/10)%10,t2=(input2/10)%10,t3=(input3/10)%10;
		        int  h1=(input1/100)%10,h2=(input2/100)%10,h3=(input3/100)%10;
		        int  th1=input1/1000,th2=input2/1000,th3=input3/1000;
		        int max1=Math.max(u1,Math.max(t1, Math.max(h1, th1)));
		        int max2=Math.max(u2,Math.max(t2, Math.max(h2, th2)));
		        int max3=Math.max(u3,Math.max(t3, Math.max(h3, th3)));
		        int pass=(max1)+(max2)+(max3)+input4;
		        return pass;
	}
}
