package org.growthTech.dao.imp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.growthTech.dao.CardDAO;
import org.growthTech.entity.Card;

public class JdbcCardDAO extends BaseDAO implements CardDAO {
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void insert(Card card) {
		String sql = "INSERT INTO card " +
				"(id, fk_teacher_id, title , author, summary, cover, content, original_link, create_time, send_time, is_sent) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, card.getId());
			ps.setInt(2, card.getTeacherId());
			ps.setString(3, card.getTitle());
			ps.setString(4, card.getAuthor());
			ps.setString(5, card.getSummary());
			try {
				ps.setBinaryStream(6, card.getCover().getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ps.setString(7, card.getContent());
			ps.setString(8, card.getOriginalLink());
			ps.setDate(9, card.getCreateTime());
			ps.setDate(10, card.getSendTime());
			ps.setInt(11, card.getIsSent());
			
	
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
	public List<Card> findAllCards() {
		List<Card> cards = new ArrayList<Card>();
		String sql = "SELECT * FROM card";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Card card = new Card(
					rs.getInt("id"),
					rs.getInt("fk_teacher_id"), 
					rs.getString("title"),
					rs.getString("author"),
					rs.getString("summary"),
					rs.getString("content"),
					rs.getString("original_link"),
					rs.getDate("create_time"),
					rs.getDate("send_time"),
					rs.getInt("is_sent")
				);
				
				cards.add(card);
			}
			rs.close();
			ps.close();
			
			return cards;
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
