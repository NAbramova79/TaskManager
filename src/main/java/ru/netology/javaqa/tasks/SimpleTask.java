package ru.netology.javaqa.tasks;

public class SimpleTask extends Task {
    protected static String title;

    public SimpleTask(int id, String title) {
        super(id);
        SimpleTask.title = title;
    }

    public static String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}
