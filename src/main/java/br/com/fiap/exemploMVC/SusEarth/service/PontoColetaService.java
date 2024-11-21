package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.PontoColeta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PontoColetaService {

    PontoColeta save(PontoColeta l);

    void delete(PontoColeta l);

    void deleteById(long id);

    List<PontoColeta> findAllLicao();

}
