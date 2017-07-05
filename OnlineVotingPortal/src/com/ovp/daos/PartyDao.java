package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.Party;
import com.ovp.utilities.ConnectionPool;

public class PartyDao {
	
	public static int verify(String partyEmail, String partyPassword) {
		int id = -1;

		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select party_id from party where party_email = ? and p_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, partyEmail);
			ps.setString(2, partyPassword);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("party_id");
			}
			
		} catch (SQLException sq) {
			System.out.println("Party not exist." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;
	}

	public void create(Party party) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "insert into party (party_name, party_details, party_logo,p_user_id,p_password,party_pm,"
					+"party_pm_photo,details_edited,party_email,party_verified) values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, party.getPartyName());
			ps.setString(2, party.getPartyDetails());
			ps.setString(3, party.getPartyLogo());
			ps.setString(4, party.getPartyUserId());
			ps.setString(5, party.getPartyPassword());
			ps.setString(6, party.getPartyPm());
			ps.setString(7, party.getPartyPmPhoto());
			ps.setString(8, party.getDetailsEdited());
			ps.setString(9, party.getPartyEmail());
			ps.setString(10, party.getPartyVerified());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(Party party) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update  party set party_name = ?, party_details = ?, party_logo = ?,p_user_id = ?,p_password = ?,party_pm = ?,"
					+"party_pm_photo = ?,details_edited = ?,party_email = ?,party_verified = ? where party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, party.getPartyName());
			ps.setString(2, party.getPartyDetails());
			ps.setString(3, party.getPartyLogo());
			ps.setString(4, party.getPartyUserId());
			ps.setString(5, party.getPartyPassword());
			ps.setString(6, party.getPartyPm());
			ps.setString(7, party.getPartyPmPhoto());
			ps.setString(8, party.getDetailsEdited());
			ps.setString(9, party.getPartyEmail());
			ps.setString(10, party.getPartyVerified());
			ps.setInt(11, party.getPartyId());
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int partyId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from party where party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partyId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public Party find(int partyId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Party party = new Party();
		try {
			String sql = "select * from party where party_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, partyId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				party.setPartyId(rs.getInt("party_id"));
				party.setPartyName(rs.getString("party_name"));
				party.setPartyDetails(rs.getString("party_details"));
				party.setPartyLogo(rs.getString("party_logo"));
				party.setPartyUserId(rs.getString("p_user_id"));
				party.setPartyPassword(rs.getString("p_password"));
				party.setPartyPm(rs.getString("party_pm"));
				party.setPartyPmPhoto(rs.getString("party_pm_photo"));
				party.setDetailsEdited(rs.getString("details_edited"));
				party.setPartyEmail(rs.getString("party_email"));
				party.setPartyVerified(rs.getString("party_verified"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return party;
	}

	public ArrayList<Party> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Party> listParty = new ArrayList<Party>();
		try {
			String sql = "select * from party ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Party party = new Party();
				party.setPartyId(rs.getInt("party_id"));
				party.setPartyName(rs.getString("party_name"));
				party.setPartyDetails(rs.getString("party_details"));
				party.setPartyLogo(rs.getString("party_logo"));
				party.setPartyUserId(rs.getString("p_user_id"));
				party.setPartyPassword(rs.getString("p_password"));
				party.setPartyPm(rs.getString("party_pm"));
				party.setPartyPmPhoto(rs.getString("party_pm_photo"));
				party.setDetailsEdited(rs.getString("details_edited"));
				party.setPartyEmail(rs.getString("party_email"));
				party.setPartyVerified(rs.getString("party_verified"));

				listParty.add(party);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to edit a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listParty;
	}
	public static void renam(String attribute, String fileName) {
		ConnectionPool pool=ConnectionPool.getInstance();
		pool.initialize();
		Connection conn=pool.getConnection();
		try{
			String sql = "UPDATE party SET party_symbol=? WHERE party_name = ? ";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,fileName );
			ps.setString(2,attribute );
			ps.executeUpdate();
			
		}catch(SQLException sq){
			System.out.println("Unable to edit a row "+sq);
		}finally{
			pool.putConnection(conn);
		}
		
	}
	public static void main(String args[]) {
		
		 PartyDao obj = new PartyDao();
		System.out.println(obj.verify("bjp@g", "bjp"));

//		 Party party = new Party(58, "gdfdfds", "no", "fgbg","sdfsf","sdfsdf","sfsdf","sfsdf","sfd","sfdf","fghgf");
//		 PartyDao obj = new PartyDao();
//		 obj.create(party);

//		 Party party = new Party(4, "abhi", "yes","L:/","shan","shank","prime","P:/","yes","@gamil","yes");
//		 PartyDao obj = new PartyDao();
//		 obj.edit(party);

//		 PartyDao obj = new PartyDao();
//		 obj.remove(5);

//		 PartyDao obj = new PartyDao();
//		 Party party = obj.find(1);
//		 System.out.println(party);

//		 PartyDao obj = new PartyDao();
//		 ArrayList<Party> all = obj.findAll();
//		 for (Party party : all)
//		 System.out.println(party);
	}

}
