package br.com.usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepositorio extends JpaRepository<UsuarioEntidade, Long>  {
}
