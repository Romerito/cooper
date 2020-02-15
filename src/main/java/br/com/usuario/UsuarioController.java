package br.com.usuario;

import javax.validation.Valid;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioServico usuario;


    @ApiOperation(value = "Save on user")
    @PostMapping("/")
    public ResponseEntity create(@Valid @RequestBody UsuarioEntidade codigo) {
       return usuario.salvar(codigo);
    }

    @ApiOperation(value = "delete on user id")
    @DeleteMapping("/{id}")
    public ResponseEntity<UsuarioEntidade> delete(@PathVariable(value="id") UsuarioEntidade userId){
        return usuario.salvar(userId);
    }

    @ApiOperation(value = "Get one users")
    @GetMapping("/")
    public ResponseEntity carregar(UsuarioEntidade userId) {
        return usuario.carregar(userId);
    }

    @ApiOperation(value = "Get all users")
    @GetMapping("/")
    public ResponseEntity<ResponseEntity> getAllUsers() {
        return usuario.listar();
    }
}
