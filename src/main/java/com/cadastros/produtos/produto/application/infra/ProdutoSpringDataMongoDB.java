package com.cadastros.produtos.produto.application.infra;

import com.cadastros.produtos.produto.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProdutoSpringDataMongoDB extends MongoRepository<Produto, UUID> {
}
