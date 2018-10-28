package com.alimuzaffar.testproject.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.alimuzaffar.testproject.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class requestListAdapter extends RecyclerView.Adapter<requestListAdapter.RequestListVH> {

    Context context;
    RequestDTO requestDTO;
    List<String> reasonsList;

    public requestListAdapter(Context context, RequestDTO requestDTO, List<String> reasonsList) {
        this.context = context;
        this.requestDTO = requestDTO;
        this.reasonsList = reasonsList;
    }

    public static class RequestListVH extends RecyclerView.ViewHolder{

        CheckBox selectReason;
        TextView reason;
        View breakLine;

        public RequestListVH(@NonNull View itemView) {
            super(itemView);
            selectReason = itemView.findViewById(R.id.selectCheckBox);
            reason = itemView.findViewById(R.id.requestDescription);
        }
    }

    @NonNull
    @Override
    public RequestListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.request_list_item,parent,false);
        return new RequestListVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestListVH holder, final int position) {
        holder.reason.setText(reasonsList.get(position));
        holder.selectReason.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    requestDTO.getReasons().add(reasonsList.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return reasonsList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}


