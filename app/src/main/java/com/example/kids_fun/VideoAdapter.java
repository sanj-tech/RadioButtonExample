package com.example.kids_fun;

import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {


    public VideoAdapter(Vector<YouTubeVideo> youTubeVideos) {
    }

    @NonNull
    @Override
    public VideoAdapter.VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.VideoViewHolder holder,int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
