package com.guilhermehsp.PrimeiroProjetoSpring.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Produto;

@Component
public class RepositorioProduto {
	
	private Map<Long, Produto> map = new HashMap<>();
	
	public void save(Produto obj) {
		map.put(obj.getId(), obj);
	}

	public Produto findById(Long id) {
		return map.get(id);
	}
	
	public List<Produto> findAll() {
		return new ArrayList<Produto>(map.values());
	}

}
