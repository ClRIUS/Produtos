package com.cadastros.produtos.produto.application.repository;

import com.cadastros.produtos.produto.application.api.ProdutoListResponse;
import com.cadastros.produtos.produto.domain.Produto;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository {
    Produto salva(Produto produto);
    List<Produto> buscaTodosProdutos();
    Produto buscaProdutoPorId(UUID idProduto);
}
