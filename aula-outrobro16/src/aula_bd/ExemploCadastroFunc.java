package aula_bd;

import java.sql.*;
import javax.swing.*;

public class ExemploCadastroFunc {
	public static void main(String[] args) {
		try {
			ConectaMySQL conexao = new ConectaMySQL();
			Connection cn = conexao.openDB();
			PreparedStatement ps = cn.prepareStatement("INSERT INTO funcionarios "
					+ "(nomeFuncionarios, idadeFuncionarios, setorFuncionarios)" + "VALUES (?, ?, ?)");
			ps.setString(1, JOptionPane.showInputDialog("Nome:", "Marcela Souza"));// nome
			ps.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Idade:", "25"))) ;// Idade
			ps.setString(3, JOptionPane.showInputDialog("Setor:", "Secretaria"));// Setor
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
			
			conexao.closeDB(cn, ps, null);
//			System.out.println("ConexÃ£o encerrada.");            
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operaÃ§Ã£o.");
			e.printStackTrace();
		}
	}
}