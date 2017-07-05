package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ovp.pojos.Voter;
import com.ovp.utilities.ConnectionPool;
import com.ovp.utilities.DateUtils;

public class VoterDao {
	
	public static int verify(String email, String password) {
		int id = -1;
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "select voter_id from voter where voter_email = ? and voter_password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("voter_id");
			}
		} catch (SQLException sq) {
			System.out.println("Unable to create a new row." + sq);
		} finally {
			pool.putConnection(conn);
		}
		return id;
	}
	
	public void create(Voter voter) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		System.out.println(voter);
		try {
			String sql = "insert into voter (voter_name,  voter_email,  vin  ,voter_adhar_no  ,voter_otp,  "
					+ "voter_mob  ,a_const_id  ,vote_complete  ,voter_vcard_no  ,vin_count,  vin_time,  election_id,  voter_password,"
					+ "voter_dob  ,voter_address  ) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, voter.getVoterName());
			ps.setString(2,voter.getVoterEmail());
			ps.setString(3, voter.getVin());
			ps.setString(4,voter.getVoterAdharNo());
			ps.setString(5,voter.getVoterOtp());
			ps.setString(6,voter.getVoterMob());
			ps.setInt(7,voter.getaConstId());
			ps.setString(8,voter.getVoteComplete());
			ps.setString(9,voter.getVoterVcardNo());
			ps.setInt(10,voter.getVinCount());
			java.sql.Date dtt = new java.sql.Date(voter.getVinTime().getTime());
			ps.setDate(11, dtt);
			ps.setInt(12,voter.getElectionId());
			ps.setString(13,voter.getVoterPassword());
			java.sql.Date dt = new java.sql.Date(voter.getVoterDob().getTime());
			ps.setDate(14, dt);
			ps.setString(15,voter.getVoterAddress());
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to create a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void edit(Voter voter) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "update voter set voter_name = ?, voter_email = ?, vin = ?,voter_adhar_no = ?,voter_otp = ?,voter_mob = ?,a_const_id = ?,"
					+ "vote_complete = ?,voter_vcard_no = ?,vin_count = ?,vin_time = ?"+
						",election_id = ?,voter_password = ?,voter_dob = ?,voter_address = ? where Voter_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, voter.getVoterName());
			ps.setString(2,voter.getVoterEmail());
			ps.setString(3, voter.getVin());
			ps.setString(4,voter.getVoterAdharNo());
			ps.setString(5,voter.getVoterOtp());
			ps.setString(6,voter.getVoterMob());
			ps.setInt(7,voter.getaConstId());
			ps.setString(8,voter.getVoteComplete());
			ps.setString(9,voter.getVoterVcardNo());
			ps.setInt(10,voter.getVinCount());
			
			java.sql.Date dtt = new java.sql.Date(voter.getVinTime().getTime());
			ps.setDate(11, dtt);
			ps.setInt(12,voter.getElectionId());
			ps.setString(13,voter.getVoterPassword());
			java.sql.Date dt = new java.sql.Date(voter.getVoterDob().getTime());
			ps.setDate(14, dt);
			ps.setString(15,voter.getVoterAddress());
			ps.setInt(16,voter.getVoterId());
			
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to update a row. " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public void remove(int voterId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		try {
			String sql = "delete from   voter  where voter_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,voterId);
			ps.executeUpdate();
		} catch (SQLException sq) {
			System.out.println("Unable to remove a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
	}

	public Voter find(int voterId) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		Voter voter = new Voter();
		try {
			String sql = "select * from  Voter  where Voter_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, voterId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				voter.setVoterId(voterId);
//				java.sql.Date dt = rs.getDate("Voter_date");
//				Voter.setVoterDate(new java.util.Date(dt.getTime()));
				
				
				voter.setVoterName(rs.getString("voter_name"));
				voter.setVoterEmail(rs.getString("voter_email"));
				voter.setVin(rs.getString("vin"));
				voter.setVoterAdharNo(rs.getString("voter_adhar_no"));
				voter.setVoterOtp(rs.getString("voter_otp"));
				voter.setVoterMob(rs.getString("voter_mob"));
				voter.setaConstId(rs.getInt("a_const_id"));
				voter.setVoteComplete(rs.getString("vote_complete"));
				voter.setVoterVcardNo(rs.getString("voter_vcard_no"));
				voter.setVinCount(rs.getInt("vin_count"));
				
				java.sql.Date dtt = rs.getDate("vin_time");
				voter.setVinTime(new java.util.Date(dtt.getTime()));
				voter.setElectionId(rs.getInt("election_id"));
				voter.setVoterPassword(rs.getString("voter_password"));
				java.sql.Date dt = rs.getDate("voter_dob");
				voter.setVoterDob(new java.util.Date(dt.getTime()));
				voter.setVoterAddress(rs.getString("voter_address"));
				
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return voter;
	}

	public ArrayList<Voter> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<Voter> listVoter = new ArrayList<Voter>();
		try {
			String sql = "select * from  voter ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Voter voter = new Voter();
				
				voter.setVoterId(rs.getInt("voter_id"));
				voter.setVoterName(rs.getString("voter_name"));
				voter.setVoterEmail(rs.getString("voter_email"));
				voter.setVin(rs.getString("vin"));
				voter.setVoterAdharNo(rs.getString("voter_adhar_no"));
				voter.setVoterOtp(rs.getString("voter_otp"));
				voter.setVoterMob(rs.getString("voter_mob"));
				voter.setaConstId(rs.getInt("a_const_id"));
				voter.setVoteComplete(rs.getString("vote_complete"));
				voter.setVoterVcardNo(rs.getString("voter_vcard_no"));
				voter.setVinCount(rs.getInt("vin_count"));
				
				java.sql.Date dtt = rs.getDate("vin_time");
				voter.setVinTime(new java.util.Date(dtt.getTime()));
				voter.setElectionId(rs.getInt("election_id"));
				voter.setVoterPassword(rs.getString("voter_password"));
				java.sql.Date dt = rs.getDate("voter_dob");
				voter.setVoterDob(new java.util.Date(dt.getTime()));
				voter.setVoterAddress(rs.getString("voter_address"));
				
				listVoter.add(voter);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to findall " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listVoter;
	}

	public static void main(String args[]) {
		java.util.Date dt = DateUtils.convertDate("28-10-2015");
		java.util.Date dtt = new java.util.Date();
		
//		Voter voter = new Voter(58,"name", "gmail","vin","adno","otp","9863254",57,"comp","vcard",2,dtt,5,
//				 "fgtsfa",dt,"ksbxusgddfkfnkdfnvlkndfl jdjfojfojefiojewo io oew oioie oiwe ioewi");
//		 VoterDao obj = new VoterDao();
//		 obj.create(voter);

//		 Voter voter = new Voter(1,"Abhi", "@gmail","45sf89","0123456789as","otp58","98956234",56,"a_58","VC58963",1,dtt,8,"shank",dt,"near");
//		 VoterDao obj = new VoterDao();
//		 obj.edit(voter);

//		 VoterDao obj = new VoterDao();
//		 obj.remove(3);

//		 VoterDao obj = new VoterDao();
//		 Voter voter = obj.find(1);
//		 System.out.println(voter);

//		 VoterDao obj = new VoterDao();
//		 ArrayList<Voter> all = obj.findAll();
//		 for (Voter voter : all)
//		 System.out.println(voter);
	}
}
