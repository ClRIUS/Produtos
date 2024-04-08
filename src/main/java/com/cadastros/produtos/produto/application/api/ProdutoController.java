package com.cadastros.produtos.produto.application.api;

import com.cadastros.produtos.produto.application.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI{

    private final ProdutoService produtoService;

    @Override
    public ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest) {
        log.info("[start] ProdutoController - cadastraProduto");
        ProdutoResponse produtoCriado = produtoService.cadastraProduto(produtoRequest);
        log.info("[finish] ProdutoController - cadastraProduto");
        return produtoCriado;
    }
}
