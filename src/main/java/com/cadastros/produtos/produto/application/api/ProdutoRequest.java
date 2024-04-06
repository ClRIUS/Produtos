package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import lombok.Value;
import org.springframework.data.annotation.Id;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Value
@Valid
public class ProdutoRequest {
    @NotNull
    private String descricao;
    private double preco;
    @NotNull
    private Unidade unidade;
}
