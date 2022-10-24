package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Cidade;
import br.com.uniamerica.transportadora.transportadoraapi.entity.Estado;
import br.com.uniamerica.transportadora.transportadoraapi.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CidadeRepository extends JpaRepository<Cidade,Long> {

    public List<Cidade> findByAtivoTrue();

    @Query("from Cidade cidade where cidade.ativo = true and cidade.estado.id =:estado ")
    public List<Cidade> findByEstado(@Param("estado") final Long estado);

}
