package com.cadastros.produtos.produto.application.service;

import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import com.cadastros.produtos.produto.application.api.ProdutoResponse;

public interface ProdutoService {
    ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest);
}
