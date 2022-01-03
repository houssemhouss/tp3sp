package com.houssem.joueur.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.houssem.joueur.entities.Joueur;
import com.houssem.joueur.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class JoueurRESTController {
	
	
	@Autowired
	JoueurService joueurService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Joueur> getAllJoueurs() {
	return JoueurService.getAllJoueurs();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Joueur getBuggyById(@PathVariable("id") Long id) { return JoueurService.getJoueur(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Joueur createBuggy(@RequestBody Joueur buggy) {
	return JoueurService.saveJoueur(joueur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Joueur updateBuggy(@RequestBody Joueur joueur) {
	return JoueurService.updateJoueur(joueur);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteBuggy(@PathVariable("id") Long id)
	{
		JoueurService.deleteJoueurById(id);
	}
	
	@RequestMapping(value="/bgsmq/{idMq}",method = RequestMethod.GET)
	public List<Joueur> getBuggysByEQId(@PathVariable("idEQ") Long idEQ) {
	return JoueurService.findByEquipeIdEQ(idEQ);
	}

}
