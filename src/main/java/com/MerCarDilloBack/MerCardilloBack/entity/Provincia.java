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
@Table(name="provincias")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_provincia")
    private Long id;

    @Column()
    private String provincia;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
    private List<AnuncioCoche> anunciosCoches;
}
