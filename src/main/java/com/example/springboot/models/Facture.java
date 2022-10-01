package com.example.springboot.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.Date;
import java.util.Set;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Table( name = "Facture")
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFacture")

    private Long idFacture;
    @Column(name="montantRemise")
    private float montantRemise;
    @Column(name="montantFacture")
    private float montantFacture;
    @Column(name="dateCreationFacture")
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Column(name="dateDerniereModification")
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @Column(name="archivee")
    private boolean archivee;
    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglement;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
    @ManyToOne
    private Fournisseur fournisseur;




    public Facture(float montantRemise, float montantFacture) {
        this.montantRemise = montantRemise;
        this.montantFacture = montantFacture;
    }
}
