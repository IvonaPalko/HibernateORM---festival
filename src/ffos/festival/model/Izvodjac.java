/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ivona
 */
@Entity
@Table
public class Izvodjac {
    @Id
    @GeneratedValue
    private Long id;
    private String ime;
    private String prezime;
    @ManyToOne
    private Funkcija funkcija;
    @ManyToMany
    private Set<Koncert> koncert;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Funkcija getFunkcija() {
        return funkcija;
    }

    public void setFunkcija(Funkcija funkcija) {
        this.funkcija = funkcija;
    }

    public Set<Koncert> getKoncert() {
        return koncert;
    }

    public void setKoncert(Set<Koncert> koncert) {
        this.koncert = koncert;
    }
    
    @Override
    public String toString() {
        return ime + " " + prezime + " " + funkcija;
    }
}
