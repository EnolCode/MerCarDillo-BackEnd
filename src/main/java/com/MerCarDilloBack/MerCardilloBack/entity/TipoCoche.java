package com.MerCarDilloBack.MerCardilloBack.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tipos")
public class TipoCoche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_tipo")
    private Long idTipo;

    @Column()
    private String tipo;

    public TipoCoche() {
    }

    public TipoCoche(String tipo) {
        this.tipo = tipo;
    }

}
