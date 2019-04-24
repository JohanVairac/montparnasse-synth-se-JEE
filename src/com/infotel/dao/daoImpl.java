package com.infotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infotel.dao.GestionConnexion;
import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class daoImpl implements Idao{

	private Connection connect;
	private PreparedStatement st;
	private ResultSet rs;
	
	
	@Override
	public int ajouterStagiaire (Stagiaire s) {
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("insert into Stagiaire(nom,prenom,age)" + " values(?,?,?)");
			st.setString(1, s.getNom());
			st.setString(2, s.getPrenom());
			st.setInt(3, s.getAge());

			st.executeUpdate();
			
			// 3- récupérer le résultat en cas de besoin
			
		 } catch (Exception e) {
			System.out.println("Erreur");
		}
		return s.getIdStagiaire();
	}
	
	
	
	
	@Override
	public int supprimerStagiaire(int idStagiaire) {
		
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("DELETE FROM Stagiaire" + " WHERE (idStagiaire=?)");

			st.setInt(1, idStagiaire);

			st.executeUpdate();

		} catch (Exception e) {
			System.out.println("ECHEC");
		}
		return idStagiaire;

	}
	@Override
	public List<Stagiaire> FindAll() {
		List<Stagiaire> list = new ArrayList<Stagiaire>();
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("SELECT * FROM Personne");

			rs = st.executeQuery();

			// 3- récupérer le résultat en cas de besoin

			while (rs.next()) {
				Stagiaire s = new Stagiaire();
				s.setIdStagiaire(rs.getInt("idStagiaire"));
				s.setNom(rs.getString("nom"));
				s.setPrenom(rs.getString("prenom"));
				s.setAge(rs.getInt("age"));

				list.add(s);
			}

		} catch (Exception e) {
			System.out.println("ECHEC, Recommence!!!");
		}

		return list;
	}
	
	
	@Override
	public int ajouterPromo(Promo p) {
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("DELETE FROM Promo" + " WHERE (idPromo=?)");

			st.setString(1, p.getNomSession());
			st.setInt(1,p.getEffectif());

			st.executeUpdate();

		} catch (Exception e) {
			System.out.println("ECHEC");
		}
		return p.getIdPromo();
	}
	@Override
	public int supprimerPromo(int idPromo) {
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("DELETE FROM Promo" + " WHERE (idPromo=?)");

			st.setInt(1, idPromo);

			st.executeUpdate();

		} catch (Exception e) {
			System.out.println("ECHEC");
		}
		return idPromo;
	}
	@Override
	public List<Promo> FindAllPromos() {
		List<Promo> list = new ArrayList<Promo>();
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("SELECT * FROM Promo");

			rs = st.executeQuery();

			// 3- récupérer le résultat en cas de besoin

			while (rs.next()) {
				Promo p = new Promo();
				p.setIdPromo(rs.getInt("idPromo"));
				p.setNomSession(rs.getString("nomSession"));
				p.setEffectif(rs.getInt("effectif"));

				list.add(p);
			}

		} catch (Exception e) {
			System.out.println("ECHEC, Recommence!!!");
		}

		return list;
	}
	@Override
	public int ajouterFormation(Formation f) {
		return 0;
	}
	@Override
	public int supprimerFormation(int idFormation) {
		try {
			// 1- se connecter à la base de données
			connect = GestionConnexion.getInstance();

			// 2- effectuer la requête
			st = connect.prepareStatement("DELETE FROM Formation" + " WHERE (idFormation=?)");

			
			st.setInt(1,idFormation);

			st.executeUpdate();

		} catch (Exception e) {
			System.out.println("ECHEC");
		}
		return idFormation;
	}
	@Override
	public List<Formation> FindAllFormations() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void attribuerPromoFormation(Promo p, Formation f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attribuerStagiairePromo(Stagiaire s, Promo p) {
		// TODO Auto-generated method stub
		
	}
}
