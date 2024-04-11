package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.application.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
