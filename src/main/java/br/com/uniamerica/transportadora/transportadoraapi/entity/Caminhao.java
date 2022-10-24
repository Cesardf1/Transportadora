package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_caminhoes",schema = "transportadora")
public class Caminhao extends AbstractEntity {

    @Getter @Setter
    @Column(name = "placa",length = 8,nullable = false,unique = true)
    private String placa;
    @Getter @Setter @ManyToOne
    private Modelo modelo;
    @Getter @Setter
    @Column(name = "ano")
    private int ano;
    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private Cor cor;
    @Getter @Setter
    @Column(name = "observacao",length = 100,nullable = true,unique = false)
    private String observacao;

    }
