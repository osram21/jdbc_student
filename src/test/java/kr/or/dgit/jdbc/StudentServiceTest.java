package kr.or.dgit.jdbc;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdbc.service.StudentServive;

public class StudentServiceTest {
	private static StudentServive studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentServive.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
