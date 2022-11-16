package com.mimaraslan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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



	
	
	
	@Override
	public void createOlusturPersonel(Personel personel) {
		sqlKodu = "INSERT INTO firmadb.personel (adi, soyadi, tecrube) VALUES ( ?, ?, ?)";
	
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Object [] parametreler = new Object [] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube() };
		
		int durum = jdbcTemplate.update(sqlKodu, parametreler);
		
		if (durum != 0) {
			System.out.println("EKLENDİ.");
		}else {
			System.out.println("EKLENMEDİ.");
		}
		
	}



	@Override
	public Personel readOkuPersonel(int id) {	
		sqlKodu = "SELECT * FROM firmadb.personel WHERE id = ? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Object [] parametreler = new Object [] { id };		

		try {
				Personel personel = jdbcTemplate.queryForObject(sqlKodu, parametreler, new RowMapper<Personel>(){

					@Override
					public Personel mapRow(ResultSet resultSet, int satirNo) throws SQLException {
								
						Personel personel = new Personel();
						
						personel.setId(resultSet.getInt("id"));
						personel.setAdi(resultSet.getString("adi"));
						personel.setSoyadi(resultSet.getString("soyadi"));
					    personel.setTecrube(resultSet.getInt("tecrube"));
					    
					    System.out.println("--- "+ personel+"\n");
					    
						return personel;
					}
					 
				});	
				return personel;
		} catch (Exception e) {
			System.err.println("HATA : " + e);
			return null;
		}
		
		
	
	}



	@Override
	public void updateGuncellePersonel(Personel personel, int id) {
		sqlKodu = "UPDATE firmadb.personel SET adi=?, soyadi=?, tecrube=? WHERE id=?";
					
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Object [] parametreler = new Object [] { personel.getAdi(), personel.getSoyadi(), personel.getTecrube(), id };
		
		int durum = jdbcTemplate.update(sqlKodu, parametreler);
		
		if (durum != 0) {
			System.out.println("GÜNCELLENDİ.");
		}else {
			System.out.println("GÜNCELLEME BAŞARISIZ.");
		}
		
	}



	@Override
	public void deleteSilPersonel(int id) {
		sqlKodu = "DELETE FROM firmadb.personel WHERE id=?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Object [] parametreler = new Object [] { id };
		
		int durum = jdbcTemplate.update(sqlKodu, parametreler);
		
		if (durum != 0) {
			System.out.println("SİLİNDİ.");
		}else {
			System.out.println("SİLİNME BAŞARISIZ.");
		}		
	}



	@Override
	public Personel readOkuPersonelTecrube(int tecrube) {
		sqlKodu = "SELECT * FROM firmadb.personel WHERE tecrube = ? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		Object [] parametreler = new Object [] { tecrube };		

		try {
				Personel personel = jdbcTemplate.queryForObject(sqlKodu, parametreler, new RowMapper<Personel>(){

					@Override
					public Personel mapRow(ResultSet resultSet, int satirNo) throws SQLException {
								
						Personel personel = new Personel();
						
						personel.setId(resultSet.getInt("id"));
						personel.setAdi(resultSet.getString("adi"));
						personel.setSoyadi(resultSet.getString("soyadi"));
					    personel.setTecrube(resultSet.getInt("tecrube"));
					    
					    System.out.println("--- "+ personel+"\n");
					    
						return personel;
					}
					 
				});	
				return personel;
		} catch (Exception e) {
			System.err.println("HATA : " + e);
			return null;
		}
	}



	

}
