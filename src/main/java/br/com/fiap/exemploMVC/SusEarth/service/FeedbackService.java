package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedbackService{

    Feedback save ( Feedback f );

    void delete ( Feedback f );

    void deleteById ( long id );

    List<Feedback> findAllFeedback();

}
