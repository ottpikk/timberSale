package persistence;

import model.Supplier;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositorySupplier {

    private EntityManager em;

    public RepositorySupplier(){
        em = DBUtil.getEntityManager();
    }

    public void addSupplier(Supplier supplier){
        try {
            this.em.getTransaction().begin();
            this.em.persist(supplier);
            this.em.getTransaction().commit();
            System.out.println("New supplier added:\n\t"+supplier.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
