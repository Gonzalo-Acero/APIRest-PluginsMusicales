package api.gonzalo.musica.demo.controller;

import api.gonzalo.musica.demo.models.Plugins;
import api.gonzalo.musica.demo.service.PluginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/plugins")
public class PluginRestController {
    private PluginService pluginService;

    @Autowired
    public PluginRestController(PluginService pluginService) {
        this.pluginService = pluginService;
    }

    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearPlugin(@RequestBody Plugins plugins){
        pluginService.crearPlugin(plugins);
    }

    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Plugins> listarPlugins(){
        return pluginService.listarPlugins();
    }

    @GetMapping(value = "listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Plugins> listarPorId(@PathVariable Long id){
        return pluginService.buscarPorId(id);
    }

    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarPlugin(@RequestBody Plugins plugins){
        pluginService.actualizarPlugin(plugins);
    }

    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarPlugin(@PathVariable Long id){
        pluginService.eliminarPluginPorId(id);
    }

    @GetMapping(value = "ListarNombre{nombre}", headers = "Accept=application/json")
    public List<Plugins> listarPorNombre(@PathVariable String nombre){
        return pluginService.buscarPorNombre(nombre);
    }

    @GetMapping(value = "ListarFabricante{fabricante}", headers = "Accept=application/json")
    public List<Plugins> listarPorFabricante(@PathVariable String fabricante){
        return pluginService.buscarPorFabricante(fabricante);
    }

    @GetMapping(value = "ListarCosto{costo}", headers = "Accept=application/json")
    public List<Plugins> listarPorCosto(@PathVariable Long costo){
        return pluginService.buscarPorCosto(costo);
    }

    @GetMapping(value = "ListarEfecto{efecto}", headers = "Accept=application/json")
    public List<Plugins> listarPorEfecto(@PathVariable String efecto){
        return pluginService.buscarPorEfecto(efecto);
    }
}
