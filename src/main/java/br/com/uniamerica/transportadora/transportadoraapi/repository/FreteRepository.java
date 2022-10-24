package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Frete;
import br.com.uniamerica.transportadora.transportadoraapi.entity.HistoricoFrete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FreteRepository extends JpaRepository<Frete,Long> {

    public List<Frete> findByAtivoTrue();

    public List<Frete> findByFrete(@Param("frete")final Frete frete);
}
