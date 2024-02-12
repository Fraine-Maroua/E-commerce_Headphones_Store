package ma.projet.headphones.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ma.projet.headphones.Domain.Popular;
import ma.projet.headphones.R;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    Context context;
    ArrayList<Popular> Popular;
    public PopularAdapter(Context context, ArrayList<Popular> popular) {
        this.context = context;
        this.Popular = popular;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_popular,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.popularName.setText(Popular.get(position).getTitle());
        holder.popularName2.setText(Popular.get(position).getTitle2());
        holder.popularPic.setImageResource(Popular.get(position).getPic());

    }

    @Override
    public int getItemCount() {return Popular.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView popularName;
        TextView popularName2;
        ImageView popularPic;
        ConstraintLayout mainLayout2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            popularName=itemView.findViewById(R.id.name1);
            popularName2=itemView.findViewById(R.id.name2);
            popularPic=itemView.findViewById(R.id.imageView2);
            mainLayout2=itemView.findViewById(R.id.mainLayout2);
        }
    }
}