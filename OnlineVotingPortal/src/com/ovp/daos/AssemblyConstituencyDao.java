package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.AssemblyConstituency;
import com.ovp.utilities.ConnectionPool;

public class AssemblyConstituencyDao {
	public void create(AssemblyConstituency aConst) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into assembly_constituency (a_const_no, a_const_name, a_const_state, p_const_id, unique_const_id) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aConst.getaConstNo());
			ps.setString(2, aConst.getaConstName());
			ps.setString(3, aConst.getaConstState());
			ps.setInt(4, aConst.getpConstId());
			ps.setString(5, aConst.getUniqueConstId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(AssemblyConstituency aConst) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update assembly_constituency set a_const_no = ? , a_const_name = ?, a_const_state = ?, p_const_id = ?, unique_const_id = ? where a_const_id =? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aConst.getaConstNo());
			ps.setString(2, aConst.getaConstName());
			ps.setString(3, aConst.getaConstState());
			ps.setInt(4, aConst.getpConstId());
			ps.setString(5, aConst.getUniqueConstId());
			ps.setInt(6, aConst.getaConstId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int aConstId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from assembly_constituency  where a_const_id =? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aConstId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to delete a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public AssemblyConstituency find(int aConstId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		AssemblyConstituency aConst = new AssemblyConstituency();
		try {
			String sql = "select * from assembly_constituency  where a_const_id =? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aConstId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				aConst.setaConstId(aConstId);
				aConst.setaConstNo(rs.getInt("a_const_no"));
				aConst.setaConstName(rs.getString("a_const_name"));
				aConst.setaConstState(rs.getString("a_const_state"));
				aConst.setpConstId(rs.getInt("p_const_id"));
				aConst.setUniqueConstId(rs.getString("unique_const_id"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return aConst;
	}

	public ArrayList<AssemblyConstituency> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<AssemblyConstituency> listaConst = new ArrayList<AssemblyConstituency>();
		try {
			String sql = "select * from assembly_constituency ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AssemblyConstituency aConst = new AssemblyConstituency();
				aConst.setaConstId(rs.getInt("a_const_id"));
				aConst.setaConstNo(rs.getInt("a_const_no"));
				aConst.setaConstName(rs.getString("a_const_name"));
				aConst.setaConstState(rs.getString("a_const_state"));
				aConst.setpConstId(rs.getInt("p_const_id"));
				aConst.setUniqueConstId(rs.getString("unique_const_id"));
				listaConst.add(aConst);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find rows " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listaConst;
	}

	public static void main(String args[]) {

//		AssemblyConstituency AssemblyConst = new AssemblyConstituency(3,6, "sgrgf", "MP", 56, "fgbg");
//		AssemblyConstituencyDao obj = new AssemblyConstituencyDao();
//		obj.create(AssemblyConst);

//		 AssemblyConstituency AssemblyConst = new AssemblyConstituency(1,7, "abhui", "UP", 06, "sdbgu");
//		 AssemblyConstituencyDao obj = new AssemblyConstituencyDao();
//		 obj.edit(AssemblyConst);

//		 AssemblyConstituencyDao obj = new AssemblyConstituencyDao();
//		 obj.remove(1);

//		 AssemblyConstituencyDao obj = new AssemblyConstituencyDao();
//		 AssemblyConstituency AssemblyConst = obj.find(5);
//		 System.out.println(AssemblyConst);

//		 AssemblyConstituencyDao obj = new AssemblyConstituencyDao();
//		 ArrayList<AssemblyConstituency> all = obj.findAll();
//		 for (AssemblyConstituency AssemblyConst : all)
//		 System.out.println(AssemblyConst);
	}
}
