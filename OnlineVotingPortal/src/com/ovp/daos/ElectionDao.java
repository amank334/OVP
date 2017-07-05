package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.ovp.pojos.Election;
import com.ovp.utilities.ConnectionPool;
import com.ovp.utilities.DateUtils;

public class ElectionDao {
	public void create(Election election) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into election (election_date, election_type, election_state) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			java.sql.Date dt = new java.sql.Date(election.getElectionDate().getTime());
			ps.setDate(1, dt);
			ps.setString(2, election.getElectionType());

			ps.setString(3, election.getElectionState());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(Election election) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update election set election_date = ?, election_type = ?, election_state = ? where election_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			java.sql.Date dt = new java.sql.Date(election.getElectionDate().getTime());
			ps.setDate(1, dt);
			ps.setString(2, election.getElectionType());

			ps.setString(3, election.getElectionState());
			ps.setInt(4, election.getElectionId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a row. " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int electionId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   election  where election_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, electionId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public Election find(int electionId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Election election = new Election();
		try {
			String sql = "select * from  election  where election_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, electionId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				election.setElectionId(electionId);
				java.sql.Date dt = rs.getDate("election_date");
				election.setElectionDate(new java.util.Date(dt.getTime()));
				election.setElectionType(rs.getString("election_type"));

				election.setElectionState(rs.getString("election_state"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return election;
	}

	public ArrayList<Election> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Election> listelection = new ArrayList<Election>();
		try {
			String sql = "select * from  election ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Election election = new Election();
				election.setElectionId(rs.getInt("election_id"));
				java.sql.Date dt = rs.getDate("election_date");
				election.setElectionDate(new java.util.Date(dt.getTime()));
				election.setElectionType(rs.getString("election_type"));

				election.setElectionState(rs.getString("election_state"));
				listelection.add(election);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to findall " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listelection;
	}

	public static void main(String args[]) {
		java.util.Date dt = DateUtils.convertDate("28-10-2015");
		
		Election election = new Election(58, dt, "dgdsf","wwqeqw");
		ElectionDao obj = new ElectionDao();
		obj.create(election);

//		 Election election = new Election(1, dt,"abhi", "a_hdiash","vidhan");
//		 ElectionDao obj = new ElectionDao();
//		 obj.edit(election);

//		 ElectionDao obj = new ElectionDao();
//		 obj.remove(1);

//		 ElectionDao obj = new ElectionDao();
//		 Election election = obj.find(2);
//		 System.out.println(election);

//		 ElectionDao obj = new ElectionDao();
//		 ArrayList<Election> all = obj.findAll();
//		 for (Election election : all)
//		 System.out.println(election);
	}
}
	
