package com.edu.pe.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.modelo.Pelicula;
import com.edu.pe.repositorio.PeliculaRepositorio;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PeliculasServicio {
	
	@Autowired //Inyección de dependencia
	private PeliculaRepositorio repositorio;
	
	public PeliculasServicio () {
		
	}
	
	public List<Pelicula> buscarTodo(){
		return (List<Pelicula>) repositorio.findAll();
	}
	
	public Pelicula crear (Pelicula pelicula) {
		return repositorio.save(pelicula);
	}
	
	public Pelicula actualizar (Pelicula peliculaActualizar) {
		//primero realizamos la busqeudade pelis
		Pelicula peliculaActual =  repositorio.findById(peliculaActualizar.getIdPelicula()).get();
		
		peliculaActual.setIdPelicula(peliculaActualizar.getIdPelicula());
		peliculaActual.setNombre(peliculaActual.getNombre());
		peliculaActual.setDuracion(peliculaActual.getDuracion());
		peliculaActual.setClasificacion(peliculaActual.getClasificacion());
		peliculaActual.setIdioma(peliculaActual.getIdioma());
		peliculaActual.setGenero(peliculaActual.getGenero());
		peliculaActual.setFormato(peliculaActual.getFormato());
		peliculaActual.setSinopsis(peliculaActual.getSinopsis());
		
		Pelicula peliculaActualizado = repositorio.save(peliculaActual);
		return peliculaActualizado;


	}
	
	public Pelicula bucarPorId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	
	public void borrarPorId(Integer id) {
		repositorio.deleteById(id);
	}

	public Pelicula buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
