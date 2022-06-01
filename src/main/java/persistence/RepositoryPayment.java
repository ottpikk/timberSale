package persistence;

import model.Payment;
import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryPayment {

    private EntityManager em;

    public RepositoryPayment(){
        em = DBUtil.getEntityManager();
    }

    public void addPayment(Payment payment){
        try {
            this.em.getTransaction().begin();
            this.em.persist(payment);
            this.em.getTransaction().commit();
            System.out.println("New payment added:\n\t"+payment.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
