package com.cadastros.produtos.produto.domain;

import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Builder
@Document(collection = "produto")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Produto {
    @Id
    private UUID idProduto;
    @NotNull
    @NotBlank
    private String descricao;
    @Builder.Default
    private double preco = 0.00;
    private Unidade unidade;

    public Produto(ProdutoRequest produtoRequest) {
        this.idProduto = UUID.randomUUID();
        this.descricao = produtoRequest.getDescricao();
        this.preco = produtoRequest.getPreco();
        this.unidade = produtoRequest.getUnidade();
    }
}
