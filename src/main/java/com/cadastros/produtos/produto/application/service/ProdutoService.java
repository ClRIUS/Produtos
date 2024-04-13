package com.cadastros.produtos.produto.application.service;

import com.cadastros.produtos.produto.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ProdutoService {
    ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest);
    List<ProdutoListResponse> buscaTodosProdutos();
    ProdutoDetalhadoResponse buscaProdutoPorId(UUID idProduto);
    void deletaProduto(UUID idProduto);
    void alteraProduto(ProdutoAlteracaoRequest produtoAlteracaoRequest);
}
