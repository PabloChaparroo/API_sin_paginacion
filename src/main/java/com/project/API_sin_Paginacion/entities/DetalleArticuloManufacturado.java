package com.project.API_sin_Paginacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "detalle artículo manufacturado")
public class DetalleArticuloManufacturado extends Base{

    @Column(name = "cantidad")
    private double cantidad;




    //Relacion con Articulo Insumo
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinTable(
            name = "detalleArticulo Manufacturado_articuloInsumo",
            joinColumns = @JoinColumn(name = "fk_detalleArticuloManufacturado"))

    private List<ArticuloInsumo> articuloInsumos = new ArrayList<ArticuloInsumo>();


    //Relacion con articulo manufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_detalleArticuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;

}
