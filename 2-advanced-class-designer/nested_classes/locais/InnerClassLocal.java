package nested_classes.locais;

public class InnerClassLocal {

	public static void main(String[] args) {
		InnerClassLocal innerClassLocal = new InnerClassLocal();
	    innerClassLocal.m1();
	}

	// só pode ser instanciada dentro de onde foi definida
	//  you can define a local class in a method body, a for loop, or an if clause.
	void m1() {
		class ClasseInternaLocal {
			public Integer numero = 10;
			
			public void m1() {
				System.out.println("ClasseInternaLocal - m1() - " + numero);
			}
		}
		
		ClasseInternaLocal classeInternaLocal = new ClasseInternaLocal();
		classeInternaLocal.m1();
	}
	
}
