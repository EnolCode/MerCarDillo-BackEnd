package com.MerCarDilloBack.MerCardilloBack.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="provincias")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_provincia")
    private Long idProvincia;

    @Column()
    private String provincia;

    public Provincia() {
    }

    public Provincia(String provincia) {
        this.provincia = provincia;
    }

}
