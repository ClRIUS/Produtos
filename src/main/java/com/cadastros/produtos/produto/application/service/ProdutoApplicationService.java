package com.cadastros.produtos.produto.application.service;

import com.cadastros.produtos.produto.application.api.ProdutoRequest;
import com.cadastros.produtos.produto.application.api.ProdutoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProdutoApplicationService implements ProdutoService{
    @Override
    public ProdutoResponse cadastraProduto(ProdutoRequest produtoRequest) {
        log.info("[Start] ProdutoApplicationService - cadastraProduto");
        log.info("[Finish] ProdutoApplicationService - cadastraProduto");
        return null;
    }
}
