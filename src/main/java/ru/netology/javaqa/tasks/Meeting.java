package ru.netology.javaqa.tasks;

public class Meeting extends Task {

    protected static String topic;
    protected static String project;
    protected static String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public static String getTopic() {
        return topic;
    }

    public static String getProject() {
        return project;
    }

    public static String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
