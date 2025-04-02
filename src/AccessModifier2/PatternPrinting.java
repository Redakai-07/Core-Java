package AccessModifier2;

public class PatternPrinting {

	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<=n; i++) {
			for(int j=0;j<=n;j++) {
				if(((i+j)%(n/2)==0 || (i-j)%(n/2)==0 || (j-i)%(n/2)==0) && i!=j && (i+j)!=n) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

