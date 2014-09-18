package model;

public class Familia implements Comparable<Familia> {
	
	private String nome;
	private String sobreNome;
	private int idade;

	public Familia(int idade, String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
	}

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getSobreNome() { return sobreNome; }
	public void setSobreNome(String sobreNome) { this.sobreNome = sobreNome; }

	public int getIdade() { return idade; }
	public void setIdade(int idade) { this.idade = idade; }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Familia other = (Familia) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Familia o) {
		if (this.getNome().compareTo(o.getNome()) > 0) {
			return 1;
		} else if (this.getNome().compareTo(o.getNome()) < 0){
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return nome;

	}
}
