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
    ArrayList<TraiCay> arrayList;
    TraiCayAdapter traiCayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        traiCayAdapter = new TraiCayAdapter(this,R.layout.dong_trai_cay,arrayList);
        l.setAdapter(traiCayAdapter);

    }

    public  void  AnhXa(){
        l=(ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<>();

        arrayList.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",0));
        arrayList.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",0));
        arrayList.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",0));
        arrayList.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",0));
        arrayList.add(new TraiCay("Dâu Tây","Dâu Tây Đà Lạt",0));
    }
}
