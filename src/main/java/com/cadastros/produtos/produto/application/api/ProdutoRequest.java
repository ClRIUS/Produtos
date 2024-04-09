package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
@Valid
public class ProdutoRequest {
    @NotNull(message = "A descrição não pode ser nula")
    @NotBlank(message = "A descrição não pode estar em branco")
    @Size(min = 2, max = 25)
    private String descricao;
    private double preco;
    @NotNull
    private Unidade unidade;
}
