package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.MainAdmin;
import com.ovp.utilities.ConnectionPool;

public class MainAdminDao {

	public static int verify(String adminEmail, String adminPassword) {
		int id = -1;

		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select admin_id from main_admin where admin_email = ? and admin_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, adminEmail);
			ps.setString(2, adminPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("admin_id");
			}
			
		} catch (SQLException sq) {
			System.out.println("Admin not exist." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;
	}

	public void create(MainAdmin mainAdmin) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into main_admin (admin_user_id, admin_password, admin_email) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mainAdmin.getAdminUserId());
			ps.setString(2, mainAdmin.getAdminPassword());
			ps.setString(3, mainAdmin.getAdminEmail());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(MainAdmin mainAdmin) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  main_admin set admin_user_id= ?, admin_password= ?, admin_email= ? where admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mainAdmin.getAdminUserId());
			ps.setString(2, mainAdmin.getAdminPassword());
			ps.setString(3, mainAdmin.getAdminEmail());
			ps.setInt(4, mainAdmin.getAdminId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int adminId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from main_admin where admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, adminId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public MainAdmin find(int adminId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		MainAdmin mainAdmin = new MainAdmin();
		try {
			String sql = "select * from main_admin where admin_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, adminId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				mainAdmin.setAdminId(rs.getInt("admin_id"));
				mainAdmin.setAdminUserId(rs.getString("admin_user_id"));
				mainAdmin.setAdminPassword(rs.getString("admin_password"));
				mainAdmin.setAdminEmail(rs.getString("admin_email"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return mainAdmin;
	}

	public ArrayList<MainAdmin> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<MainAdmin> listMainAdmin = new ArrayList<MainAdmin>();
		try {
			String sql = "select * from  main_admin ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MainAdmin mainAdmin = new MainAdmin();
				mainAdmin.setAdminId(rs.getInt("admin_id"));
				mainAdmin.setAdminUserId(rs.getString("admin_user_id"));
				mainAdmin.setAdminPassword(rs.getString("admin_password"));
				mainAdmin.setAdminEmail(rs.getString("admin_email"));

				listMainAdmin.add(mainAdmin);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listMainAdmin;
	}

	public static void main(String args[]) {

		MainAdminDao obj = new MainAdminDao();
		System.out.println(obj.verify("abhishek001.cs@gmail.com", "abhishek"));
		
		
		// MainAdmin mainAdmin = new MainAdmin(58, "zxcvbn", "no", "fgbg");
		// MainAdminDao obj = new MainAdminDao();
		// obj.create(mainAdmin);

		// MainAdmin mainAdmin = new MainAdmin(1, "abhi", "yes","@gmail");
		// MainAdminDao obj = new MainAdminDao();
		// obj.edit(mainAdmin);

		// MainAdminDao obj = new MainAdminDao();
		// obj.remove(3);

		// MainAdminDao obj = new MainAdminDao();
		// MainAdmin mainAdmin = obj.find(2);
		// System.out.println(mainAdmin);

		// MainAdminDao obj = new MainAdminDao();
		// ArrayList<MainAdmin> all = obj.findAll();
		// for (MainAdmin mainAdmin : all)
		// System.out.println(mainAdmin);
	}

}
