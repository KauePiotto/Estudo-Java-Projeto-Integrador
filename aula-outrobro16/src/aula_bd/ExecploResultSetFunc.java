package aula_bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import aula_bd.*;

public class ExecploResultSetFunc {
	public static void main(String[] args) {
		try {
			ConectaMySQL conexao = new ConectaMySQL();
			Connection cn = conexao.openDB();
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM funcionarios");
			System.out.format("%-4S %-30S %-25S %-4S", "id", "Nome", "Idade", "Setor");
			System.out.print("\n-----------------------------" + "--------------------------------------");
			while (rs.next()) {
				int id = rs.getInt("idFuncionarios");
				String nome = rs.getString("nomeFuncionarios");
				int idade = rs.getInt("idadeFuncionarios");
				String setor = rs.getString("setorFuncionarios");
				Funcionarios novo = new Funcionarios(id, nome, idade, setor);
				novo.imprimirFuncionarios();
			}
			conexao.closeDB(cn, st, rs);
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação.");
			e.printStackTrace();
		}
	}
}
