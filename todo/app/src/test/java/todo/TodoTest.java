package todo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
    @Test
    public void shoulStartWithEmptyList() {
        Todo todo = new Todo();
        assertTrue("Initial task list is empty", todo.tasks.isEmpty() );
    }

    @Test
    public void shouldAddTask() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("Buy coffee");

        assertEquals("Should reflect new task added", expectedList, todo.addTask("Buy Coffee"));
    }
}
