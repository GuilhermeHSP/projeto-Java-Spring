package com.guilhermehsp.PrimeiroProjetoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Categoria;
import com.guilhermehsp.PrimeiroProjetoSpring.repositorio.RepositorioCategoria;

@SpringBootApplication
public class PrimeiroProjetoSpringApplication implements CommandLineRunner{

	@Autowired
	private RepositorioCategoria repositorioCategoria;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(1L, "Eletronicos");
		Categoria cat2 = new Categoria(2L, "Livros");
		
		repositorioCategoria.save(cat1);
		repositorioCategoria.save(cat2);
	}

}
