package pattern.singleton;


public class EstudoSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.nome);
		singleton.nome = "Robson Mattos";
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.nome);
	}

}