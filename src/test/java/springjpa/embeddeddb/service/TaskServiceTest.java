package springjpa.embeddeddb.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springjpa.embeddeddb.model.Task;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/META-INF/spring/applicationContext.xml"})
public class TaskServiceTest {

    @Inject private TaskService taskService;

    @Test 
    public void aNewTaskShouldBeIserted() {
        Task task = Task.createTask("Task: test Task!");
        taskService.insertTask(task);

        assertThat(task.getId(), notNullValue());
        Task sameTask = taskService.findTaskByPk(task.getId());

        assertThat(task.getId(), is(sameTask.getId()));
        assertThat(task.getDescription(), is(sameTask.getDescription()));
    }

    @Test 
    public void aTaskShouldBeDone() {
        Task task = Task.createTask("a task that should be done!!");
        taskService.insertTask(task);

        taskService.doTask(task);

        assertThat(task.isDone(), is(true));

        Task sameTask = taskService.findTaskByPk(task.getId());

        assertThat(sameTask.isDone(), is(true));
    }
}
