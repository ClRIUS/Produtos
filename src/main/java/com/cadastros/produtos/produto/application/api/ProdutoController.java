package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.application.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI{

    private final ProdutoService produtoService;

    @Override
    public ProdutoResponse cadastraProduto(@Valid ProdutoRequest produtoRequest) {
        log.info("[start] ProdutoController - cadastraProduto");
        ProdutoResponse produtoCriado = produtoService.cadastraProduto(produtoRequest);
        log.info("[finish] ProdutoController - cadastraProduto");
        return produtoCriado;
    }

    @Override
    public List<ProdutoListResponse> listaTodosProdutos() {
        log.info("[start] ProdutoController - listaTodosProdutos");
        List<ProdutoListResponse> produtos = produtoService.buscaTodosProdutos();
        log.info("[finish] ProdutoController - listaTodosProdutos");
        return produtos;
    }

    @Override
    public ProdutoDetalhadoResponse buscaProduto(UUID idProduto) {
        log.info("[start] ProdutoController - buscaProduto");
        log.info("[idProduto] {}", idProduto);
        ProdutoDetalhadoResponse produtoDetalhado = produtoService.buscaProdutoPorId(idProduto);
        log.info("[finish] ProdutoController - buscaProduto");
        return produtoDetalhado;
    }

    @Override
    public void deletaProduto(UUID idProduto) {
        log.info("[start] ProdutoController - deletaProduto");
        log.info("[idCliente] {}", idProduto);
        produtoService.deletaProduto(idProduto);
        log.info("[finish] ProdutoController - deletaProduto");
    }

    @Override
    public void alteraProduto(UUID idProduto, @Valid ProdutoAlteracaoRequest produtoAlteracaoRequest) {
        log.info("[start] ProdutoController - alteraProduto");
        log.info("[idCliente] {}", idProduto);
        produtoService.alteraProduto(idProduto, produtoAlteracaoRequest);
        log.info("[finish] ProdutoController - alteraProduto");
    }
}
