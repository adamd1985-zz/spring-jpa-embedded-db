package springjpa.embeddeddb.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springjpa.embeddeddb.model.Task;
import springjpa.embeddeddb.repository.TaskRepository;

@Service @Transactional
public class TaskServiceImpl implements TaskService {

    @Inject
    private TaskRepository taskDAO;

    @Transactional(readOnly = true)
    public Task findTaskByPk(Long pk) {
        return taskDAO.findOne(pk);
    }

    public void doTask(Task task) {
        task.doIt();
        taskDAO.save(task);
    }

    public void insertTask(Task task) {
        taskDAO.save(task);
    }
}
