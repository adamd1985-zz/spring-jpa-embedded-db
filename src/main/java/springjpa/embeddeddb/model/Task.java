package springjpa.embeddeddb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(length = 200)
    private String description;

    @NotNull
    private Boolean done = Boolean.FALSE;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return Boolean.TRUE.equals(this.done);
    }

    public void doIt() {
        this.done = true;
    }
    
    public static Task createTask(String description) {
        Task task = new Task();
        task.setDescription(description);
        return task;
    }
}
