package com.houssem.joueur.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEQ;
	private String nomEQ;
	private String descriptionEQ;
	@JsonIgnore
	@OneToMany(mappedBy = "equipe")
	private List<Joueur> joueurs;
	public void setIdEQ(long l) {
		this.idEQ=l;
		
	}
	
	}

