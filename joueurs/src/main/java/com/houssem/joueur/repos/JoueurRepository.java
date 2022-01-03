package com.houssem.joueur.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.entities.Equipe;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	@Query("select b from Joueur b where b.nomJoueur like %?1 and b.prixJoueur > ?2")
	List<Joueur> findByNomPrix (String nom, Double prix);
	@Query("select b from Joueur b where b.marque = ?1")
	List<Joueur> findByEquipe (Equipe equipes);
	List<Joueur> findByEquipeIdEQ(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	@Query("select b from Joueur b order by b.nomJoueur ASC, b.prixJoueur DESC")
	List<Joueur> trierJoueursNomsPrix ();
}
