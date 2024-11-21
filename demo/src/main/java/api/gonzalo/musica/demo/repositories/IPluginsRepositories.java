package api.gonzalo.musica.demo.repositories;

import api.gonzalo.musica.demo.models.Plugins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IPluginsRepositories extends JpaRepository<Plugins, Long> {
    List<Plugins> findByEfecto(String efecto);
    List<Plugins> findByNombre(String nombre);
    List<Plugins> findByFabricante(String fabricante);
    List<Plugins> findByCosto(Long costo);
}

