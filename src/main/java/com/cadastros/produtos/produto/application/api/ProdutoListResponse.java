package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Produto;
import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ProdutoListResponse {
    private UUID idProduto;
    private String descricao;
    private double preco;
    private Unidade unidade;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }

    public ProdutoListResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.descricao = produto.getDescricao();
        this.preco = produto.getPreco();
        this.unidade = produto.getUnidade();
    }
}
