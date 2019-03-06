package br.com.ww.dm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ww.dm.domains.Requisicao;

/**
 * @author William Lima (wwlima@gmail.com)
 *
 */
@Repository
public interface RequisicaoRepository extends JpaRepository<Requisicao, Integer>{

}
