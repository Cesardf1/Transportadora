package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.math.BigDecimal;

@Entity @Table(name = "tb_fretes",schema = "transportadora")
public class Frete extends AbstractEntity {
    @ManyToOne @Getter @Setter
    private Produto produto;
    @ManyToOne @Getter @Setter
    private Cidade cidadeOrigem;
    @ManyToOne @Getter @Setter
    private Cidade cidadeDestino;
    @ManyToOne @Getter @Setter
    private Usuario motorista;
    @ManyToOne @Getter @Setter
    private Caminhao caminhao;
    @Getter @Setter
    private StatusFrete statusFrete;
    @Getter @Setter
    @Column(name = "quilometragem_inicial",nullable = false,unique = true)
    private int quilometragemIni;
    @Getter @Setter
    private int quilometragemFim;
    @Getter @Setter
    @Column(name = "total_bruto_recebido_nota",nullable = false,scale = 3,precision = 10)
    private BigDecimal totalBrutoRecebidoNota;
    @Getter @Setter
    @Column(name = "total_liquido_recebido_nota",nullable = false,scale = 3,precision = 10)
    private BigDecimal totalLiquidoRecebido;
    @Getter @Setter
    @Column(name = "peso_inicial",nullable = false,scale = 3,precision = 7)
    private BigDecimal pesoInicial;
    @Getter @Setter
    @Column(name = "peso_final",scale = 3,precision = 7)
    private BigDecimal pesoFinal;
    @Getter @Setter
    @Column(name = "peso_final_transportado",scale = 3,precision = 7)
    private BigDecimal pesoFinalTransportado;
    @Getter @Setter
    @Column(name = "preco_tonelada",nullable = false,scale = 3,precision = 7)
    private BigDecimal precoTonelada;
    @Getter @Setter
    @Column(name = "observacao",length = 100)
    private String observacao;

}
