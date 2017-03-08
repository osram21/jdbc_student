package kr.or.dgit.jdbc;

import java.sql.Connection;
import java.util.Date;

import kr.or.dgit.jdbc.dto.Student;
import kr.or.dgit.jdbc.service.StudentServive;
import kr.or.dgit.jdbc.util.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
		Connection connection = ConnectionFactory.getConnection();
		System.out.println(connection);
		
		StudentServive service = StudentServive.getInstance();
		Student student = new Student();
		student.setStudId(1);
		student.setName("디지몬");
		student.setEmail("osram21@naver.com");
		student.setDob(new Date());
		
		service.insertStudent(student);
	}
}
