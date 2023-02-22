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
@Table(name="tipos")
public class TipoCoche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_tipo")
    private Long id;

    @Column()
    private String tipo;

    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
    private List<AnuncioCoche> anunciosCoches;
}
