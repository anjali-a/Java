package JavaAssignment;

public class Assignment_1 {
	public static void main(String args[]) {
		starSeries();
		System.out.print('\n');
		numberSeries();
		System.out.print('\n');
		alphabetsSeries();
		System.out.print('\n');
		boxSeries();
	
	}

	public static void starSeries() {
		for (int i = 0; i < 6; i++)
		{
			for(int j=0; j <= i; j++) {
				System.out.print("* ");
			}
		System.out.print('\n');
		}
	}
	
	public static void numberSeries() {
		for (int i = 1; i <= 6; i++)
		{
			for(int j=1; j <= i; j++) {
				System.out.print(j + " ");
			}
		System.out.print('\n');
		}
	}
	public static void alphabetsSeries() {
		
		int ascii ;
		char ch;	
		for (int i = 1; i <= 6; i++)
		{
			for(int j=0; j < i; j++) {
				ascii = 'A' + j;
				ch = (char) ascii;
				System.out.print( ch + " ");
			}
		System.out.print('\n');
		}
	}
	
	public static void boxSeries() {
	for (int i = 1; i <= 4; i++)
	{
		for(int j=1; j <= 4; j++) {
			if(i == 1 || i == 4 || j == 1 || j == 4)
				System.out.print("$");
			else
				System.out.print(" ");
		}
	System.out.print('\n');
	}
}
}
