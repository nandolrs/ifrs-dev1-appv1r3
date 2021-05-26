package com.nandolrs.ifrsdev1appv1r3.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class PessoaController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data

    @GetMapping(
     value = "/"
    ,produces = {MediaType.TEXT_PLAIN_VALUE}
    ) // Map ONLY POST Requests
    public @ResponseBody String Incluir () {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        String retorno = "IFRS - ADS - Desenvolvimento de sistemas I - Fernando Rodrigues";

        return retorno;
    }
}
