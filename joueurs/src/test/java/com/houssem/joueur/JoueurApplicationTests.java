package com.houssem.joueur;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.entities.Equipe;
import com.houssem.joueur.repos.JoueurRepository;

@SpringBootTest
class JoueurApplicationTests {
	@Autowired
	private JoueurRepository JoueurRepository;

	@Test
	public void testCreateJoueur() {
		Joueur prod = new Joueur("Can-am rs turbo",155000.500,new Date());
		JoueurRepository.save(prod);
		}
	@Test
	public void testFindJoueur()
	{
	Joueur b = JoueurRepository.findById(1L).get();

	System.out.println(b);
	}
	@Test
	public void testUpdateJoueur()
	{
	Joueur b = JoueurRepository.findById(1L).get();
	b.setPrixJoueur(100000.0);
	JoueurRepository.save(b);
	}
	@Test
	public void testDeleteProduit()
	{
		JoueurRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousJoueurs()
	{
	List<Joueur> jous = JoueurRepository.findAll();
	for (Joueur b : jous)
	{
	System.out.println(b);
	}

    }
	@Test
	public void testFindByNomJoueur()
	{
	List<Joueur> jous= JoueurRepository.findByNomJoueur("can-am maverick x3");

	for (Joueur b : jous)
	{
	System.out.println(b);
	}

	}
	@Test
	public void testFindByNomJoueurContains ()
	{
	List<Joueur> jous=JoueurRepository.findByNomJoueurContains("o");

	for (Joueur b :jous)
	{
	System.out.println(b);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Joueur> jous = JoueurRepository.findByNomPrix("polaris rzr xp", 100000.0);
	for (Joueur b : jous)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void testfindByMarque()
	{
	Equipe maq = new Equipe();
	maq.setIdEQ(1L);
	List<Joueur> jous = JoueurRepository.findByEquipe(maq);
	for (Joueur b : jous)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void findByEquipeIdEQ()
	{
	List<Joueur> jous= JoueurRepository.findByEquipeIdEQ(1L);
	for (Joueur b : jous)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void testfindByOrderByNomBuggyAsc()
	{
	List<Joueur> bgs =

			JoueurRepository.findByOrderByNomJoueurAsc();
	for (Joueur b : bgs)
	{
	System.out.println(b);
	}
	}
	
	@Test
	public void testTrierBuggysNomsPrix()
	{
	List<Joueur> bgs =JoueurRepository.trierJoueursNomsPrix();
	for (Joueur b : bgs)
	{
	System.out.println(b);
	}

	}
}
