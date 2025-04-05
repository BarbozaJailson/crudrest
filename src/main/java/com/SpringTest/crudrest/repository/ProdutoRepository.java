package com.SpringTest.crudrest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpringTest.crudrest.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	//select * from produto where descrição li ""
	List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
}
