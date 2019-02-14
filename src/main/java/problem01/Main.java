package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int cnt=0;
		String num_str = Integer.toString(number);
		int size = num_str.length();
		for(int i=0; i<size; i++) {
			if((num_str.charAt(i) == '3') || (num_str.charAt(i) == '6') || (num_str.charAt(i) == '9')) {
				cnt++;
			}
		}
		return cnt;
	}
}