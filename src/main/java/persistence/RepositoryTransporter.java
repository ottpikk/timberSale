package persistence;


import model.Transporter;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryTransporter {

    private EntityManager em;

    public RepositoryTransporter(){
        em = DBUtil.getEntityManager();
    }

    public void addTransporter(Transporter transporter){
        try {
            this.em.getTransaction().begin();
            this.em.persist(transporter);
            this.em.getTransaction().commit();
            System.out.println("New transporter added:\n\t"+transporter.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
