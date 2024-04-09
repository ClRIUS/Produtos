package com.cadastros.produtos.produto.domain;

import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@Document(collection = "produto")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Produto {
    @Id
    private String idProduto;
    @NotNull
    private String descricao;
    @Builder.Default
    private double preco = 0.00;
    private Unidade unidade;

    public Produto(ProdutoRequest produtoRequest) {
        this.descricao = produtoRequest.getDescricao();
        this.preco = produtoRequest.getPreco();
        this.unidade = produtoRequest.getUnidade();
    }
}
