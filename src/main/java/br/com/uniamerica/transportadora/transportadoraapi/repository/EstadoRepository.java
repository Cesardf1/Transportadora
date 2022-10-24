package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EstadoRepository extends JpaRepository<Estado,Long> {
@Query("from Estado where ativo = :ativo")
    public List<Estado> findByAtivoTrue();

    public List<Estado> findByNome(final String nome);

    Object findByNomeAndAtivo(String nome, boolean b);
}
