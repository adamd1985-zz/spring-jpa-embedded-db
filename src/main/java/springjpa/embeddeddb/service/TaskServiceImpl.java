package springjpa.embeddeddb.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springjpa.embeddeddb.dao.TaskDAO;
import springjpa.embeddeddb.model.Task;

@Service @Transactional
public class TaskServiceImpl implements TaskService {

    @Inject
    private TaskDAO taskDAO;

    @Transactional(readOnly = true)
    public Task findTaskByPk(Long pk) {
        return taskDAO.findByPk(pk);
    }

    public void doTask(Task task) {
        task.doIt();
        taskDAO.merge(task);
    }

    public void insertTask(Task task) {
        taskDAO.insert(task);
    }
}
