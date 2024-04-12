package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Produto;
import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;

import java.util.UUID;

@Value
public class ProdutoDetalhadoResponse {
    private UUID idProduto;
    private String descricao;
    private double preco;
    private Unidade unidade;

    public ProdutoDetalhadoResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
        this.unidade = produto.getUnidade();
    }
}
