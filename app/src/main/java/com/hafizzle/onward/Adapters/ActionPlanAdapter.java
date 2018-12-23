package com.hafizzle.onward.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.hafizzle.onward.Objects.ActionPlan;
import com.hafizzle.onward.R;

import java.util.ArrayList;
import java.util.List;

public class ActionPlanAdapter extends RecyclerView.Adapter<ActionPlanAdapter.ViewHolder>{

    private static final String TAG = "SprintAdapter";
    List<ActionPlan> actionPlans = new ArrayList<>();
    private Context context;


    public ActionPlanAdapter(ArrayList<ActionPlan> actionPlans, Context context) {
        this.actionPlans = actionPlans;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.sprintImage.setImageDrawable(actionPlans.get(position).getSprintImage());
        holder.sprintName.setText(actionPlans.get(position).getSprintName());
        holder.owner.setText(actionPlans.get(position).getOwner());
        holder.buddyOne.setText(actionPlans.get(position).getBuddyOne());
        holder.buddyTwo.setText(actionPlans.get(position).getBuddyTwo());

    }

    @Override
    public int getItemCount() {
        return sprints.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sprintImage;
        TextView sprintName;
        TextView owner;
        TextView buddyOne;
        TextView buddyTwo;

        public ViewHolder(View itemView) {
            super(itemView);

            sprintImage = itemView.findViewById(R.id.sprintImage);
            sprintName = itemView.findViewById(R.id.sprintName);
            owner = itemView.findViewById(R.id.owner);
            buddyOne = itemView.findViewById(R.id.buddyOne);
            buddyTwo = itemView.findViewById(R.id.buddyTwo);
        }
    }


}