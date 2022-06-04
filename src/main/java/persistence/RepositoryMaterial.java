package persistence;

import model.Material;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryMaterial {

    private EntityManager em;

    public RepositoryMaterial(){
        em = DBUtil.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Material> listAllMaterials() {
        return em.createQuery("Select e from Material as e order by e.type asc")
                .getResultList();
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

    public Material searchById(int materialId){
        return this.em.find(Material.class, materialId);
    }

    public void updatePriceById(int materialId, double newPrice){
        try {
            this.em.getTransaction().begin();
            String sql = "UPDATE Material SET price =:nPrice WHERE materialId = :id";
            em.createQuery(sql)
                    .setParameter("id", materialId)
                    .setParameter("nPrice", newPrice)
                    .executeUpdate();
            this.em.getTransaction().commit();
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }
}
