package br.com.fiap.exemploMVC.SusEarth.datasource;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}
