package com.app.mn.repository;

import com.app.mn.model.EmlpoyeeProfile;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class EmlpoyeeProfileRepository extends SimpleJpaRepository<EmlpoyeeProfile, String> {
    private final EntityManager em;
    public EmlpoyeeProfileRepository(EntityManager em) {
        super(EmlpoyeeProfile.class, em);
        this.em = em;
    }
    @Override
    public List<EmlpoyeeProfile> findAll() {
        return em.createNativeQuery("Select * from \"mn_103\".\"EmlpoyeeProfile\"", EmlpoyeeProfile.class).getResultList();
    }
}