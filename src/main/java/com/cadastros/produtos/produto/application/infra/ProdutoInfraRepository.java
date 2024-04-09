package com.cadastros.produtos.produto.application.infra;

import com.cadastros.produtos.produto.application.repository.ProdutoRepository;
import com.cadastros.produtos.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutoInfraRepository implements ProdutoRepository {

    private final ProdutoSpringDataMongoDB produtoSpringDataMongoDB;

    @Override
    public Produto salva(Produto produto) {
        log.info("[Start] ProdutoInfraRepository - salva");
        produtoSpringDataMongoDB.save(produto);
        log.info("[Finish] ProdutoInfraRepository - salva");
        return produto;
    }
}
