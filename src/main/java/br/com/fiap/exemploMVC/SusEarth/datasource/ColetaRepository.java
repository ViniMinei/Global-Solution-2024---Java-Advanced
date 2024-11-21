package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColetaRepository extends JpaRepository<Coleta, Long>{}
