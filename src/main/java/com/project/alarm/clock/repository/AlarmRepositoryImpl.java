package com.project.alarm.clock.repository;

import com.project.alarm.clock.model.Alarm;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AlarmRepositoryImpl implements JpaRepository<Alarm, Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public AlarmRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Alarm> findAll() {
        return entityManager.createQuery("SELECT a FROM Alarm a", Alarm.class).getResultList();
    }

    @Override
    public Alarm findById(Long id) {
        return entityManager.find(Alarm.class, id);
    }

    @Override
    public void save(Alarm alarm) {
        entityManager.merge(alarm);
    }

    @Override
    public void deleteById(Long id) {
        Alarm alarm = findById(id);
        entityManager.remove(alarm);
    }
}
