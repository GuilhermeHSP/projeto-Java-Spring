package com.guilhermehsp.PrimeiroProjetoSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Categoria;
import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Produto;
import com.guilhermehsp.PrimeiroProjetoSpring.repositorio.RepositorioCategoria;
import com.guilhermehsp.PrimeiroProjetoSpring.repositorio.RepositorioProduto;

@SpringBootApplication
public class PrimeiroProjetoSpringApplication implements CommandLineRunner{

	@Autowired
	private RepositorioCategoria repositorioCategoria;
	
	@Autowired
	private RepositorioProduto repositorioProduto;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		
		Produto p1 = new Produto(null, "TV", 2200.00, cat1);
		Produto p2 = new Produto(null, "Domain Driven Design", 120.00, cat2);
		Produto p3 = new Produto(null, "PS5", 2800.00, cat1);
		Produto p4 = new Produto(null, "Docker", 100.00, cat2);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		
		repositorioCategoria.save(cat1);
		repositorioCategoria.save(cat2);
		
		repositorioProduto.save(p1);
		repositorioProduto.save(p2);
		repositorioProduto.save(p3);
		repositorioProduto.save(p4);

	}

}
