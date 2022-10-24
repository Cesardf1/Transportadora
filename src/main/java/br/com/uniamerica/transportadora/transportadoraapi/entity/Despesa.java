package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity @Table(name = "tb_despesas",schema = "transportadora")
public class Despesa extends AbstractEntity {
    @ManyToOne @Getter @Setter
    private TipoDespesa tipoDespesa;
    @Getter @Setter
    @Column(name = "valor",nullable = false,scale = 3,precision = 6)
    private BigDecimal valor;
    @ManyToOne @Getter @Setter
    private Usuario motorista;
    @Getter @Setter
    @Column(name = "data",nullable = false)
    private LocalDateTime data;
    @Getter @Setter @ManyToOne
    private Usuario aprovador;
    @ManyToOne @Getter @Setter
    private Frete frete;

}
