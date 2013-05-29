package springjpa.embeddeddb.repository;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import springjpa.embeddeddb.model.Task;

public interface TaskRepository extends Repository<Task, Long> {
    Task findOne(Long pk);
    
    @Transactional
    void save(Task task);
}
