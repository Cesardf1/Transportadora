package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Frete;
import br.com.uniamerica.transportadora.transportadoraapi.entity.HistoricoFrete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface HistoricoFreteRepository extends JpaRepository<HistoricoFrete,Long> {

    public List<HistoricoFrete> findByAtivoTrue();

    public List<HistoricoFrete> findByFrete(@Param("frete")final Frete frete);
}
