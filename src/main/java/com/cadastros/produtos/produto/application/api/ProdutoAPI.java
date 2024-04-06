package com.cadastros.produtos.produto.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse cadastraProduto(@Valid @RequestBody ProdutoRequest produtoRequest);
}
