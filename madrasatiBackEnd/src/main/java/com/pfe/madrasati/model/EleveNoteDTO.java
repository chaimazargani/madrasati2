package com.pfe.madrasati.model;

import java.io.Serializable;

<<<<<<< HEAD
public class EleveNoteDTO implements Serializable {
=======
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EleveNoteDTO {
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
<<<<<<< HEAD
	private Integer idEleve;
=======
	
	
	
//	@Column(name = "valeurnote")
	private Double valeurNote;
	private String nomEleve ;
    private String nomExamen;
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9

	private Integer idNote;
	
	private String nomNote;
	
	private String nom;
	
	private String prenom;
	
	private Double valeurNote;
	
<<<<<<< HEAD
	
=======
//	@JoinColumn(name = "ideleve")
	//private Eleve eleve;
 
	//@JoinColumn(name = "nomeleve")
	
	
  //@JoinColumn(name = "nomexamen")
	
//	@Id
	//@GeneratedValue
	//@Column(name = "ideleve")

>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9
	public EleveNoteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

<<<<<<< HEAD

	public EleveNoteDTO(Integer idEleve, Integer idNote, String nomNote, String nom, String prenom, Double valeurNote) {
		super();
		this.idEleve = idEleve;
		this.idNote = idNote;
		this.nomNote = nomNote;
		this.nom = nom;
		this.prenom = prenom;
		this.valeurNote = valeurNote;
	}


	public Integer getIdEleve() {
		return idEleve;
	}


	public void setIdEleve(Integer idEleve) {
		this.idEleve = idEleve;
	}


	public Integer getIdNote() {
		return idNote;
	}


	public void setIdNote(Integer idNote) {
		this.idNote = idNote;
	}


	public String getNomNote() {
		return nomNote;
	}


	public void setNomNote(String nomNote) {
		this.nomNote = nomNote;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Double getValeurNote() {
		return valeurNote;
	}


	public void setValeurNote(Double valeurNote) {
		this.valeurNote = valeurNote;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

=======
	public EleveNoteDTO(Double valeurNote, String nomEleve, String nomExamen) {
		super();
		this.valeurNote = valeurNote;
		this.nomEleve = nomEleve;
		this.nomExamen = nomExamen;
	}

	public Double getValeurNote() {
		return valeurNote;
	}

	public void setValeurNote(Double valeurNote) {
		this.valeurNote = valeurNote;
	}

	public String getNomEleve() {
		return nomEleve;
	}

	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}

	public String getNomExamen() {
		return nomExamen;
	}

	public void setNomExamen(String nomExamen) {
		this.nomExamen = nomExamen;
	}

	
>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomEleve == null) ? 0 : nomEleve.hashCode());
		result = prime * result + ((nomExamen == null) ? 0 : nomExamen.hashCode());
		result = prime * result + ((valeurNote == null) ? 0 : valeurNote.hashCode());
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
		EleveNoteDTO other = (EleveNoteDTO) obj;
		if (nomEleve == null) {
			if (other.nomEleve != null)
				return false;
		} else if (!nomEleve.equals(other.nomEleve))
			return false;
		if (nomExamen == null) {
			if (other.nomExamen != null)
				return false;
		} else if (!nomExamen.equals(other.nomExamen))
			return false;
		if (valeurNote == null) {
			if (other.valeurNote != null)
				return false;
		} else if (!valeurNote.equals(other.valeurNote))
			return false;
		return true;
	}
<<<<<<< HEAD
=======

	@Override
	public String toString() {
		return "EleveNoteDTO [valeurNote=" + valeurNote + ", nomEleve=" + nomEleve + ", nomExamen=" + nomExamen + "]";
	}


 

>>>>>>> 1027e8da1f31a87170a720b6b2d563a43e6abbc9
	
}
