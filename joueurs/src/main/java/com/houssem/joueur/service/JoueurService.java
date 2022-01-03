package com.houssem.joueur.service;

import java.util.List;

import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.entities.Equipe;

public interface JoueurService {
	Joueur saveJoueur(Joueur b);
	static Joueur updateJoueur(Joueur b) {
		// TODO Auto-generated method stub
		return null;
	}
	void deleteJoueur(Joueur b);
	void deleteJoueurById(Long id);
	 static Joueur getJoueur(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	 static List<Joueur> getAllJoueurs() {
		// TODO Auto-generated method stub
		return null;
	}
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	List<Joueur> findByNomPrix (String nom, Double prix);
	List<Joueur> findByEquipe (Equipe equipe);
	static List<Joueur> findByEquipeIdEQ(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	List<Joueur> findByOrderByNomJoueurAsc();
	List<Joueur> trierJoueursNomsPrix();
}
