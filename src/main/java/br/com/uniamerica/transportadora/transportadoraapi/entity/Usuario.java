package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

@Entity @Table(name = "tb_usuarios",schema = "transportadora")
public class Usuario extends AbstractEntity {
    @Getter @Setter
    @Column(name = "perc_ganh",nullable = false,scale = 3,precision = 6)
    private BigDecimal percGanho;
    @Getter @Setter
    @Column(name = "login",length = 25,nullable = false,unique = true)
    private String login;
    @Getter @Setter
    @Column(name = "senha",length = 25,nullable = false)
    private String senha;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "grupo",length = 25,nullable = false)
    private Grupo grupo;
    @Getter @Setter
    @Column(name = "nome",length = 25,nullable = false,unique = false)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf",length = 12,nullable = false,unique = true)
    private String cpf;
    @Getter @Setter
    @Column(name = "telefone",length = 12,nullable = false,unique = false)
    private String telefone;
    @Getter @Setter
    @Column(name = "data_nascimento",nullable = false,unique = false)
    private Date dataNascimento;
    @Getter @Setter
    @Column(name = "endereco",length = 30,nullable = false,unique = false)
    private String endereco;
    @Getter @Setter
    @Column(name = "observacao",length = 100,nullable = true,unique = false)
    private String observacao;

}
