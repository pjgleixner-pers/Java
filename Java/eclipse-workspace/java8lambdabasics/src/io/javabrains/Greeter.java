package io.javabrains;

public class Greeter {

	private void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		Greeting helloWorldGreeting = new HelloWorldGreeting();

		Greeting lambdaGreeting = () -> System.out.println("Hello lambda!");

		Greeting innerClassGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("Hello anonimus inner class!");

			}
		};

		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		innerClassGreeting.perform();

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		greeter.greet(() -> System.out.println("Hello Lambda in line!"));

	}

}
