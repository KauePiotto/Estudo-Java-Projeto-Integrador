package aula_bd;

public class alunos {
	private int id;
	private String nome, telefone;
	private double nota;

	public alunos() {

	}

	public alunos(String nome, String telefone, double nota) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nota = nota;
	}

	public alunos(int id, String nome, String telefone, double nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", telefone=" + telefone + ", id=" + id + ", nota=" + nota + "]";
	}

	public void imprimirAluno() {
		System.out.format("\n%-4d %-30s %-25s %,4.2f", getId(), getNome(), getTelefone(), getNota());
	}
}
