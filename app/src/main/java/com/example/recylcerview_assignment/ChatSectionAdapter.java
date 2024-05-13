package com.example.recylcerview_assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatSectionAdapter extends RecyclerView.Adapter<ChatSectionAdapter.ViewHolder> {

    private ArrayList<String> user_name;
    private ArrayList<String> user_image_url;
    private Context context;

    public ChatSectionAdapter(Context context, ArrayList<String> user_name, ArrayList<String> user_image_url) {
        this.user_name = user_name;
        this.user_image_url = user_image_url;
        this.context = context;
    }


    @NonNull
    @Override
    public ChatSectionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_lay, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatSectionAdapter.ViewHolder holder, int position) {

        holder.imageName.setText(user_name.get(position));


        Glide.with(context)
                .asBitmap()
                .load(user_image_url.get(position))
                .placeholder(R.drawable.user)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return user_name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image;
        TextView imageName;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.chat_list_image);
            imageName = itemView.findViewById(R.id.chat_list_name);


            // parentLayout = itemView.findViewById(R.id.parent_layout);

            // parentLayout = itemView.findViewById(R.id.editTextSearch);
        }
    }
}
