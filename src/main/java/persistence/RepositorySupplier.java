package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositorySupplier {

    private EntityManager em;

    public RepositorySupplier(){
        em = DBUtil.getEntityManager();
    }
}
