package com.infotel.dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class GestionConnexion {

	String url="jdbc:postgresql://localhost:5432/Personnes";
	String user="postgres";
	String password="swefoot971";
	
	
	// Objet connexion
		private static Connection connect;
		
	// Constructeur priv�
		
		private GestionConnexion() {
			try {
				Class.forName("org.postgresql.Driver");
				connect = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				System.out.println("Erreur de Connexion");
		
			}
			
		}

	// m�thode d'attribution de connexion
	// permet se s'assurer de l'unicit� de la connexion
		
		public static Connection getInstance () {
				if (connect == null) {
					new GestionConnexion ();
				}
				return connect;
		}
		
}

