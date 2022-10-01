package com.example.springboot.models;

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
@Table(name = "Fournisseur")

public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFournisseur")
    private Long idFournisseur;
    @Column(name="codeFournisseur")
    private String codeFournisseur;
    @Column(name="libelleFournisseur")
    private String libelleFournisseur;
    @Column(name="categorieFournisseur")
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;
    @ManyToMany
    private Set<SecteurActivite> secteurActivites;
    @OneToOne
    private DetailFournisseur detailFournisseur;
}
