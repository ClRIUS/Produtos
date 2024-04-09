package com.cadastros.produtos.produto.application.repository;

import com.cadastros.produtos.produto.domain.Produto;

public interface ProdutoRepository {
    Produto salva(Produto produto);
}
