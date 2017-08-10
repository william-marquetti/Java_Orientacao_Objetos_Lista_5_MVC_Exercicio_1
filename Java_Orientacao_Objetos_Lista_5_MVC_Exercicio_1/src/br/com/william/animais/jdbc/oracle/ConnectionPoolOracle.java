package br.com.william.animais.jdbc.oracle;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class ConnectionPoolOracle {

	private PooledConnection pool;

	public ConnectionPoolOracle() throws SQLException {
		OracleConnectionPoolDataSource ocpds = new OracleConnectionPoolDataSource();
		ocpds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		ocpds.setUser("animais");
		ocpds.setPassword("animais");
		pool = ocpds.getPooledConnection();
	}

	public Connection getConnection() throws SQLException {
		return pool.getConnection();
	}

}