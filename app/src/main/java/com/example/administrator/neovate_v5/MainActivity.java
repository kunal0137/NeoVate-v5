package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.ArrayList;
//Array of options -> array adapter->ListView
//list views {views:patient.xml}


public class MainActivity extends Activity {

    ListView listView1;

    //ListView listView;
    InfantAdapter adapter;
    //ArrayAdapter<String> adapter;

    @Override
    //sets up the listview
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Infant> screenlist = InfantList.getList();
//        ArrayList<String> ar = new ArrayList<String>();
//        String s1 ="Infant A";
//        String s2 ="Infant B";
//        String s3 ="Infant C";
//        ar.add(s1);
//        ar.add(s2);
//        ar.add(s3)
        InfantAdapter adapter = new InfantAdapter(this, screenlist);

      //  listView = (ListView) findViewById(android.R.id.list);
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        View header = (View)getLayoutInflater().inflate(R.layout.custom_infant, null);
        listView1.setAdapter(adapter);



    }
//allows for interactions with different activities
    public void interact(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Add Infant")) {
            Intent intent = new Intent(this, InfantAdd.class);
            startActivity(intent);
        }
        else if (button_text.equals("Infant History")) {
            Intent intent = new Intent(this, InfantHistory.class);
            startActivity(intent);
        }
    }

}






