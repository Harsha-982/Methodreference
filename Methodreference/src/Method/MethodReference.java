package Method;

import java.util.function.BiFunction;

public class MethodReference {
	public static int sum(int a, int b) {
		return (a+b);
	}
	public static void main(String[] args) {
		i f=(a,b)->a+b;
		i f1=MethodReference::sum;
		System.out.println(f1.m1(10,29));
	}
}

interface i{
	public int m1(int a,int b);
}