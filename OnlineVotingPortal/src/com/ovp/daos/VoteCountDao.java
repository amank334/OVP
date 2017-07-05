package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.VoteCount;
import com.ovp.utilities.ConnectionPool;

public class VoteCountDao {

	public void create(VoteCount voteCount) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into vote_count (candidate_id ,election_id,total_votes) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, voteCount.getCandidateId());
			ps.setInt(2, voteCount.getElectionId());
			ps.setInt(3, voteCount.getTotalVotes());
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(VoteCount voteCount) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  vote_count set election_id = ?,candidate_id  = ?,total_votes = ? "
					+ "where votecount_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voteCount.getCandidateId());
			ps.setInt(2, voteCount.getElectionId());
			ps.setInt(3, voteCount.getTotalVotes());
			ps.setInt(4, voteCount.getVoteCountId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a row. " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int voteCountId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   vote_count  where votecount_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voteCountId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public VoteCount find(int voteCountId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		VoteCount voteCount = new VoteCount();
		try {
			String sql = "select * from  vote_count  where votecount_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voteCountId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				voteCount.setVoteCountId(voteCountId);
				voteCount.setElectionId(rs.getInt("election_id"));
				voteCount.setCandidateId(rs.getInt("candidate_id"));
			
				voteCount.setTotalVotes(rs.getInt("total_votes"));
			

			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return voteCount;
	}

	public ArrayList<VoteCount> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<VoteCount> listVoteCount = new ArrayList<VoteCount>();
		try {
			String sql = "select * from  vote_count ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				VoteCount voteCount = new VoteCount();
				voteCount.setVoteCountId(rs.getInt("votecount_id"));
				voteCount.setElectionId(rs.getInt("election_id"));
				voteCount.setCandidateId(rs.getInt("candidate_id"));
			
				voteCount.setTotalVotes(rs.getInt("total_votes"));
				listVoteCount.add(voteCount);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to findall " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listVoteCount;
	}

	public static void main(String args[]) {

//		 VoteCount voteCount = new VoteCount(58,  56,57, 25);
//		 VoteCountDao obj = new VoteCountDao();
//		 obj.create(voteCount);

//		 VoteCount voteCount = new VoteCount(1,  2,3,  250000 );
//		 VoteCountDao obj = new VoteCountDao();
//		 obj.edit(voteCount);

//		 VoteCountDao obj = new VoteCountDao();
//		 obj.remove(2);

//		 VoteCountDao obj = new VoteCountDao();
//		 VoteCount voteCount = obj.find(1);
//		 System.out.println(voteCount);

//		 VoteCountDao obj = new VoteCountDao();
//		 ArrayList<VoteCount> all = obj.findAll();
//		 for (VoteCount voteCount : all)
//		 System.out.println(voteCount);

	}
}
