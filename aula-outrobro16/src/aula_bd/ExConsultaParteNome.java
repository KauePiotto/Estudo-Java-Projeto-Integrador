package aula_bd;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import aula_bd.*;

public class ExConsultaParteNome {
	ConectaMySQL cm = new ConectaMySQL();

	public static void main(String[] args) throws Exception {
		MetodosComuns mc = new MetodosComuns();
		List<alunos> alunos = new ExConsultaParteNome()
				.consultar(JOptionPane.showInputDialog("Digite o nome do aluno a ser consultado:"));
		System.out.println("Data: " + mc.lerData() + " Hora: " + mc.lerHora());
		for (alunos aluno : alunos) {
			System.out.println(aluno);
		}
	}

	public List<alunos> consultar(String nome) throws Exception {
		String queryCmd = "select * from alunos where " + "alunosNome like ? ";
		List<alunos> alunos = new ArrayList<alunos>();
		Connection con = null;
		try {
			con = cm.openDB();
			PreparedStatement ps1 = con.prepareStatement(queryCmd);
			ps1.setString(1, (nome != null ? '%' + nome.trim() + '%' : ""));
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("alunosid");
				String nomeAluno = rs.getString("alunosNome");
				double nota = rs.getDouble("alunosNota");
				String telefone = rs.getString("alunosTelefone");
				alunos novo = new alunos(id, nomeAluno, telefone, nota);
				alunos.add(novo);
			}
		} catch (SQLException e) {
			throw new Exception(e); // encapsula excecao original
		} finally {
			cm.closeDB();
		}
		return alunos;
	}
}