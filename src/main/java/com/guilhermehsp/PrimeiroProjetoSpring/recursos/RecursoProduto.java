package com.guilhermehsp.PrimeiroProjetoSpring.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Produto;
import com.guilhermehsp.PrimeiroProjetoSpring.repositorio.RepositorioProduto;

@RestController
@RequestMapping(value = "/produtos")
public class RecursoProduto {
	
	@Autowired
	private RepositorioProduto repositorioProduto;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = repositorioProduto.findAll();
		return ResponseEntity.ok().body(list);
	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto cat = repositorioProduto.findById(id).get();
		return ResponseEntity.ok().body(cat);
	} 
} 
