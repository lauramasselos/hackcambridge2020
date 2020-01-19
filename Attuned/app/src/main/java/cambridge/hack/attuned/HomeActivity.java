package cambridge.hack.attuned;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView songTitle;
    TextView songArtist;
    ImageView songAlbum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("home", "loaded home");

        setContentView(R.layout.activity_home);

        songTitle = (TextView)findViewById(R.id.song_title);
        songArtist = (TextView)findViewById(R.id.song_artist);
        songAlbum = (ImageView)findViewById(R.id.song_album);

        songTitle.setText("Loch Lomond");
        songArtist.setText("Run Rig");
        songAlbum.setImageResource(R.drawable.img1);


    }
}
