/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.controller;

import ffos.festival.model.Funkcija;
import ffos.festival.model.Izvodjac;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Ivona
 */
public class ObradaFunkcija extends Obrada {
    
        public ObradaFunkcija(){
        super();
    }
    
        public List<Funkcija> getFunkcijas(){
        Query q = session.createQuery("From Funkcija ");
        return q.list();
    }
         
        public Funkcija dodaj (Funkcija f){
        
        session.beginTransaction();
        session.saveOrUpdate(f);
        session.getTransaction().commit();

        return f;
    }
    
    public void obrisi(Funkcija f){
        session.beginTransaction();
        session.delete(f);
        session.getTransaction().commit();
    }
}
