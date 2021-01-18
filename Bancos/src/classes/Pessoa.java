package classes;

public class Pessoa {
	
	protected String nome;
	protected String email;
	
	public Pessoa(){	}
	
	public Pessoa (String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
}
