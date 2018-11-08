/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.controller;

import ffos.festival.model.Izvodjac;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Ivona
 */
public class ObradaIzvodjac extends Obrada {
    
    public ObradaIzvodjac(){
        super();
    }
    
        public List<Izvodjac> getIzvodjacs(){
        Query q = session.createQuery("From Izvodjac ");
        return q.list();
    }
        
        public Izvodjac dodaj (Izvodjac i){
        
        session.beginTransaction();
        session.saveOrUpdate(i);
        session.getTransaction().commit();

        return i;
    }
    
    public void obrisi(Izvodjac i){
        session.beginTransaction();
        session.delete(i);
        session.getTransaction().commit();
    }
}
