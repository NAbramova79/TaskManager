package ru.netology.javaqa.tasks;

public class Epic extends Task {
    protected static String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        Epic.subtasks = subtasks;
    }

    public static String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.matches(query)) {
                return true;
            }
        }
        return false;
    }
}