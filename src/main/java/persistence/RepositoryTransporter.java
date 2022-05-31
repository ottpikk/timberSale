package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryTransporter {

    private EntityManager em;

    public RepositoryTransporter(){
        em = DBUtil.getEntityManager();
    }
}
