package com.example.rajnikant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyStateAdapter extends RecyclerView.Adapter<MyStateAdapter.ViewHolder> {

    private List<MyStateData> stateDataList;
    private Context context;

    public MyStateAdapter(Context context, List<MyStateData> stateDataList) {
        this.context = context;
        this.stateDataList = stateDataList;
    }

    public MyStateAdapter(MyStateData[] myStateData, MainActivity3 mainActivity3) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.state_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyStateData myStateDataList = stateDataList.get(position);
        holder.textViewName.setText(myStateDataList.getStateName());
        holder.textViewinfo.setText(myStateDataList.getStateinfo());
        holder.stateImage.setImageResource(myStateDataList.getStateImage());
        holder.stateImage1.setImageResource(myStateDataList.getStateImage1());
        holder.stateImage2.setImageResource(myStateDataList.getStateImage2());
        holder.stateImage3.setImageResource(myStateDataList.getStateImage3());
        holder.stateImage4.setImageResource(myStateDataList.getStateImage4());
        holder.stateImage5.setImageResource(myStateDataList.getStateImage5());
        holder.stateImage6.setImageResource(myStateDataList.getStateImage6());
        holder.stateImage7.setImageResource(myStateDataList.getStateImage7());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myStateDataList.getStateName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return stateDataList.size(); // Change myStateData to stateDataList
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView stateImage,stateImage1,stateImage2,stateImage3,stateImage4,stateImage5,stateImage6,stateImage7;
        TextView textViewName;
        TextView textViewinfo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            stateImage = itemView.findViewById(R.id.imageview);
            stateImage1 = itemView.findViewById(R.id.imageview1);
            stateImage2= itemView.findViewById(R.id.imageview2);
            stateImage3 = itemView.findViewById(R.id.imageview3);
            stateImage4 = itemView.findViewById(R.id.imageview4);
            stateImage5 = itemView.findViewById(R.id.imageview5);
            stateImage6 = itemView.findViewById(R.id.imageview6);
            stateImage7 = itemView.findViewById(R.id.imageview7);
            textViewName = itemView.findViewById(R.id.textName);
            textViewinfo = itemView.findViewById(R.id.textinfo);

        }
    }
}



