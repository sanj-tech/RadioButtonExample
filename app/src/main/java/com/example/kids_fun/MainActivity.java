package com.example.kids_fun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<YouTubeVideo> youTubeVideos=new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        youTubeVideos.add(new YouTubeVideo("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/zAax3z5uQ2k\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/DA8DF6VdX3E\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4GcLWywzQXY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));
        youTubeVideos.add(new YouTubeVideo(""));

        VideoAdapter videoAdapter=new VideoAdapter(youTubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}
