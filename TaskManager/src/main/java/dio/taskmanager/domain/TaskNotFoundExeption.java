package dio.taskmanager.domain;

public class TaskNotFoundExeption extends RuntimeException {
    public TaskNotFoundExeption(TaskId id) {
        super("Task with id " + id + " not found");
    }
}
