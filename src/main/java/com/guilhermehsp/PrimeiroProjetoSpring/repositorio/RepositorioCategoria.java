package com.guilhermehsp.PrimeiroProjetoSpring.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.guilhermehsp.PrimeiroProjetoSpring.entidades.Categoria;

@Component
public class RepositorioCategoria {
	
	private Map<Long, Categoria> map = new HashMap<>();
	
	public void save(Categoria obj) {
		map.put(obj.getId(), obj);
	}

	public Categoria findById(Long id) {
		return map.get(id);
	}
	
	public List<Categoria> findAll() {
		return new ArrayList<Categoria>(map.values());
	}

}
