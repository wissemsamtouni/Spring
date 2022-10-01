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
@Table( name = "SecteurActivite")

public class SecteurActivite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSecteurActivite")
  private Long idSecteurActivite ;
    @Column(name="codeSecteurActivite")
    private String codeSecteurActivite ;
    @Column(name="libelleSecteurActivite")
    private String libelleSecteurActivite ;
    @ManyToMany(mappedBy = "secteurActivites")
    private Set<Fournisseur> fournisseurs;
}
