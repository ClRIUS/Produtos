package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
public class ProdutoRequest {
    @NotNull(message = "A descrição não pode ser nula")
    @NotBlank(message = "A descrição não pode estar em branco")
    private String descricao;
    private double preco;
    @NotNull
    private Unidade unidade;
}
