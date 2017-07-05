package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.Result;
import com.ovp.utilities.ConnectionPool;

public class ResultDao {

	public void create(Result result) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into result (election_id,candidate_id ,final_result,total_votes,unique_const_id) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, result.getElectionId());
			ps.setInt(2, result.getCandidateId());
			ps.setString(3, result.getFinalResult());
			ps.setInt(4, result.getTotalVotes());
			ps.setString(5, result.getUniqueConstId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(Result result) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  result set election_id = ?,candidate_id  = ?,final_result = ?,total_votes = ?,unique_const_id= ? "
					+ "where result_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, result.getElectionId());
			ps.setInt(2, result.getCandidateId());
			ps.setString(3, result.getFinalResult());
			ps.setInt(4, result.getTotalVotes());
			ps.setString(5, result.getUniqueConstId());
			ps.setInt(6, result.getResultId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a row. " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int resultId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   result  where result_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, resultId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public Result find(int resultId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Result result = new Result();
		try {
			String sql = "select * from  Result  where result_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, resultId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				result.setResultId(resultId);
				result.setElectionId(rs.getInt("election_id"));
				result.setCandidateId(rs.getInt("candidate_id"));
				result.setUniqueConstId(rs.getString("unique_const_id"));
				result.setTotalVotes(rs.getInt("total_votes"));
				result.setFinalResult(rs.getString("final_result"));

			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return result;
	}

	public ArrayList<Result> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Result> listResult = new ArrayList<Result>();
		try {
			String sql = "select * from  result ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Result result = new Result();
				result.setResultId(rs.getInt("result_id"));
				result.setElectionId(rs.getInt("election_id"));
				result.setCandidateId(rs.getInt("candidate_id"));
				result.setUniqueConstId(rs.getString("unique_const_id"));
				result.setTotalVotes(rs.getInt("total_votes"));
				result.setFinalResult(rs.getString("final_result"));
				
				listResult.add(result);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to findall " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listResult;
	}

	public static void main(String args[]) {

//		 Result result = new Result(58,  56,57, "zcvbn", 25, "fgf");
//		 ResultDao obj = new ResultDao();
//		 obj.create(result);

//		 Result result = new Result(1,  2,3, "won", 250000, "p_52");
//		 ResultDao obj = new ResultDao();
//		 obj.edit(result);

//		 ResultDao obj = new ResultDao();
//		 obj.remove(2);

//		 ResultDao obj = new ResultDao();
//		 Result result = obj.find(3);
//		 System.out.println(result);

		 ResultDao obj = new ResultDao();
		 ArrayList<Result> all = obj.findAll();
		 for (Result result : all)
		 System.out.println(result);

	}
}
