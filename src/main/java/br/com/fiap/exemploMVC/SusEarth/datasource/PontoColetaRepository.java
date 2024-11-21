package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.PontoColeta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PontoColetaRepository extends JpaRepository<PontoColeta, Long>{}
