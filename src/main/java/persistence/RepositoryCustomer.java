package persistence;

import model.Customer;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryCustomer {

    private EntityManager em;

    public RepositoryCustomer(){
        em = DBUtil.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Customer> listAllCustomers() {
        return em.createQuery("Select f from Customer as f order by f.customerId asc")
                .getResultList();
    }

    public void addCustomer(Customer customer){
        try {
            this.em.getTransaction().begin();
            this.em.persist(customer);
            this.em.getTransaction().commit();
            System.out.println("New customer added:\n\t"+customer.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
