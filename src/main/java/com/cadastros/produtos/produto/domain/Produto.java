package com.cadastros.produtos.produto.domain;

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
    private UUID idProduto;
    @NotNull
    private String descricao;
    @Builder.Default
    private double preco = 0.00;
    @Builder.Default
    private Unidade unidade = Unidade.UN;
}
