package com.example.springboot.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

@Table(name = "CategorieProduit")

public class CategorieProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCategorie")
    private Long idCategorie ;
    @Column(name="codeProduit")
    private String codeProduit;
    @Column(name="libelleCategorieProduit")
    private String libelleCategorieProduit;
    @OneToMany(mappedBy = "categorieProduit")
    @JsonIgnore
    private Set<Produit> produits;
}
