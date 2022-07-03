package finalss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class problem2 {
	public static int EvaluateExpression(String c) {
		Stack <Integer> stack = new Stack<Integer>();
		stack.push(Integer.parseInt(c));
		int n1 = Integer.parseInt(c.substring(0));
		int a = Character.getNumericValue(c.charAt(Integer.parseInt(c.substring(1))));
		int n2 = Integer.parseInt(c.substring(2));
		int f = n1+n2;
		stack.push(f);
		while(stack!=null)
			return stack.pop();
		return 0;
	}
	public static void main(String[] args) {
		Scanner input;
		try {
			Stack <Integer> stack = new Stack<Integer>();
			input = new Scanner(new File("Expressions.txt"));
			System.out.println("Reading from file...");
			while(input.hasNextLine()) {
				input.nextLine();
				String c = input.nextLine();
				EvaluateExpression(c);
		}
		}catch (FileNotFoundException e) {
			System.err.print("File was not found!");
		}
		}
	}

