package com.hafizzle.onward.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


    public ActionPlanAdapter(List<ActionPlan> actionPlans, Context context) {
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

        //holder.selectedImage.setImageDrawable(actionPlans.get(position).get()); // ToDo need to generate lots of free to use stock images that people can choose and categorize from.
        holder.planTitle.setText(actionPlans.get(position).getActionName());
        holder.participant1.setText(actionPlans.get(position).getParticipant1());
        holder.participant2.setText(actionPlans.get(position).getParticipant2());


    }

    @Override
    public int getItemCount() {
        return actionPlans.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        //ImageView selectedImage;
        TextView planTitle;
        TextView participant1;
        TextView participant2;

        public ViewHolder(View itemView) {
            super(itemView);

            //selectedImage = itemView.findViewById(R.id.selectedImage);
            planTitle = itemView.findViewById(R.id.planTitle);
            participant1 = itemView.findViewById(R.id.participant1);
            participant2 = itemView.findViewById(R.id.participant2);
        }
    }


}