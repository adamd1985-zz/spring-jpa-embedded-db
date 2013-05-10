package springjpa.embeddeddb.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import springjpa.embeddeddb.model.Task;

@Component
public class TaskDAOImpl implements TaskDAO {
    @PersistenceContext private EntityManager entityManager;

    public Task findByPk(Long pk) {
        return entityManager.find(Task.class, pk);
    }

    public void insert(Task task) {
        entityManager.persist(task);
    }

    public void merge(Task task) {
        entityManager.merge(task);
    }
}
