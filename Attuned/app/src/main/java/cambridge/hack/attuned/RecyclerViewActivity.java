package cambridge.hack.attuned;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<Song> songs;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler_view);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        Log.d("deboog", "initalised song list");



        initializeAdapter();
    }

    private void initializeData(){
        songs = new ArrayList<>();
        songs.add(new Song("Loch Lomond", "Run Rig", R.drawable.img1));
        songs.add(new Song("Sun King", "The Beatles", R.drawable.img1));
        songs.add(new Song("Season 2 Episode 3", "Glass Animals", R.drawable.img2));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(songs);
        rv.setAdapter(adapter);
    }
}
