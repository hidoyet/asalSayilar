package asalSayilar;

public class Main {

	public static void main(String[] args) {
		// 100'e kadar olan asal sayýlarý yazdýran program
		
		for(int i=2;i<=100;i++) {
			boolean asal=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					asal=false;
					break;				
				}				
			}
			if(asal)
			System.out.print(i+" ");			
		}
		
	}

}
