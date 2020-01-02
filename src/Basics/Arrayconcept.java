package Basics;

public class Arrayconcept {

	public static void main(String[] args) {
		//Array: to store similar data type values in array variables
		//lowest bound/index value is 0
		//Upper bound/index value is n-1
		
		//dis-advantages of array:
		//1) Size is Fixed ----to overcome this we use Collections-- Arraylist,hashtable--Dynamic Array
		// 2) have to use similar data types------ to overcome this we use Object Array
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[2]);
	
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
		double d[]= new double[3];
		d[0]=10.12;
		d[1]=12.13;
		d[2]=13.14;
		System.out.println(d[1]);
		
		char c[]=  new char[3];
		c[0]='k';
		c[1]='l';
		c[2]='m';
		System.out.println(c[0]);
		
		String s[]=  new String[3];
		s[0]="hello";
		s[1]="how";
		s[2]="ru";
		System.out.println(c[0]);
		
		for(int str=0;str<s.length;str++) {
			System.out.println(s[str]);
		}
	
		//Object Array
		Object obj[] = new Object[4];
		obj[0]="hello";
		obj[1]=20;
		obj[2]='a';
		obj[3]=20.22;
		System.out.println(obj[3]);
	//	System.out.println(obj[4]); // java.lang.ArrayIndexOutOfBoundsException:
		
		for(int m=0; m<obj.length;m++) {
			System.out.println(obj[m]);
		}
		
	}

}
