package com.guilhermehsp.PrimeiroProjetoSpring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {

}
