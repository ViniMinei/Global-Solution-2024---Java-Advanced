package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.datasource.ColetaRepository;
import br.com.fiap.exemploMVC.SusEarth.domainmodel.Coleta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ColetaServiceImpl implements ColetaService {

    private ColetaRepository repo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Coleta save(Coleta i) { return this.repo.save( i ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(final Coleta i) { this.repo.delete( i ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(long id) { this.repo.deleteById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public Optional<Coleta> findById(long id) { return this.repo.findById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public List<Coleta> findAllColeta() { return this.repo.findAll(); }
}
