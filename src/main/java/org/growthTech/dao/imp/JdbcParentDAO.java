package org.growthTech.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.growthTech.dao.ParentDAO;
import org.growthTech.entity.Parent;

public class JdbcParentDAO extends BaseDAO implements ParentDAO {
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Parent parent) {
		String sql = "INSERT INTO user_parent " +
				"(id, token_id, name) VALUES (?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, parent.getId());
			ps.setString(2, parent.getTokenId());
			ps.setString(3, parent.getName());
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
	public Parent getParentByTokenId(String tokenId) {
		Parent parent = null;
		String sql = "SELECT * FROM user_parent where token_id = ?";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tokenId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {				
				parent = new Parent(
					rs.getInt("id"),
					rs.getString("token_id"), 
					rs.getString("name")
				);
				
			}
			rs.close();
			ps.close();
			
			return parent;
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
	public List<Parent> findAllParents() {
		List<Parent> parents = new ArrayList<Parent>();
		String sql = "SELECT * FROM user_parent";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Parent parent = new Parent(
					rs.getInt("id"),
					rs.getString("token_id"), 
					rs.getString("name")
				);
				
				parents.add(parent);
			}
			rs.close();
			ps.close();
			
			return parents;
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
