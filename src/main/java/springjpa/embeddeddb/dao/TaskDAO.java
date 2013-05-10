package springjpa.embeddeddb.dao;

import springjpa.embeddeddb.model.Task;

public interface TaskDAO {
    Task findByPk(Long pk);
    void insert(Task task);
    void merge(Task task);
}
