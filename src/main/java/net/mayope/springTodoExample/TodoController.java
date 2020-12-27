package net.mayope.springTodoExample;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(final TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoEntry> get() {
        return todoService.get();
    }

    @PostMapping
    public void add(@RequestBody String todo) {

        todoService.add(todo);
    }

    @DeleteMapping("/{id}")
    public void add(@PathVariable(name = "id") UUID id) {
        todoService.delete(id);
    }
}
