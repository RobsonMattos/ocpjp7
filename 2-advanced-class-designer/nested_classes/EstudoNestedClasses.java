package nested_classes;

// static - called static nested classes
// non-static - called inner classes(local classes and anonymous classes)
// As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. 
// (Recall that outer classes can only be declared public or package private.)
public class EstudoNestedClasses {

	static class StaticNestedClass {
		// ...
	}

	class InnerClass {
		// ...
	}

	public static void main(String[] args) {
		//instantiate a static nested class
		EstudoNestedClasses.StaticNestedClass staticNestedClass = new EstudoNestedClasses.StaticNestedClass();
		
		// instantiate an innerclass
		EstudoNestedClasses estudoNestedClasses = new EstudoNestedClasses();
		EstudoNestedClasses.InnerClass innerClass = estudoNestedClasses.new InnerClass();
	}

}