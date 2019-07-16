package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvColour;
    ArrayList<Box> alBoxList;
    CustomAdapter caColours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewColours);
        alBoxList = new ArrayList<>();

        Box colour1 = new Box("Blue");
        alBoxList.add(colour1);

        Box colour2 = new Box("Orange");
        alBoxList.add(colour2);

        Box colour3 = new Box("Brown");
        alBoxList.add(colour3);

        caColours = new CustomAdapter(this, R.layout.row, alBoxList);
        lvColour.setAdapter(caColours);
    }
}
