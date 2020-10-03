package ru.java.practice.todolist.Repositories;

import org.springframework.stereotype.Component;
import ru.java.practice.todolist.Entities.TodoItem;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TodoItemRepository {
    List<TodoItem> todoItems;

    public List<TodoItem> getTodoItems() {
        return this.todoItems;
    }

    @PostConstruct
    public void init() {
        todoItems = new ArrayList<>();
        todoItems.add(new TodoItem(1L, "test_1", "test for todo 1", 1L, false));
        todoItems.add(new TodoItem(2L, "test_2", "test for todo 2", 2L, true));
        todoItems.add(new TodoItem(3L, "test_3", "test for todo 3", 2L, false));
    }

    public List<TodoItem> getTodoItemsByUserId(Long userId) {
        return this.todoItems.stream().filter(item -> item.getUser_id() == userId)
                .collect(Collectors.toList());
    }
}
