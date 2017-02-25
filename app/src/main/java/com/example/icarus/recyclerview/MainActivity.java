package com.example.icarus.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    RecyclerView mRecyclerView;
    List<Student> data = new ArrayList<Student>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager manger = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manger);
        MyAdapter mMyAdapter = new MyAdapter(data);
        mRecyclerView.setAdapter(mMyAdapter);
    }

    private void initData() {

        data.add(new Student("001","zhangsan1","16"));
        data.add(new Student("002","zhangsan2","17"));
        data.add(new Student("003","zhangsan3","18"));
        data.add(new Student("004","zhangsan4","19"));
        data.add(new Student("005","zhangsan5","18"));
        data.add(new Student("006","zhangsan6","20"));

    }
}
