import edu.usfca.cs345.*;

import java.util.*;

public class Test {
	public static void printCompareTo(Num a, Num b) {
		System.out.printf("Compare \"%s\" to \"%s\": %d\n", a, b, a.compareTo(b));
	}

	public static void printEquals(Num a, Num b) {
		System.out.printf("\"%s\" ?= \"%s\": %b\n", a, b, a.equals(b));
	}

	public static List<Num> randomList(int size, int upperRange) {
		List<Num> list = new ArrayList<>(size);
		for (int i = 0; i < size; i++) {
			Num curr;
			int denominator = randomInt(1, upperRange);
			int numerator = randomInt(0, upperRange);
			if (Math.random() >= .5) {
				curr = new Fraction(numerator,
						denominator);
			} else {
				curr = new MixedNumber(randomInt(0, upperRange),
						numerator,
						denominator);
			}
			list.add(curr);
		}
		return list;
	}

	private static int randomInt(int lower, int upper) {
		return (int)(Math.random() * (upper - lower + 1)) + lower;
	}

	public static void main(String[] args) {
		Fraction fraction = new Fraction(3, 2);
		Fraction fraction2 = new Fraction(6, 2);
		MixedNumber equalMixed = new MixedNumber(1, 1, 2);
		MixedNumber unequalMixed = new MixedNumber(0, 4, 5);
		printCompareTo(fraction, fraction2);
		printCompareTo(fraction, equalMixed);
		printCompareTo(equalMixed, unequalMixed);
		System.out.println();
		printEquals(fraction, fraction2);
		printEquals(fraction, equalMixed);
		printEquals(equalMixed, unequalMixed);
		System.out.println();

		List<Num> list = randomList(20, 10);
		System.out.println("Unsorted:\t" + list);
		Collections.sort(list);
		System.out.println("Sorted:\t" + list);


	}
}
