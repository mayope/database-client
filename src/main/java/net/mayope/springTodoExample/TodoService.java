package net.mayope.springTodoExample;

import java.util.List;
import java.util.UUID;

@org.springframework.stereotype.Service
public class TodoService {

    private final TodoRepo todoRepo;

    TodoService(
            final TodoRepo todoRepo
    ) {
        this.todoRepo = todoRepo;
    }

    public List<TodoEntry> get() {
        return todoRepo.findAll();
    }

    public void add(String todo) {
        final var entry = new TodoEntry();
        entry.setTitle(todo);
        todoRepo.save(entry);
    }

    public void delete(UUID id) {
        todoRepo.deleteById(id);
    }
}
