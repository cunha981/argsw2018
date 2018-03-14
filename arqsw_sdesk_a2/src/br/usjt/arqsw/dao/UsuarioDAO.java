package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Usuario;

@Repository
public class UsuarioDAO {

	private Connection conn;

	@Autowired
	public UsuarioDAO(DataSource dataSource) throws IOException {
		try {
			this.conn = dataSource.getConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}

	public Usuario obterPorUsuario(String userName) throws IOException {
		String query = "select * from USUARIO where USERNAME = ?";
		Usuario usuario = null;
		try (PreparedStatement pst = conn.prepareStatement(query);) {

			pst.setString(1, userName);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				usuario = new Usuario();
				usuario.setUsuario(rs.getString("USERNAME"));
				usuario.setSenha(rs.getString("PASSWORD"));
			}

		} catch (SQLException e) {
			throw new IOException(e);
		}
		return usuario;
	}
}
