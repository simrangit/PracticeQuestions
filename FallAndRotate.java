
public class FallAndRotate {
public static void printFallenArray(char a[]) {
	
	int len = a.length;
	int i, lastInd = 0, k,l = 0;
			char temp;
	for (i = 0 ; i < len ; i++) {
		if (a[i] != '.') {
			continue;
		}
		if (a[i] == '.') {
			
		lastInd = i;
		l = 0;
		
		}
		
		k = i + 1;
		while(k < len && a[k] != '*') {
			if(a[k] == ' ' && l == 0 ) {
				
				l = k;
				
			}
			k++;
//			if(l != 0) {
//				break;
//			}
		}
		if ((k - 1) != lastInd) {
		temp = a[k - 1];
		a[k - 1] = a[lastInd];
		a[lastInd] = temp;
		}
	}
	
	for (i = 0 ; i < len ; i++) {
		System.out.println(a[i]);
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char a[] = {'.',' ',' ','*',' ','*','.',' ',' ','.',' '};
	
		 try
		 {
			 printFallenArray(a);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Error message is "+e.getMessage());
		 }
		 

	}

}
