package com.project.API_sin_Paginacion.entities;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "detallePedido")
public class DetallePedido extends Base {
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "subTotal")
    private double subTotal;
    @Column(name = "subTotal costo")
    private double subTotalCosto;

    //Relacion con ArticuloInsumo
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloInsumo")
    private ArticuloInsumo articuloInsumo;

    //Relacion con ArticuloManufacturado
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_articuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;


}