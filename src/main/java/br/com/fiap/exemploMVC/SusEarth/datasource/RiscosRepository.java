package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Riscos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiscosRepository extends JpaRepository<Riscos, Long>{}
