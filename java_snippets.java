package core;

public class Java_notes {

	public static void main(String[] args) {
		// print in new lines
		System.out.println("Hello World!");
		System.out.println("Integer: " + 10 + " Double: " + 3.14 + " Boolean: " + true);
		// print without new line
		System.out.print("Hello ");
		System.out.print("World");
		System.out.println("");
		// for easy formatted printing
		System.out.printf("pi = %.5f", Math.PI);// pi = 3.14159
		System.out.println("");
		String fooString = "My String Is Here!";
		// \n is an escaped character that starts a new line
		String barString = "Printing on a new line?\nNo Problem!";
		// \t is an escaped character that adds a tab character
		String bazString = "Do you want to add a tab?\tNo Problem!";
		System.out.println(fooString);// My String Is Here!
		System.out.println(barString);
		// Printing on a new line?
		// No Problem!
		System.out.println(bazString);// Do you want to add a tab? No Problem!
		System.out.println("STRING BUILDING");

		// #1 - with plus operator
		String plusConcatenated = "Strings can " + "be concatenated " + "via + operator.";
		System.out.println(plusConcatenated);// Strings can be concatenated via
												// + operator.

		// #2 - with StringBuilder
		StringBuilder builderConcatenated = new StringBuilder();
		builderConcatenated.append("You ");
		builderConcatenated.append("can use ");
		builderConcatenated.append("the StringBuilder class.");
		System.out.println(builderConcatenated.toString());
		// You can use the StringBuilder class.

		// #3 - with String formatter
		System.out.println(String.format("%s may prefer %s.", "Or you", "String.format()"));
		// Or you may prefer String.format().

		System.out.println("ARRAYS");
		int[] intArray = new int[10];
		String[] stringArray = new String[1];
		boolean boolArray[] = new boolean[100];

		// Another way to declare & initialize an array
		int[] y = { 9000, 1000, 1337 };
		String names[] = { "Bob", "John", "Fred", "Juan Pedro" };
		boolean bools[] = { true, false, false };

		// Indexing an array - Accessing an element
		System.out.println("intArray @ 0: " + intArray[0]);// intArray @ 0: 0

		// Arrays are zero-indexed and mutable.
		intArray[1] = 1;
		System.out.println("intArray @ 1: " + intArray[1]); // intArray @ 1: 1

		System.out.println("IF Condition");
		// #1
		int j = 10;
		if (j == 10) {
			System.out.println("I get printed");
		} else if (j > 10) {
			System.out.println("I don't");
		} else {
			System.out.println("I also don't");
		}
		// #2
		int foo = 5;
		String bar = (foo < 10) ? "A" : "B";
		System.out.println(bar); // Prints A, because the statement is true

		System.out.println("WHILE Condition");
		int fooWhile = 0;
		while (fooWhile < 10) {
			System.out.println(fooWhile);
			// Increment the counter
			// Iterated 10 times, fooWhile 0,1,2...9
			fooWhile++;
		}
		System.out.println("fooWhile Value: " + fooWhile);

		System.out.println("DO WHILE Condition");
		int fooDoWhile = 0;
		do {
			System.out.println(fooDoWhile);
			// Increment the counter
			// Iterated 99 times, fooDoWhile 0->9
			fooDoWhile++;
		} while (fooDoWhile < 10);
		System.out.println("fooDoWhile Value: " + fooDoWhile);

		System.out.println("FOR loop");
		// #1
		for (int f = 0; f < 10; f++) {
			System.out.println(f);
			// Iterated 10 times, fooFor 0->9
		}
		// #2
		int[] fooList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// array list
		for (int bars : fooList) {
			System.out.println(bars);
			// Iterates 9 times and prints 1-9 on new lines
		}

		System.out.println("SWITCH CASE");
		String myAnswer = "maybe";
		switch (myAnswer) {
		case "yes":
			System.out.println("You answered yes.");
			break;
		case "no":
			System.out.println("You answered no.");
			break;
		case "maybe":
			System.out.println("You answered maybe.");
			break;
		default:
			System.out.println("You answered " + myAnswer);
			break;
		}

	}

}
