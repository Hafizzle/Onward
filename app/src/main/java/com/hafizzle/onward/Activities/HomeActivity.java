package com.hafizzle.onward.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hafizzle.onward.Adapters.ActionPlanAdapter;
import com.hafizzle.onward.Objects.ActionPlan;
import com.hafizzle.onward.Objects.SprintPlan;
import com.hafizzle.onward.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<ActionPlan> actionPlans = new ArrayList<>();

        actionPlans.add(new SprintPlan("Draw", 5, true, 7, "fiz", "elon"));

        ActionPlanAdapter actionPlanAdapter = new ActionPlanAdapter(actionPlans, this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setAdapter(actionPlanAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
