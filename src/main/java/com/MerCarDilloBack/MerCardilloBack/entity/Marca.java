package com.MerCarDilloBack.MerCardilloBack.entity;

import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_marca")
    private Long id;

    @Column()
    private String marca;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<AnuncioCoche> anunciosCoches;
}
