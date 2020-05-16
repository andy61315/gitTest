import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		while(true) {
			boolean increase = true;
			input = scan.nextInt();
			System.out.println(input);
			for(int i = 1; i >= 0; i = (increase)? i+1 : i-1) {
				for(int j = 0 ; j < (input-i); j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < i; k++) {
					System.out.print("* ");
				}
				System.out.println();
				if(i == input)increase = false;
//				if(i<0)break;
			}
		}
	}
}
