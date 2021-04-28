package com.example.ejercicioroomapirest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UniversidadAdapter extends RecyclerView.Adapter<UniversidadAdapter.ViewHolder> {
        List<Universidad> universidadList;
        Context context;

    public UniversidadAdapter(List<Universidad> universidadList, Context context) {
        this.universidadList = universidadList;
        this.context = context;
        }

    @Override
    public UniversidadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.universidad_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UniversidadAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(universidadList.get(position).getName());
        holder.tvWebPage.setText(universidadList.get(position).getWeb_pages()[0].toString());

        /*holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return universidadList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvWebPage;

        public ViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.tvName);
            this.tvWebPage = (TextView) itemView.findViewById(R.id.tvWebPage);
        }
    }
}
