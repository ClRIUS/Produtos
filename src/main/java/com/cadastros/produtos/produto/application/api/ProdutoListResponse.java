package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Produto;
import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value
public class ProdutoListResponse {
    private UUID idProduto;
    private String descricao;
    private double preco;
    private Unidade unidade;

    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return null;
    }
}
