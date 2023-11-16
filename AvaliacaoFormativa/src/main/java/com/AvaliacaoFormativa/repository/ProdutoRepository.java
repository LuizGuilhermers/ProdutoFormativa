package com.AvaliacaoFormativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AvaliacaoFormativa.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
