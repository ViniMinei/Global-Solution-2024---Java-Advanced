package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Progresso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProgressoService{

    Progresso save(Progresso p);

    void delete(Progresso p);

    void deleteById(long id);

    List<Progresso> findAllProgresso();
}
