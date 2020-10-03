package ru.java.practice.todolist.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.java.practice.todolist.Entities.TodoItem;
import ru.java.practice.todolist.Repositories.TodoItemRepository;

import java.util.List;

@Service
public class TodoItemService {

    private TodoItemRepository todoItemRepository;

    @Autowired
    public void setTodoItemRepository(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> getAllToDoTasks() {
        return todoItemRepository.getTodoItems();
    }

    public List<TodoItem> getUserTasks(Long userId) {
        return todoItemRepository.getTodoItemsByUserId(userId);
    }
}
