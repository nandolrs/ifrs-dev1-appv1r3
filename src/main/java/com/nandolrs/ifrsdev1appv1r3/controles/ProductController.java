package com.nandolrs.ifrsdev1appv1r3.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/product") // This means URL's start with /demo (after Application path)
public class ProductController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private com.nandolrs.ifrsdev1appv1r3.repositorios.ProductRepository productRepository;

    @PostMapping(
            value = "incluir"
            ,consumes = {MediaType.APPLICATION_JSON_VALUE}
            ,produces = {MediaType.APPLICATION_JSON_VALUE}
    ) // Map ONLY POST Requests
    public @ResponseBody com.nandolrs.ifrsdev1appv1r3.dados.Product Incluir (@RequestBody  com.nandolrs.ifrsdev1appv1r3.dados.Product entidade) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        productRepository.save(entidade);

        return entidade;
    }

}
