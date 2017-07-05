package com.ovp.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.ovp.pojos.AadharCard;
import com.ovp.utilities.ConnectionPool;

public class AadharCardDao {

	public AadharCard find(int aadharNo) {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		AadharCard aadharCard = new AadharCard();
		try {
			String sql = "select * from  aadharcard  where Aadhar_no = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aadharNo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				aadharCard.setAadharNo(aadharNo);
				aadharCard.setAadharName(rs.getString("aadhar_name"));
				aadharCard.setAadharCountry(rs.getString("aadhar_country"));
				aadharCard.setAadharSex(rs.getString("aadhar_sex"));
				aadharCard.setAadharDOB(rs.getDate("aadhar_dob"));
				aadharCard.setAadharAddress(rs.getString("aadhar_address"));
				aadharCard.setAadharCity(rs.getString("aadhar_city"));
				aadharCard.setAadharDistrict(rs.getString("aadhar_district"));
				aadharCard.setAadharState(rs.getString("aadhar_state"));
				aadharCard.setAadharMobile(rs.getString("aadhar_mobile"));
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find a row " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return aadharCard;
	}

	public ArrayList<AadharCard> findAll() {
		ConnectionPool pool = ConnectionPool.getInstance();
		pool.initialize();
		Connection conn = pool.getConnection();
		ArrayList<AadharCard> listAadharCard = new ArrayList<AadharCard>();
		try {
			String sql = "select * from  aadharcard ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AadharCard aadharCard = new AadharCard();
				
				aadharCard.setAadharNo(rs.getInt("aadhar_no"));
				aadharCard.setAadharName(rs.getString("aadhar_name"));
				aadharCard.setAadharCountry(rs.getString("aadhar_country"));
				aadharCard.setAadharSex(rs.getString("aadhar_sex"));
				aadharCard.setAadharDOB(rs.getDate("aadhar_dob"));
				aadharCard.setAadharAddress(rs.getString("aadhar_address"));
				aadharCard.setAadharCity(rs.getString("aadhar_city"));
				aadharCard.setAadharDistrict(rs.getString("aadhar_district"));
				aadharCard.setAadharState(rs.getString("aadhar_state"));
				aadharCard.setAadharMobile(rs.getString("aadhar_mobile"));
				listAadharCard.add(aadharCard);
			}
		} catch (SQLException sq) {
			System.out.println("Unable to find rows " + sq);
		} finally {
			pool.putConnection(conn);
		}
		return listAadharCard;
	}
	
	
	
	public static void main(String args[]) {
		
//		AadharCardDao obj = new AadharCardDao();
//		 AadharCard aadharCard = obj.find(1);
//		 System.out.println(aadharCard);

		 AadharCardDao obj = new AadharCardDao();
		 ArrayList<AadharCard> all = obj.findAll();
		 for (AadharCard aadharCard : all)
		 System.out.println(aadharCard);
	}

}

