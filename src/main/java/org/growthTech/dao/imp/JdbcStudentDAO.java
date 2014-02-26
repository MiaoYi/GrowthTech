package org.growthTech.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.growthTech.dao.StudentDAO;
import org.growthTech.entity.Student;

public class JdbcStudentDAO extends BaseDAO implements StudentDAO {
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	  
	@Override
	public void insert(Student student) {
		String sql = "INSERT INTO user_student " +
				"(id, token_id, name, student_number, class, grade, fk_parent_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getTokenId());
			ps.setString(3, student.getName());
			ps.setString(4, student.getStudentNumber());
			ps.setString(5, student.getClassNumber());
			ps.setString(6, student.getGrade());
			ps.setInt(7, student.getFk_parentId());
			ps.executeUpdate();
			ps.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> students = new ArrayList<Student>();
		String sql = "SELECT * FROM user_student";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student(
					rs.getInt("id"),
					rs.getString("token_id"), 
					rs.getString("name"),
					rs.getString("student_number"),
					rs.getString("class"),
					rs.getString("grade"),
					rs.getInt("fk_parent_id")
				);
				
				students.add(student);
			}
			rs.close();
			ps.close();
			
			return students;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
