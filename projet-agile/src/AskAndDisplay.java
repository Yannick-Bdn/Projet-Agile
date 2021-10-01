package projet.agile.gr3;
import java.util.Random;
import java.util.Scanner;

public class AskAndDisplay {
	
	private static Scanner scan = new Scanner(System.in);
	
	protected static int askValidNumber(int min,int max) {
		int nb=-999;
		boolean integer = false;

		while (!integer) {
			try {
				nb = Integer.parseInt(scan.nextLine());
				if (nb < min || nb > max) {
					throw new NumberFormatException();
				}
				integer = true;
			} catch (NumberFormatException e) {
				System.out.println("You can only type numbers between "+min+" and "+max);
				waitForXMs(1500);
				clearNLines(2);
			}
		}
		return nb;
	}
	
	protected static void clearNLines(int n){
		for (int i = 0; i < n; i++) {
			System.out.print("\033[A"); // Move up
			System.out.print("\033[2K"); // Erase line content
		}
	}
	
	protected static void waitForXMs(int time){
		try {Thread.sleep(time);} catch (InterruptedException e) {}
	}
	
	public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
	
	
}
