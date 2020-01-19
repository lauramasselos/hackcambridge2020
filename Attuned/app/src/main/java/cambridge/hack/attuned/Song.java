package cambridge.hack.attuned;

import android.util.Log;

public class Song {
    String title;
    String artist;
    int photoId;


    Song(String title, String artist, int photoId) {
        Log.d("deboog", title + artist + photoId);

        this.title = title;
        this.artist = artist;
        this.photoId = photoId;


    }
}
