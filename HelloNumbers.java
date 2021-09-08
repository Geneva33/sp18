public class HelloNumbers {
	public static void main (String[] args) {
		int x = 0;
		int i = 0;
		int [] numbers = new int [40];
		while ( x < 40) {
			numbers[i] = x;
			i ++;
			x = x + i;
			System.out.print (x + " ");
		}
	}
}