package com.reponsitory;

import com.model.Commentator;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class CommentatorImpl implements CommentatorInF {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Commentator> findAll() {
        TypedQuery<Commentator> query = em.createQuery("select c from Commentator c", Commentator.class);
        return query.getResultList();
    }

    @Override
    public Commentator findById(int id) {
        TypedQuery<Commentator> query = em.createQuery("select c from Commentator c where  c.id=:id", Commentator.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Commentator model) {
        if (model.getId() != 0) {
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(int id) {
        Commentator commentator = findById(id);
        if (commentator != null) {
            em.remove(commentator);
        }
    }
}
