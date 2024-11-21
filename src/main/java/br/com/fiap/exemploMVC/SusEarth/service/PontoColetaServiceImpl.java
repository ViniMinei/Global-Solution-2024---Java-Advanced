package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.datasource.PontoColetaRepository;
import br.com.fiap.exemploMVC.SusEarth.domainmodel.PontoColeta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PontoColetaServiceImpl implements PontoColetaService {

    private PontoColetaRepository repo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PontoColeta save(PontoColeta l) { return this.repo.save( l ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(PontoColeta l) { this.repo.delete( l ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(final long id) { this.repo.deleteById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public Optional<PontoColeta> findById(final long id) { return this.repo.findById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public List<PontoColeta> findAllLicao() { return this.repo.findAll(); }
}
