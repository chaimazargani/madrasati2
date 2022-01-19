package com.pfe.madrasati.model;

public class Cours {

	private Integer idCours;
	private String url ;
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cours(Integer idCours, String url) {
		super();
		this.idCours = idCours;
		this.url = url;
	}
	public Integer getIdCours() {
		return idCours;
	}
	public void setIdCours(Integer idCours) {
		this.idCours = idCours;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCours == null) ? 0 : idCours.hashCode());
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
		Cours other = (Cours) obj;
		if (idCours == null) {
			if (other.idCours != null)
				return false;
		} else if (!idCours.equals(other.idCours))
			return false;
		return true;
	}
	
}
