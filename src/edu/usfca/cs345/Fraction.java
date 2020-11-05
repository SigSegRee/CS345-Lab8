package edu.usfca.cs345;

public class Fraction extends Num{
	private int numerator, denominator;

	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public double doubleValue() {
		return (double)numerator/denominator;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", numerator, denominator);
	}
}
