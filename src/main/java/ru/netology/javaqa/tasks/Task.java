package ru.netology.javaqa.tasks;

import java.util.Objects;

public class Task {
    protected static int id;

    public Task(int id) {
        this.id = id;
    }

    public static int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean matches(String query) {
        return false;
    }
}
