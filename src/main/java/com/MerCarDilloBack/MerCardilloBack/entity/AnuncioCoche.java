package com.MerCarDilloBack.MerCardilloBack.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="anunciosCoches")
public class AnuncioCoche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public AnuncioCoche(String nombre) {
        this.nombre_cliente = nombre;
    }

    @Column(length = 50, nullable = true)
    private String nombre_cliente;


    @Column(length = 50, nullable = true)
    private Integer autonomia;
    
    @Column(length = 50, nullable = true)
    private Integer asientos;

    @Column(length = 50, nullable = true)
    private Integer precio;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_id", nullable= true)
    TipoCoche tipo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provincia_id", nullable= true)
    Provincia provincia;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marca_id", nullable= true)
    MarcaCoche marca;
}
