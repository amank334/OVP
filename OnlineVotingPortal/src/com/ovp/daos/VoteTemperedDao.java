package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.VoteTempered;
import com.ovp.utilities.ConnectionPool;

public class VoteTemperedDao {

	public void create(VoteTempered VoteTempered) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into vote_tempered (voter_id ,vote_given_to) values (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, VoteTempered.getVoterId());
			ps.setInt(2, VoteTempered.getVoteGivenTo());
			
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(VoteTempered VoteTempered) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update vote_tempered set voter_id =? ,vote_given_to = ? "
					+ "where vote_tempered_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, VoteTempered.getVoterId());
			ps.setInt(2, VoteTempered.getVoteGivenTo());
			
		
			ps.setInt(3, VoteTempered.getVoteTemperedId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a row. " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int voteTemperedId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   vote_tempered  where vote_tempered_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voteTemperedId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public VoteTempered find(int voteTemperedId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		VoteTempered voteTempered = new VoteTempered();
		try {
			String sql = "select * from  vote_tempered  where vote_tempered_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voteTemperedId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				voteTempered.setVoteTemperedId(voteTemperedId);
				voteTempered.setVoterId(rs.getInt("voter_id"));
				voteTempered.setVoteGivenTo(rs.getInt("vote_given_to"));
			
				
			

			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return voteTempered;
	}

	public ArrayList<VoteTempered> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<VoteTempered> listVoteTempered = new ArrayList<VoteTempered>();
		try {
			String sql = "select * from  vote_tempered ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				VoteTempered voteTempered = new VoteTempered();
				voteTempered.setVoteTemperedId(rs.getInt("vote_tempered_id"));
				voteTempered.setVoterId(rs.getInt("voter_id"));
				voteTempered.setVoteGivenTo(rs.getInt("vote_given_to"));
			
				listVoteTempered.add(voteTempered);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to findall " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listVoteTempered;
	}

	public static void main(String args[]) {

//		 VoteTempered voteTempered = new VoteTempered(768,  63,57);
//		 VoteTemperedDao obj = new VoteTemperedDao();
//		 obj.create(voteTempered);

//		 VoteTempered voteTempered = new VoteTempered(4,  56356,  250000 );
//		 VoteTemperedDao obj = new VoteTemperedDao();
//		 obj.edit(voteTempered);

//		 VoteTemperedDao obj = new VoteTemperedDao();
//		 obj.remove(3);

//		 VoteTemperedDao obj = new VoteTemperedDao();
//		 VoteTempered voteTempered = obj.find(1);
//		 System.out.println(voteTempered);

		 VoteTemperedDao obj = new VoteTemperedDao();
		 ArrayList<VoteTempered> all = obj.findAll();
		 for (VoteTempered voteTempered : all)
		 System.out.println(voteTempered);

	}
}
