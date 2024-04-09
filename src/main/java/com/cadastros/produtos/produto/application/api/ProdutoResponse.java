package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProdutoResponse {
    private String idProduto;
    private String descricao;
    private double preco;
    private Unidade unidade;
}
