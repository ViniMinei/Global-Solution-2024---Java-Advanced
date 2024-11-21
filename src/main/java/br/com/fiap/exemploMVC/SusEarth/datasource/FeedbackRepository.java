package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{}
