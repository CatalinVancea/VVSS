package tasks.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskListTest {


    ArrayTaskList list;
    @BeforeEach
    void setUp() {
        list = new ArrayTaskList();
        list.add(new Task("t1",new Date(System.currentTimeMillis())));
        list.add(new Task("t2",new Date(System.currentTimeMillis())));
        list.add(new Task("t3",new Date(System.currentTimeMillis())));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenTaskIsNotNull_ItShouldBeAdded(){
        //arrange
        int size = list.size()+1;
        Task task = new Task("t4",new Date(System.currentTimeMillis()));

        //act
        list.add(task);

        //assert
        assertEquals(size,list.size());
        assertNotNull(list.getTask(size-1));

    }

    @Test
    void whenTaskIsInTheList_ItShouldBeRemoved(){
        //arrange
        int size = list.size()-1;
        Task task = list.getTask(size);

        //act
        list.remove(task);

        //assert
        assertEquals(size,list.size());
    }

    @Test
    void _ItShouldReturnAllTasks(){
        //arrange

        //act
        List result = list.getAll();

        //assert
        assertEquals(list.size(),result.size());
    }
}