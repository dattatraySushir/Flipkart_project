package com.classAssignment;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0, b=1,c;
	for (int i=1;i<=10;i++) {
		c=b+a;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
}
}
