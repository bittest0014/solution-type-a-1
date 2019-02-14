package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		//int random_num = (int)(Math.random() * 1000) +1;
		int random_num = 783;
		System.out.println(random_num);
		int N = 0; //도전 횟수
		
		String ran_str = Integer.toString(random_num);
		
		while(true) {
			N++;
			int S = 0;
			int B = 0;
			int O = 0;
			String s = scan.nextLine();
			for(int i=0; i<ran_str.length(); i++) {
				if(ran_str.contains(String.valueOf(s.charAt(i)))) {
					if(ran_str.charAt(i) == s.charAt(i)) {
						S++;
					}else {
						B++;
					}
				}else {
					O++;
				}
			}
			System.out.println(N+" - S:"+S+", B:"+B+", O:"+O);
			if(ran_str.equals(s)) {
				System.out.println("(종료)");
				break;
			}
		}
		
	}
}