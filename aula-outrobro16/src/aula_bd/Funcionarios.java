package aula_bd;

public class Funcionarios {
	private int id;
	private String nomeFuncionarios, setorFuncionario;
	private int idade;

	public Funcionarios() {

	}

	public Funcionarios(String nomeFuncionarios, String setorFuncionario, int idade) {
		super();
		this.nomeFuncionarios = nomeFuncionarios;
		this.setorFuncionario = setorFuncionario;
		this.idade = idade;
	}

	public Funcionarios(int id, String nomeFuncionarios, int idade, String setorFuncionario) {
		super();
		this.id = id;
		this.nomeFuncionarios = nomeFuncionarios;
		this.setorFuncionario = setorFuncionario;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeFuncionarios() {
		return nomeFuncionarios;
	}

	public void setNomeFuncionarios(String nomeFuncionarios) {
		this.nomeFuncionarios = nomeFuncionarios;
	}

	public String getSetorFuncionario() {
		return setorFuncionario;
	}

	public void setSetorFuncionario(String setorFuncionario) {
		this.setorFuncionario = setorFuncionario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nomeFuncionarios=" + nomeFuncionarios + ", setorFuncionario="
				+ setorFuncionario + ", idade=" + idade + "]";
	}

	public void imprimirFuncionarios() {
		System.out.format("\n%-4d %-30s %-25s %,4.2f", getId(), getNomeFuncionarios(), getIdade(),
				getSetorFuncionario());
	}
}