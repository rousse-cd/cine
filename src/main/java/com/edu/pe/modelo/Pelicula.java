package com.edu.pe.modelo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="pelicula")
@NamedQueries({
	@NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p"),
	@NamedQuery(name = "Pelicula.findByIdPelicula", query = "SELECT p FROM Pelicula p WHERE p.idPelicula = :idPelicula"),
	@NamedQuery(name = "Pelicula.findByNombre", query = "SELECT p FROM Pelicula p WHERE p.nombre = :nombre"),
	@NamedQuery(name = "Pelicula.findByDuracion", query = "SELECT p FROM Pelicula p WHERE p.duracion = :duracion"),
	
	@NamedQuery(name = "Pelicula.findByClasificacion", query = "SELECT p FROM Pelicula p WHERE p.clasificacion = :clasificacion"),
	@NamedQuery(name = "Pelicula.findByIdioma", query = "SELECT p FROM Pelicula p WHERE p.idioma = :idioma"),
	@NamedQuery(name = "Pelicula.findByGenero", query = "SELECT p FROM Pelicula p WHERE p.genero = :genero"),
	@NamedQuery(name = "Pelicula.findByFormato", query = "SELECT p FROM Pelicula p WHERE p.formato = :formato"),
	@NamedQuery(name = "Pelicula.findBySinopsis", query = "SELECT p FROM Pelicula p WHERE p.sinopsis = :sinopsis")
})
public class Pelicula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = true)
	private Integer idPelicula;
	
	@Basic(optional = false)
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "duracion")
	private String duracion;
	
	@Column(name = "clasificacion")
	private String clasificacion;
	
	@Column(name = "idioma")
	private String idioma;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "formato")
	private String formato;
	
	@Column(name = "sinopsis")
	private String sinopsis;
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "pelicula", fetch=FetchType.LAZY)
	//@JsonBackReference(value="pelicula_fun")
	//private List<Funciones> funcionesList;

	public Pelicula() {
		
	}
	public Pelicula(String nombre, String duracion, String clasificacion, String idioma, String genero, String formato,
			String sinopsis) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.idioma = idioma;
		this.genero = genero;
		this.formato = formato;
		this.sinopsis = sinopsis;
		//this.funcionesList = funcionesList;
	}
	public Integer getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(Integer idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	//public List<Funciones> getFuncionesList() {
		//return funcionesList;
	//}
	//public void setFuncionesList(List<Funciones> funcionesList) {
		//this.funcionesList = funcionesList;
	//}
	
	
	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + "]";
	}
	

}
