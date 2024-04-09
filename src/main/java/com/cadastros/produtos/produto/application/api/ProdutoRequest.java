package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
public class ProdutoRequest {
    @NotNull
    private String descricao;
    private double preco;
    @NotNull
    private Unidade unidade;
}
