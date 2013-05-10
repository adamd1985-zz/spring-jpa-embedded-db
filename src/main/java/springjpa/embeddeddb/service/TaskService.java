package springjpa.embeddeddb.service;

import springjpa.embeddeddb.model.Task;

public interface TaskService {
    Task findTaskByPk(Long pk);
    void doTask(Task task);
    void insertTask(Task task);
}
