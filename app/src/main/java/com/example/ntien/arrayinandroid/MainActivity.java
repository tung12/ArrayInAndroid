package com.example.ntien.arrayinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView l;
    ArrayList<String> arrayList;
    EditText editText;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();
        editText = (EditText) findViewById(R.id.txtInsert);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        arrayList.add("Android");
        arrayList.add("IOS");
        arrayList.add("PHP");
        arrayList.add("Unity");
        arrayList.add("Java");
        arrayList.add("C");

        final ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);

        l.setAdapter(adapter);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,arrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().isEmpty()){
                    arrayList.add(editText.getText().toString());
                    adapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this,"Added", Toast.LENGTH_SHORT);

                }

                else{
                    Toast.makeText(MainActivity.this,"Not Empty", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
