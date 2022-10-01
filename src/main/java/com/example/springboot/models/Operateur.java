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
@Table(name = "Operateur")
public class Operateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idperateur")

    private Long idperateur ;
    @Column(name="nom ")
    private String nom ;
    @Column(name="prenom")

    private String prenom ;
    @Column(name="password")
    private String password;
    @OneToMany
    private Set<Facture> factures;
}
