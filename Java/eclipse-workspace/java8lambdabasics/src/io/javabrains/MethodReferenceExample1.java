package io.javabrains;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread threadLambda = new Thread(() -> printMessage());
		Thread threadMethodReference = new Thread(new Thread(MethodReferenceExample1::printMessage));
		
		threadLambda.start();
		threadMethodReference.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
