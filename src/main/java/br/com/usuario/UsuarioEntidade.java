package br.com.usuario;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
@Data
public class UsuarioEntidade implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long            codigo;

    @NotBlank
    private String          nome;

    @org.hibernate.annotations.NaturalId
    @NotBlank
    private String          email;

    @NotBlank
    private String          cooperativa;

    @NotBlank
    private String          senha;

    @NotBlank
    private String          confirmarSenha;

    @JsonFormat(pattern = "dd-mm-yyyy", timezone = "America/Sao_Paulo")
    private Date nascimelnto;

    @NotBlank
    private String          telefone;
}