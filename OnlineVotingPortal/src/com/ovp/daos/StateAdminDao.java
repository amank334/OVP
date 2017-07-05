package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.StateAdmin;
import com.ovp.utilities.ConnectionPool;

public class StateAdminDao {

	public static int verify(String stateAdminEmail, String stateAdminPassword) {
		int id = -1;

		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select state_admin_id from state_admin where state_admin_email = ? and state_admin_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, stateAdminEmail);
			ps.setString(2, stateAdminPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("state_admin_id");
			}

		} catch (SQLException sq) {
			System.out.println("State Admin not exist." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;
	}

	public void create(StateAdmin StateAdmin) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into state_admin (admin_state,state_admin_password, state_admin_email,state_admin_user_id) values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, StateAdmin.getAdminState());
			ps.setString(2, StateAdmin.getStateAdminPassword());
			ps.setString(3, StateAdmin.getStateAdminEmail());
			ps.setString(4, StateAdmin.getStateAdminUserId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(StateAdmin StateAdmin) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  state_admin set admin_state= ?,state_admin_user_id= ?, state_admin_password= ?, state_admin_email = ? where state_admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, StateAdmin.getAdminState());
			ps.setString(2, StateAdmin.getStateAdminUserId());
			ps.setString(3, StateAdmin.getStateAdminPassword());
			ps.setString(4, StateAdmin.getStateAdminEmail());
			ps.setInt(5, StateAdmin.getStateAdminId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int stateadminId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from state_admin where state_admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, stateadminId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public StateAdmin find(int stateadminId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		StateAdmin stateAdmin = new StateAdmin();
		try {
			String sql = "select * from State_admin where state_admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, stateadminId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				stateAdmin.setStateAdminId(rs.getInt("state_admin_id"));
				stateAdmin.setAdminState(rs.getString("admin_state"));
				stateAdmin.setStateAdminUserId(rs.getString("state_admin_user_id"));
				stateAdmin.setStateAdminPassword(rs.getString("state_admin_password"));
				stateAdmin.setStateAdminEmail(rs.getString("state_admin_email"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return stateAdmin;
	}

	public ArrayList<StateAdmin> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<StateAdmin> listStateAdmin = new ArrayList<StateAdmin>();
		try {
			String sql = "select * from state_admin ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StateAdmin stateAdmin = new StateAdmin();

				stateAdmin.setStateAdminId(rs.getInt("state_admin_id"));
				stateAdmin.setAdminState(rs.getString("admin_state"));
				stateAdmin.setStateAdminUserId(rs.getString("state_admin_user_id"));
				stateAdmin.setStateAdminPassword(rs.getString("state_admin_password"));
				stateAdmin.setStateAdminEmail(rs.getString("state_admin_email"));

				listStateAdmin.add(stateAdmin);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listStateAdmin;
	}

	public static void main(String args[]) {

		// StateAdminDao obj = new StateAdminDao();
		// System.out.println(obj.verify("MP@gmail.com", "mp"));

		// StateAdmin stateAdmin = new StateAdmin(58, "jhshjb","zxcvbn", "no",
		// "fgbg");
		// StateAdminDao obj = new StateAdminDao();
		// obj.create(stateAdmin);

		// StateAdmin stateAdmin = new StateAdmin(1,
		// "MP","abhi","shan","@gmail");
		// StateAdminDao obj = new StateAdminDao();
		// obj.edit(stateAdmin);

		// StateAdminDao obj = new StateAdminDao();
		// obj.remove(3);

		// StateAdminDao obj = new StateAdminDao();
		// StateAdmin stateAdmin = obj.find(1);
		// System.out.println(stateAdmin);

		// StateAdminDao obj = new StateAdminDao();
		// ArrayList<StateAdmin> all = obj.findAll();
		// for (StateAdmin stateAdmin : all)
		// System.out.println(stateAdmin);
	}

}
