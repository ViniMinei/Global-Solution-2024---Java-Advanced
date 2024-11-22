package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Progresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressoRepository extends JpaRepository<Progresso, Long>{}
