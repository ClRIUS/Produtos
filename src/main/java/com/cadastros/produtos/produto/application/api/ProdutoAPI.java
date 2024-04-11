package com.cadastros.produtos.produto.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produto")
public interface ProdutoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProdutoResponse cadastraProduto(@Valid @RequestBody ProdutoRequest produtoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ProdutoListResponse> listaTodosProdutos();
}
