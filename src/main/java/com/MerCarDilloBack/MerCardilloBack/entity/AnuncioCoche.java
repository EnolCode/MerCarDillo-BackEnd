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
    
    @Column(length = 50, nullable = true)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String tipo;

    @Column(length = 50, nullable = true)
    private Integer autonomia;
    
    @Column(length = 50, nullable = true)
    private Integer asientos;

    @Column(length = 50, nullable = true)
    private Integer precio;

    @Column(length = 50, nullable = true)
    private String comunidad_autonoma;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marca_id", nullable= true)
    Marca marca;
}
