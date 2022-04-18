package com.example.a109590041_hw7_4_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.a109590041_hw7_4_5.databinding.ActivityMainBinding;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private final LinkedList<String> mWordList = new LinkedList<>(), mDetail = new LinkedList<>();
    private final LinkedList<Intent> mact = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        for (int i = 0; i < 4; i++) {
            mWordList.addLast("Recipe " + i);
            mDetail.addLast("Detail" + i);
        }
        mact.addLast(new Intent(MainActivity.this, MainActivity2.class));
        mact.addLast(new Intent(MainActivity.this, MainActivity3.class));
        mact.addLast(new Intent(MainActivity.this, MainActivity4.class));
        mact.addLast(new Intent(MainActivity.this, MainActivity5.class));
        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerView);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MyAdapter(this, mWordList, mDetail, mact);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}