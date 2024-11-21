package api.gonzalo.musica.demo.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Plugins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plugin")
    private Long idPlugin;
    private String nombre;
    private String fabricante;
    private Long costo;
    private String descripcion;
    //private String img;
}
