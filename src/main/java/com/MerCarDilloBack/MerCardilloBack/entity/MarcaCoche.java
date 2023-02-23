package com.MerCarDilloBack.MerCardilloBack.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="marcas")
public class MarcaCoche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_marca")
    private Long idMarca;

    @Column()
    private String marca;

    public MarcaCoche() {
    }

    public MarcaCoche(String marca) {
        this.marca = marca;
    }

}
