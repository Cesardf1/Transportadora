package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.*;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DespesaRepository extends JpaRepository<Despesa,Long> {

    public List<Despesa> findByAtivoTrue();

    @Query("from Despesa despesa where despesa.ativo = true and despesa.motorista.id =:motorista")
    public List<Despesa> findByMotorista(@Param("motorista")final Long motorista);

    @Query("from Despesa despesa where despesa.ativo = true and despesa.frete.id =:frete")
    public List<Despesa> findByFrete(@Param("frete")final Long frete);

    @Query("from Despesa despesa where despesa.ativo = true and despesa.aprovador.id =:aprovador")
    public List<Despesa> findByAprovador(@Param("aprovador")final Long aprovador);
}
