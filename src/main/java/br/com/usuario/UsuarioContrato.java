package br.com.usuario;

import org.springframework.http.ResponseEntity;

public interface UsuarioContrato {
    public ResponseEntity salvar(UsuarioEntidade usuario);
    public ResponseEntity excluir(UsuarioEntidade usuario);
    public ResponseEntity carregar(UsuarioEntidade codigo);
    public ResponseEntity<ResponseEntity> listar();
}
