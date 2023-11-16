package com.AvaliacaoFormativa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AvaliacaoFormativa.entities.Produto;
import com.AvaliacaoFormativa.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository produtoRepository;
	 
    @Autowired
    public ProdutoService (ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public List<Produto> buscarTodosProdutos(){
        return produtoRepository.findAll();
    }
    public Produto buscarProdutoId(Long id) {
        Optional <Produto> Produto = produtoRepository.findById(id);
        return Produto.orElse(null);
    }
    public Produto salvaProduto (Produto produto) {
        return produtoRepository.save(produto);
    }
    public Produto alterarProduto(Long id, Produto alterarProduto) {
        Optional <Produto> existeProduto = produtoRepository.findById(id);
        if (existeProduto.isPresent()) {
            alterarProduto.setId(id);
            return produtoRepository.save(alterarProduto);
        }
        return null;
 
    }
    public boolean apagarProduto(Long id) {
        Optional <Produto> existeProduto = produtoRepository.findById(id);
        if (existeProduto.isPresent()) {
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
