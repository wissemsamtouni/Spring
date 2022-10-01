package com.example.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
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
@Table(name = "Produit")

public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduit")
    private Long idProduit;
    @Column(name="codeProduit")
    private String codeProduit;
    @Column(name="libelleProduit")
    private String libelleProduit;
    @Column(name=" prix")
    private float prix;
    @Column(name="dateCreation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation ;
    @Column(name="dateDernierModification")
    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;
    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;
    @ManyToOne
    private CategorieProduit categorieProduit;
    @ManyToOne
    private Stock stock;

}
