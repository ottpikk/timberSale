package persistence;


import model.Employee;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryEmployee {

    private EntityManager em;

    public RepositoryEmployee(){
        em = DBUtil.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> listAllEmployees() {
        return em.createQuery("Select e from Employee as e order by e.employeeId asc")
                .getResultList();
    }
}
