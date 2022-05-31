package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryPayment {

    private EntityManager em;

    public RepositoryPayment(){
        em = DBUtil.getEntityManager();
    }
}
