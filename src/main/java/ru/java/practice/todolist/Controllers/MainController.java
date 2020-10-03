package ru.java.practice.todolist.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.java.practice.todolist.Entities.TodoItem;
import ru.java.practice.todolist.Services.TodoItemService;

import java.util.List;


@RestController
public class MainController {

    private TodoItemService todoItemService;

    @Autowired
    public void setTodoItemService(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/")
    public List<TodoItem> indexPage() {
        return todoItemService.getAllToDoTasks();
    }

    @GetMapping("/{id}")
    public List<TodoItem> getUserToDoTasks(@PathVariable(name="id") Long userId) {
        return todoItemService.getUserTasks(userId);
    }
}
