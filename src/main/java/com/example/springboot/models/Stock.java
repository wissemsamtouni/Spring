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
@Table( name = "Stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idStock")

    private Long idStock ;
    @Column(name="qte")
    private int qte;
    @Column(name="qteMin")
    private int qteMin ;
    @Column(name="libelleStock")
    private String libelleStock ;
    @OneToMany(mappedBy = "stock")
    @JsonIgnore
    private Set<Produit> produits;


}
