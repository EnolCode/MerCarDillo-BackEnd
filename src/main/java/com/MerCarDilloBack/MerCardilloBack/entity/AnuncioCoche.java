package com.MerCarDilloBack.MerCardilloBack.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="anuncios_coche")
public class AnuncioCoche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 50, nullable = true)
    private String nombre_cliente;

    @Column(length = 50, nullable = false)
    private String tipo;

    @Column(length = 50, nullable = false)
    private String marca;

    @Column(length = 50, nullable = true)
    private Integer autonomia;
    
    @Column(length = 50, nullable = true)
    private Integer asientos;

    @Column(length = 50, nullable = true)
    private Integer precio;

    @Column(length = 50, nullable = true)
    private String comunidad_autonoma;

}
