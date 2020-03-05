package Java_Interview;

public class smallestAndLargestofArray {

	public static void main(String[] args) {

		int  num[] = {10,20,30,40,50};
		int largest =num[0];
		int smallest =num[0];
		
		for(int i=1;i<num.length;i++) {
			if(largest<num[i]) {
				largest =num[i];
			}
			
			if(smallest>num[i]) {
				smallest =num[i];
			}
		}
		
		System.out.println("Largest Numbet is: "+largest+"    "+"Smallest Number is: "+smallest);
	}

}
