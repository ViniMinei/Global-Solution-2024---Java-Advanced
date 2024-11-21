package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.datasource.RiscosRepository;
import br.com.fiap.exemploMVC.SusEarth.domainmodel.Riscos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RiscosServiceImpl implements RiscosService {

    private RiscosRepository repo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Riscos save(Riscos p) { return this.repo.save( p ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Riscos p) { this.repo.delete( p ); }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(final long id) { this.repo.deleteById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public Optional<Riscos> findById(final long id) { return this.repo.findById( id ); }

    @Transactional(propagation = Propagation.NEVER)
    public List<Riscos> findAllRiscos() { return this.repo.findAll(); }
}
