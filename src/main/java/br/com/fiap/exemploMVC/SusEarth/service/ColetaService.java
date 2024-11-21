package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Coleta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ColetaService {

    Coleta save (Coleta i);

    void delete ( Coleta i );

    void deleteById ( long id );

    List<Coleta> findAllColeta();
}
