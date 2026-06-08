package dio.taskmanager.application;

import dio.taskmanager.application.output.TaskOutput;
import dio.taskmanager.domain.TaskId;
import dio.taskmanager.domain.TaskNotFoundExeption;
import dio.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class GetTAskByIDUseCase {
    private final TaskRepository repository;

    public GetTAskByIDUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id) {
        return repository
                .findById(id)
                .map(TaskOutput::from)
                .orElseThrow(() -> new TaskNotFoundExeption(id));
    }
}
