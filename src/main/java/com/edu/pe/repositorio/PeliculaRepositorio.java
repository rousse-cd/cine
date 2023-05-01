package com.edu.pe.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.edu.pe.modelo.Pelicula;

public interface PeliculaRepositorio extends CrudRepository<Pelicula, Integer> {
	
	@Query(value = "SELECT a FROM Pelicula a WHERE a.nombre =?1")
	public List<Pelicula> buscarPeliculaPorNombre (String nombre);
	
	
	@Query (value = "SELECT a FROM Pelicula a WHERE a.nombre like CONCAT(?1, '%')")
	public  List<Pelicula> buscarPeliculasLikeNombre (String nombre);
	

}
