package br.com.usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServico implements UsuarioContrato{

    UsuarioServico usuarioServico;

    @Override
    public ResponseEntity salvar(UsuarioEntidade usuario) {
        if(usuario == null || usuario.canEqual("")){
        return ResponseEntity.notFound().build();
        } else {
            usuarioServico.salvar(usuario);
            return ResponseEntity.ok().build();
        }
    }

    @Override
    public ResponseEntity excluir(UsuarioEntidade usuario) {
        if(usuario == null || usuario.equals("")){
            return ResponseEntity.notFound().build();
        }
        usuarioServico.excluir(usuario);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity carregar(UsuarioEntidade codigo) {
        if(codigo == null || codigo.equals("")){
            ResponseEntity.notFound().build();
        }
        usuarioServico.carregar(codigo);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<ResponseEntity> listar() {
        if(usuarioServico.listar() == null || usuarioServico.listar().equals("")){
            ResponseEntity.notFound().build();
        }
        usuarioServico.listar();
        return ResponseEntity.ok().build();
    }
}
