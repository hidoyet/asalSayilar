package asalSayilar;

public class Main {

	public static void main(String[] args) {
		//4'ten 100'e kadar olan asal sayıları yazdıran program
		
		for(int i=4;i<=100;i++) {
			boolean isPrime=true;
			for(int j=4;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;				
				}				
			}
			if(isPrime)
			System.out.print(i+" ");			
		}
		
	}

}
