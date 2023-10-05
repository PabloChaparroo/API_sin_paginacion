package com.project.API_sin_Paginacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "artículo manufacturado")
public class ArticuloManufacturado extends Base{
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo estimado cocina")
    private double tiempoEstimadoCocina;
    @Column(name = "costo")
    private double costo;
    @Column(name = "precio venta")
    private double precioVenta;
    @Column(name = "url imagen")
    private String urlImagen;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;
}
