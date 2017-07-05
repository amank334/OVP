package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.StateParty;
import com.ovp.utilities.ConnectionPool;

public class StatePartyDao {


	public static int verify(String StatePartyEmail, String StatePartyPassword) {
		int id = -1;

		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select state_party_id from StateParty where state_party_email = ? and state_party_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, StatePartyEmail);
			ps.setString(2, StatePartyPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("state_party_id");
			}
			
		} catch (SQLException sq) {
			System.out.println("StateParty not exist." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;
	}

	public void create(StateParty StateParty) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into StateParty (state_party_user_id,state_party_password,state_party_state,state_party_cm,state_party_cm_photo,party_id,party_details,details_"
					+ "edited,state_party_email) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, StateParty.getStatePartyUserId());
			ps.setString(2, StateParty.getStatePartyPassword());
			ps.setString(3, StateParty.getStatePartyState());
			ps.setString(4, StateParty.getStatePartyCm());
			ps.setString(5, StateParty.getStatePartyCmPhoto());
			ps.setInt(6, StateParty.getPartyId());
			ps.setString(7, StateParty.getPartyDetails());
			ps.setString(8, StateParty.getDetailsEdited());
			ps.setString(9, StateParty.getStatePartyEmail());
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(StateParty StateParty) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  StateParty set state_party_user_id =?,state_party_password=?,state_party_state=?,state_party_cm=?,state_party_cm_photo=?,party_id=?,party_details=?,details_"
					+ "edited=?,state_party_email=? where state_party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, StateParty.getStatePartyUserId());
			ps.setString(2, StateParty.getStatePartyPassword());
			ps.setString(3, StateParty.getStatePartyState());
			ps.setString(4, StateParty.getStatePartyCm());
			ps.setString(5, StateParty.getStatePartyCmPhoto());
			ps.setInt(6, StateParty.getPartyId());
			ps.setString(7, StateParty.getPartyDetails());
			ps.setString(8, StateParty.getDetailsEdited());
			ps.setString(9, StateParty.getStatePartyEmail());
			ps.setInt(10, StateParty.getStatePartyId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int StatePartyId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from StateParty where state_party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, StatePartyId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public StateParty find(int StatePartyId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		StateParty StateParty = new StateParty();
		try {
			String sql = "select * from StateParty where state_party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, StatePartyId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				StateParty.setStatePartyId(rs.getInt("state_party_user_id"));
				StateParty.setStatePartyPassword(rs.getString("state_party_password"));
				StateParty.setStatePartyState(rs.getString("state_party_state"));
				StateParty.setStatePartyCm(rs.getString("state_party_cm"));
				StateParty.setStatePartyCmPhoto(rs.getString("state_party_cm_photo"));
				StateParty.setPartyId(rs.getInt("party_id"));
				StateParty.setPartyDetails(rs.getString("party_details"));
				StateParty.setDetailsEdited(rs.getString("details_edited"));
				StateParty.setStatePartyEmail(rs.getString("state_party_email"));
				}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return StateParty;
	}

	public ArrayList<StateParty> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<StateParty> listStateParty = new ArrayList<StateParty>();
		try {
			String sql = "select * from StateParty ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StateParty StateParty = new StateParty();
				StateParty.setStatePartyId(rs.getInt("state_party_id"));
				StateParty.setStatePartyId(rs.getInt("state_party_user_id"));
				StateParty.setStatePartyPassword(rs.getString("state_party_password"));
				StateParty.setStatePartyState(rs.getString("state_party_state"));
				StateParty.setStatePartyCm(rs.getString("state_party_cm"));
				StateParty.setStatePartyCmPhoto(rs.getString("state_party_cm_photo"));
				StateParty.setPartyId(rs.getInt("party_id"));
				StateParty.setPartyDetails(rs.getString("party_details"));
				StateParty.setDetailsEdited(rs.getString("details_edited"));
				StateParty.setStatePartyEmail(rs.getString("state_party_email"));
				
				listStateParty.add(StateParty);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listStateParty;
	}

	public static void main(String args[]) {
		
		 StatePartyDao obj = new StatePartyDao();
		System.out.println(obj.verify("bjp@g", "bjp"));

//		 StateParty StateParty = new StateParty(58, "gdfdfds", "no", "fgbg","sdfsf","sdfsdf","sfsdf","sfsdf","sfd","sfdf","fghgf");
//		 StatePartyDao obj = new StatePartyDao();
//		 obj.create(StateParty);

//		 StateParty StateParty = new StateParty(4, "abhi", "yes","L:/","shan","shank","prime","P:/","yes","@gamil","yes");
//		 StatePartyDao obj = new StatePartyDao();
//		 obj.edit(StateParty);

//		 StatePartyDao obj = new StatePartyDao();
//		 obj.remove(5);

//		 StatePartyDao obj = new StatePartyDao();
//		 StateParty StateParty = obj.find(1);
//		 System.out.println(StateParty);

//		 StatePartyDao obj = new StatePartyDao();
//		 ArrayList<StateParty> all = obj.findAll();
//		 for (StateParty StateParty : all)
//		 System.out.println(StateParty);
	}

	
	
}
