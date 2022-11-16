package com.mimaraslan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mimaraslan.dao.PersonelDao;
import com.mimaraslan.model.Personel;

public class PersonelDaoImpl  implements PersonelDao{

	
	private Connection baglanti = null;
	private String sqlKodu = null;
	private DataSource veriKaynagi;
	//-------------------------------
	
	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}
	
		
	
	@Override
	public void ekle(Personel personel) {
		sqlKodu = "INSERT INTO firmadb.personel (adi, soyadi, tecrube) VALUES ( ?, ?, ?)";

		Connection baglanti = null;
		
		try {
			baglanti = veriKaynagi.getConnection();
			
			PreparedStatement preparedStatement;
			
			preparedStatement = baglanti.prepareStatement(sqlKodu);
			
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(2, personel.getSoyadi());
			preparedStatement.setInt(3, personel.getTecrube());
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			
		} catch (SQLException e) {
			System.out.println("HATA : " + e);
			throw new RuntimeException();
			
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
					
				}
			}
		}
		
		
	}

	

	@Override
	public Personel idAra(int id) {

		sqlKodu = "SELECT * FROM firmadb.personel WHERE id = ? ";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setInt(1, id);

			Personel personel = null;

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();

			return personel;

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {

				}
			}
		}

	}

	@Override
	public Personel adiAra(String adi) {
		sqlKodu = "SELECT * FROM firmadb.personel WHERE adi = ? ";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setString(1, adi);

			Personel personel = null;

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();

			return personel;

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {

				}
			}
		}
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		sqlKodu = "SELECT * FROM firmadb.personel WHERE soyadi = ? ";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setString(1, soyadi);

			Personel personel = null;

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();

			return personel;

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {

				}
			}
		}
	}

	@Override
	public Personel tecrubeAra(int tecrube) {
		return null;
	/*	sqlKodu = "SELECT * FROM firmadb.personel WHERE tecrube = ? ";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setInt(1, tecrube);

			Personel personel = null;

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getString("soyadi"), resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();

			return personel;

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {

				}
			}
		}*/

	}

}
