package edu.usfca.cs345;

public class MixedNumber extends Num{
	private int wholeNumber, numerator, denominator;

	public MixedNumber(int wholeNumber, int numerator, int denominator) {
		super();
		this.wholeNumber = wholeNumber;
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public double doubleValue() {
		return (double)wholeNumber + (double)numerator/denominator;
	}

	@Override
	public String toString() {
		return String.format("%d %d/%d", wholeNumber, numerator, denominator);
	}
}
