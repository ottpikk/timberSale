package persistence;

import model.Order;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryOrder {

    private EntityManager em;

    public RepositoryOrder(){
        em = DBUtil.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Order> listAllOrders() {
        return em.createQuery("Select f from Order as f order by f.orderId asc")
                .getResultList();
    }
}
