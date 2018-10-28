package com.alimuzaffar.testproject.ui.main;

import android.os.Bundle;

import com.alimuzaffar.testproject.R;
import com.alimuzaffar.testproject.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainViewModel viewModel = ViewModelProviders.of(this).get(mainViewModel.class);
        viewModel.init();

        RecyclerView recyclerView = findViewById(R.id.requestList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        requestListAdapter listAdapter = new requestListAdapter(this,viewModel.requestDTO,viewModel.reasonsList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(listAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
    }
}
