package persistence;


import model.Material;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryMaterial {

    private EntityManager em;

    public RepositoryMaterial(){
        em = DBUtil.getEntityManager();
    }

    public void addMaterial(Material material){
        try {
            this.em.getTransaction().begin();
            this.em.persist(material);
            this.em.getTransaction().commit();
            System.out.println("New material added:\n\t"+material.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
