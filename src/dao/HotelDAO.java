package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import model.Hotel;
import db.ConnectionUtil;

public class HotelDAO {
	
	Connection con=ConnectionUtil.connectToMysql();
	PreparedStatement st=null;
	
	public void addHotel(Hotel hotel) throws SQLException
	{
		 
		String str="insert into Hotel(id,name,address)"
				+ " values(?,?,?)";
		st=con.prepareStatement(str);
		
		st.setInt(1,hotel.getId());
		st.setString(2, hotel.getName());
		st.setString(3, hotel.getAddress());
		st.executeUpdate();
		
		System.out.println("Succesfully inserted");
	}
	
	public void displayAllHotels() throws SQLException
	{
		String str="select * from Hotel";
		
	st=con.prepareStatement(str);
	
		
		ResultSet rs=st.executeQuery(str);
		
		while(rs.next())
		{
			System.out.println
			(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
	}
	public void deleteHotel(int id) throws Exception
	{
		String str=" Delete from Hotel where id=?";
		st=con.prepareStatement(str);
		st.setInt(1,id);
		st.executeUpdate();
		
		
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Scanner ss= new Scanner(System.in);
		//System.out.println("Hotel Details..");
		//System.out.println("Enter the id:");
		//int id=ss.nextInt();
		//System.out.println("Enter the name:");
		//String name=ss.next();
		//System.out.println("Enter the address:");
		//String address=ss.next();
		
		Hotel hotel = new Hotel();
		
		//hotel.setId(id);
		
		//hotel.setName(name);
		
		//hotel.setAddress(address);
		
		HotelDAO h= new HotelDAO();
		//h.addHotel(hotel);
		h.displayAllHotels();
		System.out.println("Delete id");
		h.deleteHotel(ss.nextInt());
		h.displayAllHotels();
		//h.displayAllHotels();
	}

}
