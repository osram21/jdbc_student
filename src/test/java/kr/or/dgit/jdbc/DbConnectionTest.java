package kr.or.dgit.jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.util.ConnectionFactory;

public class DbConnectionTest {
	private static Connection connection;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		connection = ConnectionFactory.getConnection();
	}
	
	@AfterClass
	public static void tearDiwnAfterClass() throws Exception{
		connection = null;
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
