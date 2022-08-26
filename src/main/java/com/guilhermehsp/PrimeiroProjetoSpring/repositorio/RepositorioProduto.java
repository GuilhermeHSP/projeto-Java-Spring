package com.guilhermehsp.PrimeiroProjetoSpring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Produto;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Long> {


}
