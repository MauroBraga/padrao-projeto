package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.OracleFactory;
import br.com.cod3r.factory.app.dbadapter.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {
		DB db = new PostgresFactory().getDatabase();
		DB dbO = new OracleFactory().getDatabase();
	}
}
