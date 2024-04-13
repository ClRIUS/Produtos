package com.cadastros.produtos.produto.application.service;

import com.cadastros.produtos.produto.application.api.*;
import com.cadastros.produtos.produto.application.repository.ProdutoRepository;
import com.cadastros.produtos.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService{

    private final ProdutoRepository produtoRepository;

    @Override
    public ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest) {
        log.info("[Start] ProdutoApplicationService - cadastraProduto");
        Produto produto = produtoRepository.salva(new Produto(produtoRequest));
        log.info("[Finish] ProdutoApplicationService - cadastraProduto");
        return ProdutoResponse.builder()
                .idProduto(UUID.randomUUID())
                .descricao(produto.getDescricao())
                .preco(produto.getPreco())
                .unidade(produto.getUnidade())
                .build();
    }

    @Override
    public List<ProdutoListResponse> buscaTodosProdutos() {
        log.info("[Start] ProdutoApplicationService - buscaTodosProdutos");
        List<Produto> produtos = produtoRepository.buscaTodosProdutos();
        log.info("[Finish] ProdutoApplicationService - buscaTodosProdutos");
        return ProdutoListResponse.converte(produtos);
    }

    @Override
    public ProdutoDetalhadoResponse buscaProdutoPorId(UUID idProduto) {
        log.info("[Start] ProdutoApplicationService - buscaProdutoPorId");
        Produto produto = produtoRepository.buscaProdutoPorId(idProduto);
        log.info("[Finish] ProdutoApplicationService - buscaProdutoPorId");
        return new ProdutoDetalhadoResponse(produto);
    }

    @Override
    public void deletaProduto(UUID idProduto) {
        log.info("[Start] ProdutoApplicationService - deletaProduto");
        Produto produto = produtoRepository.buscaProdutoPorId(idProduto);
        produtoRepository.deletaProdutoPorId(produto);
        log.info("[Finish] ProdutoApplicationService - deletaProduto");
    }

    @Override
    public void alteraProduto(ProdutoAlteracaoRequest produtoAlteracaoRequest) {
        log.info("[Start] ProdutoApplicationService - alteraProduto");
        log.info("[Finish] ProdutoApplicationService - alteraProduto");
    }
}
