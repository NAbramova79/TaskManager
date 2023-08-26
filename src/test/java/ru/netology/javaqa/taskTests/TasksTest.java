package ru.netology.javaqa.taskTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.tasks.Epic;
import ru.netology.javaqa.tasks.Meeting;
import ru.netology.javaqa.tasks.SimpleTask;
import ru.netology.javaqa.tasks.Task;

import ru.netology.javaqa.tasks.Task.*;

public class TasksTest {
    @Test
    public void shouldMatchSimpleTaskQueryWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMatchSimpleTaskQueryWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("передать");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchEpicQueryWhenTrue() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMatchEpicQueryWhenFalse() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("картошка");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingTopicQueryWhenTrue() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("версии");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingProjectQueryWhenTrue() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMatchMeetingQueryWhenFalse() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("запуск");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetId() {
        Task task = new Task(22);

        int expected = 22;
        int actual = task.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTitleForSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSubtasksForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetTopicForMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetProjectForMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetStartForMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();

        Assertions.assertEquals(expected, actual);
    }
}
