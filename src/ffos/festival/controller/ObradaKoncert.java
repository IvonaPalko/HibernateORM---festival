/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.controller;

import ffos.festival.model.Koncert;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Ivona
 */
public class ObradaKoncert extends Obrada {
    
        public ObradaKoncert(){
        super();
    }
    
        public List<Koncert> getKoncert(){
        Query q = session.createQuery("From Koncert ");
        return q.list();
    }
         
        public Koncert dodaj (Koncert k){
        
        session.beginTransaction();
        session.saveOrUpdate(k);
        session.getTransaction().commit();

        return k;
    }
    
    public void obrisi(Koncert k){
        session.beginTransaction();
        session.delete(k);
        session.getTransaction().commit();
    }
}
