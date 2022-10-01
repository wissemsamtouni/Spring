package com.example.springboot.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Table( name = "DetailFournisseur")

public class DetailFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailFournisseur")

    private Long idDetailFournisseur;
    @Column(name="dateDebutCollaboration")
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    @Column(name="adresse")
    private String adresse;
    @Column(name="matricule")
    private String matricule;
    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur fournisseur;
}
