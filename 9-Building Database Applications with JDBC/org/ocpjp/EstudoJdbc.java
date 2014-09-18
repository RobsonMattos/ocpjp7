package org.ocpjp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ocpjp.dao.FamiliaDao;
import org.ocpjp.model.Familia;
import org.ocpjp.util.ReadFileDao;

public class EstudoJdbc {

	public static void main(String[] args) throws SQLException {
		FamiliaDao familiaDao = new FamiliaDao();
		List<Familia> familiaList = new ArrayList<>();

		familiaDao.deletarTodos();
		familiaDao.inserir(new ReadFileDao().getMembros());
		familiaList = familiaDao.obter();
	}
}
