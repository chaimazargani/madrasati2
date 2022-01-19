package com.pfe.madrasati.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table (name = "matier")
public class Matier {
	@Id
	   
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "color_id_seq")
	    @SequenceGenerator(name = "color_id_seq", sequenceName = "color_id_seq", initialValue = 1, allocationSize = 1)
	  @Column(name = "idmatier")
private Integer idMatier;
	
	  @Column(name = "nommatier")
	private String nomMatier;
	
		
	  @Column(name = "idenseignant")
	private Integer idEnseignant ;
	  
	  @Column(name = "coefficeint")
		private Integer coefficeint ;

	public Matier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matier(Integer idMatier, String nomMatier, Integer idEnseignant, Integer coefficeint) {
		super();
		this.idMatier = idMatier;
		this.nomMatier = nomMatier;
		this.idEnseignant = idEnseignant;
		this.coefficeint = coefficeint;
	}

	public Integer getIdMatier() {
		return idMatier;
	}

	public void setIdMatier(Integer idMatier) {
		this.idMatier = idMatier;
	}

	public String getNomMatier() {
		return nomMatier;
	}

	public void setNomMatier(String nomMatier) {
		this.nomMatier = nomMatier;
	}

	public Integer getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Integer idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public Integer getCoefficeint() {
		return coefficeint;
	}

	public void setCoefficeint(Integer coefficeint) {
		this.coefficeint = coefficeint;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coefficeint == null) ? 0 : coefficeint.hashCode());
		result = prime * result + ((idEnseignant == null) ? 0 : idEnseignant.hashCode());
		result = prime * result + ((idMatier == null) ? 0 : idMatier.hashCode());
		result = prime * result + ((nomMatier == null) ? 0 : nomMatier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matier other = (Matier) obj;
		if (coefficeint == null) {
			if (other.coefficeint != null)
				return false;
		} else if (!coefficeint.equals(other.coefficeint))
			return false;
		if (idEnseignant == null) {
			if (other.idEnseignant != null)
				return false;
		} else if (!idEnseignant.equals(other.idEnseignant))
			return false;
		if (idMatier == null) {
			if (other.idMatier != null)
				return false;
		} else if (!idMatier.equals(other.idMatier))
			return false;
		if (nomMatier == null) {
			if (other.nomMatier != null)
				return false;
		} else if (!nomMatier.equals(other.nomMatier))
			return false;
		return true;
	}


	
	
}
