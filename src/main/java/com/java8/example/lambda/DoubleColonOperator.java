package com.java8.example.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DoubleColonOperator {

	public static void main(String[] args) {
		Java[] array = new Java[4];
		array[0] = new Java(2, "two");
		array[1] = new Java(10, "ten");
		array[2] = new Java(100, "hundred");
		array[3] = new Java(1, "one");

		System.out.println("Before sorting : " + Arrays.toString(array));
		Arrays.sort(array, Java::descendingOrder);
		System.out.println("After sorting - decending: " + Arrays.toString(array));
		Arrays.sort(array, Java::assendingOrder);
		System.out.println("After sorting - assending: " + Arrays.toString(array));

	}

}

class Java {

	int version;
	String name;

	public Java(int version, String name) {
		this.version = version;
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " version:" + version + " name:" + name;

	}

	public static int descendingOrder(Java j1, Java j2) {
		return j1.version - j2.version;
	}

	public static int assendingOrder(Java j1, Java j2) {
		return j2.version - j1.version;
	}

}
