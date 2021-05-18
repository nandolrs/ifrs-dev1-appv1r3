package com.nandolrs.ifrsdev1appv1r3.controles;

import com.nandolrs.ifrsdev1appv1r3.dados.Usuario;
import com.nandolrs.ifrsdev1appv1r3.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UsuarioRepository usuarioRepository;


    @PostMapping(
     value = "incluir"
    ,consumes = {MediaType.APPLICATION_JSON_VALUE}
    ,produces = {MediaType.APPLICATION_JSON_VALUE}
    ) // Map ONLY POST Requests
    public @ResponseBody
    Usuario Incluir (@RequestBody Usuario entidade) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

       usuarioRepository.save(entidade);

        return entidade;
    }
}