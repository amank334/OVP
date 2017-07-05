package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.ovp.pojos.ParliamentConstituency;
import com.ovp.utilities.ConnectionPool;

public class ParliamentConstituencyDao {
	public void create(ParliamentConstituency parlConst) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into parliament_constituency(p_const_no, p_const_name,p_const_state,unique_const_id) values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,  parlConst.getpConstNo());
			ps.setString(2, parlConst.getpConstName());
			ps.setString(3, parlConst.getpConstState ());
			ps.setString(4, parlConst.getUniqueConstId ());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " );
		} finally {
			pool.putConnection(conn);
		}
	}
	
	
	public void edit(ParliamentConstituency parlConst) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  parliament_constituency set p_const_no = ?, p_const_name = ?,p_const_state = ?,unique_const_id= ? where p_const_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, parlConst.getpConstNo());
			ps.setString(2, parlConst.getpConstName());
			ps.setString(3, parlConst.getpConstState());
			ps.setString(4, parlConst.getUniqueConstId());
			ps.setInt(5, parlConst.getpConstId());
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}
	
	public void remove(int pConstId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from parliament_constituency where p_const_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, pConstId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}	
	
	public ParliamentConstituency find(int pConstId ) {
	ConnectionPool pool = ConnectionPool.getInstance();
	pool.initialize();
	Connection conn = pool.getConnection();
	ParliamentConstituency parlConst= new ParliamentConstituency();
	try {
		String sql = "select * from parliament_constituency where p_const_id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, pConstId);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			parlConst.setpConstId(rs.getInt("p_const_id"));
			parlConst.setpConstNo(rs.getInt("p_const_no"));
			parlConst.setpConstName(rs.getString("p_const_name"));
			parlConst.setpConstState(rs.getString("p_const_state"));
			parlConst.setUniqueConstId(rs.getString("unique_const_id"));
			}
	} catch (SQLException sq) {
		System.out.println("Unable to edit a row " + sq);
	} finally {
		pool.putConnection(conn);
	}
	return parlConst;
}
	
	
	public ArrayList<ParliamentConstituency> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<ParliamentConstituency> listParliamentConstituency = new ArrayList<ParliamentConstituency>();
		try {
			String sql = "select * from  parliament_constituency ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ParliamentConstituency parlConst= new ParliamentConstituency();
				parlConst.setpConstId(rs.getInt("p_const_id"));
				parlConst.setpConstNo(rs.getInt("p_const_no"));
				parlConst.setpConstName(rs.getString("p_const_name"));
				parlConst.setpConstState(rs.getString("p_const_state"));
				parlConst.setUniqueConstId(rs.getString("unique_const_id"));
				
				listParliamentConstituency.add(parlConst);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listParliamentConstituency;
	}
	
	public static void main(String args[]) {

//		ParliamentConstituency parlConst = new ParliamentConstituency(58,58, "zxcvbn", "no", "fgbg");
//		ParliamentConstituencyDao obj = new ParliamentConstituencyDao();
//		obj.create(parlConst);

//		 ParliamentConstituency parlConst = new ParliamentConstituency(1,89, "abhi", "Mp","a_l45");
//		 ParliamentConstituencyDao obj = new ParliamentConstituencyDao();
//		 obj.edit(parlConst);

		 ParliamentConstituencyDao obj = new ParliamentConstituencyDao();
		 obj.remove(2);

//		 ParliamentConstituencyDao obj = new ParliamentConstituencyDao();
//		 ParliamentConstituency parlConst = obj.find(2);
//		 System.out.println(parlConst);

//		 ParliamentConstituencyDao obj = new ParliamentConstituencyDao();
//		 ArrayList<ParliamentConstituency> all = obj.findAll();
//		 for (ParliamentConstituency parlConst : all)
//		 System.out.println(parlConst);
	}
	
	
	
}