package com.houssem.joueur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.repos.JoueurRepository;

@Service
public class JoueurServiceImpl implements JoueurService {
	@Autowired
	JoueurRepository JoueurRepository;

	@Override
	public Joueur saveJoueur(Joueur b) {
		return JoueurRepository.save(b);
		
	}

	@Override
	public Joueur updateJoueur(Joueur b) {
		return JoueurRepository.save(b);
		
	}

	@Override
	public void deleteJoueur(Joueur b) {
		JoueurRepository.delete(b);
		
	}

	@Override
	public void deleteJoueurById(Long id) {
		JoueurRepository.deleteById(id);
		
	}

	@Override
	public Joueur getJoueur(Long id) {
		return JoueurRepository.findById(id).get();
		
	}

	@Override
	public List<Joueur> getAllJoueurs() {
		return JoueurRepository.findAll();
		
	}

	@Override
	public List<Joueur> findByNomJoueur(String nom) {
		return JoueurRepository.findByNomJoueur(nom);
		
	}

	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
		return JoueurRepository.findByNomJoueurContains(nom);
		
	}

	@Override
	public List<Joueur> findByNomPrix(String nom, Double prix) {
		return JoueurRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
		return JoueurRepository.findByEquipe(equipe);
		
	}

	@Override
	public List<Joueur> findByEquipeIdEQ(Long id) {
		return JoueurRepository.findByEquipeIdEQ(id);
	}

	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
		return JoueurRepository.findByOrderByNomJoueurAsc();
		
	}

	@Override
	public List<Joueur> trierJoueursNomsPrix() {
		return JoueurRepository.trierJoueursNomsPrix();
	}

	}


