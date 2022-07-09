
public class FibonacciSeries {
	public static void main (String[] args) {
	int targetedNumber=10;
	int a=0;
        int b=1;
        int temp=0;
	System.out.print(a+" "+b+" ");
	for(int i=2;i<targetedNumber;i++) {
		temp=a+b;
		System.out.print(temp+" ");
		a=b;
		b=temp;
		
	}

}
}