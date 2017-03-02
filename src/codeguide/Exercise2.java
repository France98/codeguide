package codeguide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create classroom that have student.
 * @author Phanuwatch Luangpradit
 *
 */
public class Exercise2 {
	
	static Scanner input = new Scanner(System.in);
	private final static int ARRAY_SIZE = 5;
	static String[] classroom1 = new String[ARRAY_SIZE];
	static String[] classroom2 = new String[ARRAY_SIZE];
	
	public static void putStudent(String[] array){
		//TODO put the student name into the array
	}
	
	public static void print(String[] array){
		//TODO print the array
	}
	
	
	public static void main(String[] args) {
		System.out.println("Room 1");
		for(int i = 0 ; i < classroom1.length ;i++){
			System.out.print("Student number " + (i+1) + " name is ");
			String name = input.nextLine();
			classroom1[i] = name;
		}
		for (int i = 0; i < classroom1.length; i++) {
			System.out.print(classroom1[i] + " ");
		}
		System.out.println("\nRoom 2");
		for(int i = 0 ; i < classroom2.length ;i++){
			System.out.print("Student number " + (i+1) + " name is ");
			String name2 = input.nextLine();
			classroom2[i] = name2;
		}
		for (int i = 0; i < classroom2.length; i++) {
			System.out.print(classroom2[i] + " ");
		}
	}
	//TODO Remove duplicate code by create the method that put the name into the array and the method that print the array.
}
