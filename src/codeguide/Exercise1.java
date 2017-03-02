package codeguide;

import java.util.Scanner;

/**
 * Calculate the area.
 * @author Phanuwatch Luangpradit
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input w: ");
		int w = input.nextInt();
		System.out.print("Input h:");
		int h = input.nextInt();
		int a = w * h;
		System.out.print("The area is " + a);
	}
	//TODO Change the variable name to make another people understand your code.
}
