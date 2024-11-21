package api.gonzalo.musica.demo.service;

import api.gonzalo.musica.demo.models.Plugins;
import api.gonzalo.musica.demo.repositories.IPluginsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PluginService {
    private IPluginsRepositories pluginRepo;
   @Autowired

    public PluginService(IPluginsRepositories pluginRepo) {
        this.pluginRepo = pluginRepo;
    }

    //Metodo para crear plugins
    public void crearPlugin(Plugins plugins){
       pluginRepo.save(plugins);
    }

    //Metodo para listar todos los plugins en BBDD
    public List<Plugins> listarPlugins(){
       return pluginRepo.findAll();
    }

    //Metodo para actualizar un plugin
    public void actualizarPlugin(Plugins plugins){
       pluginRepo.save(plugins);
    }

    //Metodo para eliminar un plugin
    public void eliminarPluginPorId(Long id){
       pluginRepo.deleteById(id);
    }

    //Metodo para listar un plugin por id especifico
    public Optional<Plugins> buscarPorId(Long id){
       return pluginRepo.findById(id);
    }

    //Metodos para buscar segun atributos propios de la clase
    public List<Plugins> buscarPorNombre(String nombre){
       return pluginRepo.findByNombre(nombre);
    }

    public List<Plugins> buscarPorFabricante(String fabricante){
       return pluginRepo.findByFabricante(fabricante);
    }

    public List<Plugins> buscarPorCosto(Long costo){
       return pluginRepo.findByCosto(costo);
    }

    public List<Plugins> buscarPorEfecto(String efecto){
       return pluginRepo.findByEfecto(efecto);
    }
}
