package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Fila;
import factory.ConnectionFactory;

public class FilaDAO {

	public ArrayList<Fila> listarFilas() throws IOException {
		ArrayList<Fila> lista = new ArrayList<>();

		String sql = "select id_fila, nm_Fila from fila";
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			while (rs.next()) {
				Fila fila = new Fila();

				fila.setId(rs.getInt("id_fila"));
				fila.setNome(rs.getString("nm_fila"));

				lista.add(fila);
			}

		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}

}
