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

    public void addEmployee(Employee employee){
        try {
            this.em.getTransaction().begin();
            this.em.persist(employee);
            this.em.getTransaction().commit();
            System.out.println("New employee added:\n\t"+employee.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
