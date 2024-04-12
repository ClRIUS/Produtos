package com.cadastros.produtos.produto.application.infra;

import com.cadastros.produtos.produto.application.repository.ProdutoRepository;
import com.cadastros.produtos.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Produto> buscaTodosProdutos() {
        log.info("[Start] ProdutoInfraRepository - buscaTodosProdutos");
        List<Produto> todosProdutos = produtoSpringDataMongoDB.findAll();
        log.info("[Finish] ProdutoInfraRepository - buscaTodosProdutos");
        return todosProdutos;
    }

    @Override
    public Produto buscaProdutoPorId(UUID idProduto) {
        log.info("[Start] ProdutoInfraRepository - buscaProdutoPorId");
        Produto produto = produtoSpringDataMongoDB.findById(idProduto)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
        log.info("[Finish] ProdutoInfraRepository - buscaProdutoPorId");
        return produto;
    }

    @Override
    public void deletaProdutoPorId(Produto produto) {
        log.info("[Start] ProdutoInfraRepository - deletaProdutoPorId");
        produtoSpringDataMongoDB.delete(produto);
        log.info("[Finish] ProdutoInfraRepository - deletaProdutoPorId");
    }
}
