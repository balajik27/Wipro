package Milestone;
public class FirstRepeated
{
	public static void main(String[] args) {
		int ar[] = {1,2,4,1,2,8};
		int flag = 0,nonzero=1;
		for(int i=0;i<ar.length;i++){
		    for(int j=i+1;j<ar.length;j++){
		        if(ar[i]==ar[j] && ar[i]>0 ){
		        	return ar[i];
		            flag = 1;
		            break;
		        }
		    }
		    if(ar[i]>0){
		        nonzero=0;
		    }
		    if(flag ==1){
		        break;
		    }
		}
		if(flag == 0){
			return ar[0];
		}
		if(nonzero==1){
			return 0;
		
		}
	}
}