package com.example.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Table(name = "DetailFacture")

public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailFacture")

    private Long idDetailFacture ;
    @Column(name="qteCommande")
    private int qteCommande ;
    @Column(name="prixTotalDetail")
    private float prixTotalDetail ;
    @Column(name="purcentageRemise")
    private int  purcentageRemise ;
    @Column(name="montantRemise")
    private float montantRemise ;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;


}
