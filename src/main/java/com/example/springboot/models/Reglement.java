package com.example.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Table( name = "Reglement")
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReglement")
    private int idReglement ;
    @Column(name="montantPaye")
    private float montantPaye ;
    @Column(name="monatantRestant")
    private float monatantRestant;
    @Column(name="payee")
    private boolean payee;
    @Column(name="dateReglement")
    @Temporal(TemporalType.DATE)

    private Date dateReglement;
    @ManyToOne
    private Facture facture;


}

