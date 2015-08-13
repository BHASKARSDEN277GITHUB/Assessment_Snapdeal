package com.snap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.snap.models.Answer;
import com.snap.models.Assessment;
import com.snap.models.Question;

public class AssessmentDao {
	private DriverManagerDataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DriverManagerDataSource ds) {
		this.ds = ds;
	}

	// insert Assessment into table assessment
	public int insertAssessment(Assessment a) { //returns assessment id

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement(
					"insert into assessments (name) values(?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, a.getName());
			// ps.setString(2, a.getPassword());

			ps.executeUpdate();
			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					throw new SQLException(
							"inserting assessment failed..!!\nno id obtained.");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	// insert Question into table question
	public int insertQuestion(Question q) {//returns question id
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement(
					"insert into questions (ass_id,question,ans_id) values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, q.getAssId());
			ps.setString(2, q.getQuestion());
			ps.setInt(3,q.getAnsId());
			
			ps.executeUpdate();
			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					throw new SQLException(
							"inserting assessment failed..!!\nno id obtained.");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	// insert Answer into table answer
	public int insertAnswer(Answer a) { // return answer id
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = ds.getConnection();
			ps = conn.prepareStatement(
					"insert into answers (qid,choice) values(?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, a.getqId());
			ps.setString(2, a.getcValue());

			ps.executeUpdate();
			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					/* System.out.println(rs.getLong(1)); */
					return rs.getInt(1);
				} else {
					throw new SQLException(
							"inserting answer failed..!!\nno id obtained.");
				}

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	}

}
