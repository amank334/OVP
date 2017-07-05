package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.Candidate;

import com.ovp.utilities.ConnectionPool;
import com.ovp.utilities.DateUtils;

public class CandidateDao {
	public void create(Candidate candidate) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into candidate (candidate_name, party_id, election_id, unique_const_id, candidate_photo,candidate_nominated) values (?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, candidate.getCandidateName());
			ps.setInt(2, candidate.getPartyId());
			ps.setInt(3, candidate.getElectionId());
			ps.setString(4, candidate.getUniqueConstId());
			ps.setString(5, candidate.getCandidatePhoto());
			ps.setString(6, candidate.getCandidateNominated());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(Candidate candidate) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  candidate set candidate_name= ?, party_id= ?, election_id= ?, "
					+ "unique_const_id= ?, candidate_photo= ?,candidate_nominated=?  where candidate_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, candidate.getCandidateName());
			ps.setInt(2, candidate.getPartyId());
			ps.setInt(3, candidate.getElectionId());
			ps.setString(4, candidate.getUniqueConstId());
			ps.setString(5, candidate.getCandidatePhoto());
			ps.setString(6, candidate.getCandidateNominated());
			ps.setInt(7, candidate.getCandidateId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int candidateId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   candidate  where candidate_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, candidateId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public Candidate find(int candidateId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Candidate candidate = new Candidate();
		try {
			String sql = "select * from  candidate  where candidate_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, candidateId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				candidate.setCandidateId(candidateId);
				candidate.setCandidateName(rs.getString("candidate_name"));
				candidate.setPartyId(rs.getInt("party_id"));
				candidate.setElectionId(rs.getInt("election_id"));
				candidate.setUniqueConstId(rs.getString("unique_const_id"));
				candidate.setCandidatePhoto(rs.getString("candidate_photo"));
				candidate.setCandidateNominated(rs.getString("candidate_nominated"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return candidate;
	}

	public ArrayList<Candidate> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Candidate> listCandidate = new ArrayList<Candidate>();
		try {
			String sql = "select * from  candidate ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Candidate candidate = new Candidate();
				candidate.setCandidateId(rs.getInt("candidate_id"));
				candidate.setCandidateName(rs.getString("candidate_name"));
				candidate.setPartyId(rs.getInt("party_id"));
				candidate.setElectionId(rs.getInt("election_id"));
				candidate.setUniqueConstId(rs.getString("unique_const_id"));
				candidate.setCandidatePhoto(rs.getString("candidate_photo"));
				candidate.setCandidateNominated(rs.getString("candidate_nominated"));
				listCandidate.add(candidate);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find rows " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listCandidate;
	}
	
	
	
	public static void main(String args[]) {
		

//		 Candidate candidate = new Candidate(58,"fbdfvds", 25,69,"wfesfsef","xxcx","gjjuh");
//		 CandidateDao obj = new CandidateDao();
//		 obj.create(candidate);

//		 Candidate candidate = new Candidate(8,"Abhi", 1,2,"A_jkh","C:/","yes");
//		 CandidateDao obj = new CandidateDao();
//		 obj.edit(candidate);

//		 CandidateDao obj = new CandidateDao();
//		 obj.remove(9);

//		 CandidateDao obj = new CandidateDao();
//		 Candidate candidate = obj.find(8);
//		 System.out.println(candidate);

		 CandidateDao obj = new CandidateDao();
		 ArrayList<Candidate> all = obj.findAll();
		 for (Candidate candidate : all)
		 System.out.println(candidate);
	}

}
