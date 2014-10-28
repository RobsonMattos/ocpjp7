package ocpjp7;

// Don't use assertions to validate arguments to a public method
// Do use assertions to validate arguements to a private method
// Do use assertions - even in public methods - to validate that a particular code block will
// never be reached
public class EstudoAssertion {

	public static void main(String[] args) {
		print(100);

	}
	
	private static void print(int idade) {
		assert(idade > 0 & idade < 90); // se false lança um AssertionError
		System.out.println(idade);
	}

}
