package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryMaterial {

    private EntityManager em;

    public RepositoryMaterial(){
        em = DBUtil.getEntityManager();
    }
}
