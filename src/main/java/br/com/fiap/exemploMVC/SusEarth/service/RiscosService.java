package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Riscos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RiscosService {

    Riscos save(Riscos p);

    void delete(Riscos p);

    void deleteById(long id);

    List<Riscos> findAllRiscos();
}
