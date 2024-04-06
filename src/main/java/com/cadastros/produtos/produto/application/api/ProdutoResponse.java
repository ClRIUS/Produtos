package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.domain.Unidade;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class ProdutoResponse {
    @Id
    private UUID idProduto;
    @NotNull
    private String descricao;
    private double preco;
    @NotNull
    private Unidade unidade;
}
