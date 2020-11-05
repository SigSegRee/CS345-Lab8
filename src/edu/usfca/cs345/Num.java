package edu.usfca.cs345;

public abstract class Num extends Number implements Comparable<Num>{
	@Override
	public int compareTo(Num other) {
		double here = this.doubleValue(), there = other.doubleValue();
		if (here < there) {
			return -1;
		} else if (here == there) {
			return 0;
		}
		return 1;
	}

	@Override
	public int intValue() {
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		return (long)doubleValue();
	}

	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
}
