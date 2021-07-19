
public class Pessoa {

	//ATRIBUTOS
	
	private String nome;
	private Integer idade;
	private Pessoa pai;
	private Pessoa mae;
	
	
	//CONSTRUTORES
	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
		this.pai = null;
		this.mae = null;
	}
	
	public Pessoa(String nome, Integer idade, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;
	}
	
	//GETTERS

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public Pessoa getPai() {
		return pai;
	}

	public Pessoa getMae() {
		return mae;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		return nome + ", " + idade;
	}
	
	public void fazAniversario() {
		idade++;
	}
	
	
}
