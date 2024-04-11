package com.cadastros.produtos.produto.application.service;

import com.cadastros.produtos.produto.application.api.ProdutoListResponse;
import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import com.cadastros.produtos.produto.application.api.ProdutoResponse;

import java.util.List;

public interface ProdutoService {
    ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();

}
