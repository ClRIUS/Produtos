package com.cadastros.produtos.produto.domain;

import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@Document(collection = "produto")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Produto {
    @Id
    private UUID idProduto;
    @NotNull(message = "A descrição não pode ser nula")
    @NotBlank(message = "A descrição não pode estar em branco")
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
