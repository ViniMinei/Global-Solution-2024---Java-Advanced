package br.com.fiap.exemploMVC.SusEarth.service;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService{

    Usuario save(Usuario u);

    void delete(Usuario u);

    void deleteById(long id);

    List<Usuario> findAllUsuario();

}
