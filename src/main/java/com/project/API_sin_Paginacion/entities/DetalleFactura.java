package com.project.API_sin_Paginacion.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "detalle pedido")
public class DetalleFactura extends  Base{
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private double subTotal;


    //relacion con articulo insumo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    //relacion con articulo manufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;
}
