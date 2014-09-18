
public class Estudo2 {
	
	enum Familia {
		ROBSON(46), SANDRA(48), JUNIOR(21), CAIO(18);
		
		private Integer idade;
		
		Familia(Integer idade) {
			this.idade = idade;
		}
	}
	
	public static void main(String[] args) {
		for(Familia familia : Familia.values()) {
			System.out.println(familia.idade);
		}
	}
	
}
