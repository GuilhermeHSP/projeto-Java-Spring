package com.guilhermehsp.PrimeiroProjetoSpring.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Categoria;
import com.guilhermehsp.PrimeiroProjetoSpring.repositorio.RepositorioCategoria;

@RestController
@RequestMapping(value = "/categorias")
public class RecursoCategoria {
	
	@Autowired
	private RepositorioCategoria repositorioCategoria;

	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> list = repositorioCategoria.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria cat = repositorioCategoria.findById(id);
		return ResponseEntity.ok().body(cat);
	} 
} 
