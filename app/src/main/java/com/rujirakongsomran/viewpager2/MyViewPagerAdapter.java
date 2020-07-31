package com.rujirakongsomran.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewPagerAdapter extends RecyclerView.Adapter<MyViewPagerAdapter.MyViewHolder> {

    Context context;

    public MyViewPagerAdapter(Context context) {
        this.context = context;
    }

    // We will declare and 2x4 matrix contain color and icon
    int[][] color_icon_matrix = new int[][]{
            // Color, Icon
            {R.color.color_one, R.drawable.ic_baseline_account_circle_24},
            {R.color.color_two, R.drawable.ic_baseline_attach_money_24},
            {R.color.color_three, R.drawable.ic_baseline_directions_car_24},
            {R.color.color_four, R.drawable.ic_baseline_location_on_24},
            // Okay, you can see, column 0 is color, column 1 is icon

    };

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_page, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ivImage.setImageResource(color_icon_matrix[position][1]); // Roq we will take by position, but column is 1 for icon
        holder.container.setBackgroundResource(color_icon_matrix[position][0]);

    }

    @Override
    public int getItemCount() {
        return color_icon_matrix.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImage;
        RelativeLayout container;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
            container = (RelativeLayout) itemView.findViewById(R.id.container);
        }
    }
}
