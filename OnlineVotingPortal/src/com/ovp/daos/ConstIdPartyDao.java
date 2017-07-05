package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.ConstIdParty;
import com.ovp.utilities.ConnectionPool;

public class ConstIdPartyDao {

		public void create(ConstIdParty constIdParty) {
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			try {
				String sql = "insert into const_id_party (unique_const_id, election_id, party_id) values (?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
			
				ps.setInt(3, constIdParty.getPartyId());
				ps.setInt(2, constIdParty.getElectionId());
				ps.setString(1, constIdParty.getUniqueConstId());
			
				ps.executeUpdate();
			} catch (SQLException sq) {
				System.out.println("Unable to create a row " + sq);
			} finally {
				pool.putConnection(conn);
			}
		}

		public void edit(ConstIdParty constIdParty) {
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			try {
				String sql = "update  const_id_party set  party_id= ?, election_id= ?"
						+ " where unique_const_id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, constIdParty.getPartyId());
				ps.setInt(2, constIdParty.getElectionId());
				ps.setString(3, constIdParty.getUniqueConstId());
				
				ps.executeUpdate();
			} catch (SQLException sq) {
				System.out.println("Unable to create a row. " + sq);
			} finally {
				pool.putConnection(conn);
			}
		}

		public void remove(String UniqueConstId) {
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			try {
				String sql = "delete from   const_id_party  where unique_const_id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, UniqueConstId);
				ps.executeUpdate();
			} catch (SQLException sq) {
				System.out.println("Unable to remove a row " + sq);
			} finally {
				pool.putConnection(conn);
			}
		}

		public ConstIdParty find(String UniqueConstId) {
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			ConstIdParty constIdParty = new ConstIdParty();
			try {
				String sql = "select * from  const_id_party  where unique_const_id = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, UniqueConstId);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					
					constIdParty.setPartyId(rs.getInt("party_id"));
					constIdParty.setElectionId(rs.getInt("election_id"));
					constIdParty.setUniqueConstId(rs.getString("unique_const_id"));
					
				}
			} catch (SQLException sq) {
				System.out.println("Unable to find a row " + sq);
			} finally {
				pool.putConnection(conn);
			}
			return constIdParty;
		}

		public ArrayList<ConstIdParty> findAll() {
			ConnectionPool pool = ConnectionPool.getInstance();
			pool.initialize();
			Connection conn = pool.getConnection();
			ArrayList<ConstIdParty> listConstIdParty = new ArrayList<ConstIdParty>();
			try {
				String sql = "select * from  const_id_party ";
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					ConstIdParty constIdParty = new ConstIdParty();
					
					constIdParty.setPartyId(rs.getInt("party_id"));
					constIdParty.setElectionId(rs.getInt("election_id"));
					constIdParty.setUniqueConstId(rs.getString("unique_const_id"));
				
					listConstIdParty.add(constIdParty);
				}
			} catch (SQLException sq) {
				System.out.println("Unable to findall " + sq);
			} finally {
				pool.putConnection(conn);
			}
			return listConstIdParty;
		}

		public static void main(String args[]) {

//			ConstIdParty constIdParty = new ConstIdParty( "p_ghd", 56, 32);
//			ConstIdPartyDao obj = new ConstIdPartyDao();
//			obj.create(constIdParty);

//			 ConstIdParty constIdParty = new ConstIdParty( "a_sad", 88, 14);
//			 ConstIdPartyDao obj = new ConstIdPartyDao();
//			 obj.edit(constIdParty);

			 ConstIdPartyDao obj = new ConstIdPartyDao();
			 obj.remove("p_ghd");

//			 ConstIdPartyDao obj = new ConstIdPartyDao();
//			 ConstIdParty constIdParty = obj.find("a_sad");
//			 System.out.println(constIdParty);

//			 ConstIdPartyDao obj = new ConstIdPartyDao();
//			 ArrayList<ConstIdParty> all = obj.findAll();
//			 for (ConstIdParty constIdParty : all)
//			 System.out.println(constIdParty);
		}
}
