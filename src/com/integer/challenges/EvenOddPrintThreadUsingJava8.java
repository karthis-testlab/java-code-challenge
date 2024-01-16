package com.integer.challenges;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrintThreadUsingJava8 {

	private static Object object = new Object();
	
	private static IntPredicate evenCondition = even -> even % 2 == 0;
	private static IntPredicate oddCondition = odd -> odd % 2 != 0;

	public static void main(String[] args) throws InterruptedException {
		
		CompletableFuture.runAsync( () -> EvenOddPrintThreadUsingJava8.printNumber(oddCondition) );
		CompletableFuture.runAsync( () -> EvenOddPrintThreadUsingJava8.printNumber(evenCondition) );
		Thread.sleep(1000);

	}
	
	public static void printNumber(IntPredicate condition) {
		IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddPrintThreadUsingJava8::execute);
	}

	public static void execute(int number) {
		synchronized (object) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + number);
				object.notify();
				object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}