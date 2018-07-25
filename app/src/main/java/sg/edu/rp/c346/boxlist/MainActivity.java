package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoBox> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewBoxes);

        alToDoList = new ArrayList<>();
        ToDoBox item1 = new ToDoBox("blue");
        ToDoBox item2 = new ToDoBox("orange");
        ToDoBox item3 = new ToDoBox("brown");
        alToDoList.add(item1);
        alToDoList.add(item2);
        alToDoList.add(item3);

        caToDo = new CustomAdapter(this, R.layout.boxitem, alToDoList);

        lvToDo.setAdapter(caToDo);
    }
}
