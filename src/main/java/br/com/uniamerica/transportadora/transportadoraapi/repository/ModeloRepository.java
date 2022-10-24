package br.com.uniamerica.transportadora.transportadoraapi.repository;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Marca;
import br.com.uniamerica.transportadora.transportadoraapi.entity.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.JoinColumn;
import java.util.List;

@Repository

public interface ModeloRepository extends JpaRepository<Modelo,Long> {

    public List<Modelo> findByAtivoTrue();

    @Query ("from Modelo modelo where modelo.ativo = true and modelo.marca.id =:marca ")
    public List<Modelo> findByMarca(@Param("marca") final Long marca);
}
