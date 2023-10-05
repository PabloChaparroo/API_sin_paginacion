package com.project.API_sin_Paginacion.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name = "usuario")
public class Usuario extends Base {

    @Column(name = "nombre usuario")
    private String nombreUsuario;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "correo electronico")
    private String rol;
    @Column(name = "fecha Alta")
    private Date fechaAlta;
    @Column(name = "fecha modificacion")
    private Date fechaModificacion;
    @Column(name = "fechaBaja")
    private Date fechaBaja;


    //Relacion con DetallePedido
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)    //orphanRemoval sirve para que si eliminamos un pedido tambien se eliminen los pedidosProducto asociados a ese pedido
    @JoinTable(
            name = "factura_detalleFactura",
            joinColumns = @JoinColumn(name = "fk_detalleFactura"))

    private List<DetalleFactura> detalleFacturas = new ArrayList<DetalleFactura>();
}