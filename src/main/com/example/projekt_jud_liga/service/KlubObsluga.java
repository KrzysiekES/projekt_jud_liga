package com.example.projekt_jud_liga.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.projekt_jud_liga.domain.Klub;

public class KlubObsluga {
	private Connection connection;

    private String url = "jdbc:hsqldb:hsql://localhost/workdb"; /*"jdbc:hsqldb:mem:workdb";*/

    private String stworzTabeleKlub = "CREATE TABLE Klub (id integer GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, nazwa varchar(20), rokZalozenia integer,barwy varchar(30)) ";
    private String dodajKlubUI = "CREATE UNIQUE INDEX Klub_FK1 ON Klub (id)";
    
 	private PreparedStatement dodajKlubStmt; 
    private PreparedStatement usunKlubStmt;
    private PreparedStatement pokazWszystkieKlubyStmt;
    
    private Statement statement;
    
    
    public KlubObsluga()
    {
        try
        {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
        	
			ResultSet rs = connection.getMetaData().getTables(null, null, null,null);
			boolean tableExists = false;
			while (rs.next()) {
				if ("Klub".equalsIgnoreCase(rs.getString("TABLE_NAME"))) {
					tableExists = true;
					break;
				}
			}
        	
			if (!tableExists)
				statement.executeUpdate(stworzTabeleKlub);

			dodajPilkarzaStmt = connection
					.prepareStatement("INSERT INTO Klub ( id, nazwa, rokZalozenia, barwy) VALUES (?, ?, ?, ?)");
			usunPilkarzaStmt = connection
					.prepareStatement("DELETE FROM Klub");
			pokazWszystkichPilkarzyStmt = connection
					.prepareStatement("SELECT id, nazwa, rokZalozenia, barwy FROM Klub");

		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
	Connection getConnection() {
		return connection;
	}
	
	void wyczyscKluby() {
		try {
			pokazWszystkieKlubyStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int dodajKlub(Klub klub) {
		int count = 0;
		try {
			dodajKlubStmt.setString(1, pilkarz.getNazwa());
			dodajKlubStmt.setInt(2, klub.getRokZalozenia());
			dodajKlubStmt.setString(3, klub.getBarwy());

			count = dodajKlubStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Klub> pokazWszystkieKluby() {
		List<Klub> kluby = new ArrayList<Klub>();

		try {
			ResultSet rs = pokazWszystkieKlubyStmt.executeQuery();

			while (rs.next()) {
				klub k = new Klub();
				k.setId(rs.getInt("id"));
				k.setNazwa(rs.getString("nazwa"));
				k.setRokZalozenia(rs.getString("rokZalozenia"));
				k.setBarwy(rs.getString("barwy"))
				kluby.add(k);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return kluby;
	}
}
