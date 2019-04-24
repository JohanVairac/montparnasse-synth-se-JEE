package com.infotel.service;

import java.util.List;

import com.infotel.dao.Idao;
import com.infotel.dao.daoImpl;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class servicesImpl implements Iservices{
	
	private Idao dao = new daoImpl();

	@Override
	public int ajouterStagiaire(Stagiaire s) {

		return dao.ajouterStagiaire(s);
	}

	@Override
	public int supprimerStagiaire(int idStagiaire ) {

		return dao.supprimerStagiaire(idStagiaire);
	}

	@Override
	public List<Stagiaire>FindAll() {

		return dao.FindAll();
	}
	
	
	
	public int ajouterPromo(Promo p) {

		return dao.ajouterPromo(p);
	}
	
	@Override
	public int supprimerPromo(int idPromo) {

		return dao.supprimerPromo(idPromo);
	}

	@Override
	public List<Promo> FindAllPromos() {

		return dao.FindAllPromos();
	}

	

	public int ajouterFormation(Formation f) {

		return dao.ajouterFormation(f);
	}
	
	
	@Override
	public int supprimerFormation(int idFormation) {

		return dao.supprimerPromo(idFormation);
	}
	
	
	@Override
	public List<Formation> FindAllFormations() {

		return dao.FindAllFormations();
	}
	
	@Override
	public void attribuerPromoFormation (Promo p, Formation f) {
		 dao.attribuerPromoFormation(p,f);
		
	}
	
	public void attribuerStagiairePromo (Stagiaire s, Promo p) {
		 dao.attribuerStagiairePromo(s,p);
		 
	}


}

	

	
