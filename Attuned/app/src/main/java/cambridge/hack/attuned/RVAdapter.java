package cambridge.hack.attuned;


import android.os.Bundle;
import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView songTitle;
        TextView songArtist;
        ImageView songAlbum;

        PersonViewHolder(View itemView) {
            super(itemView);

            cv = itemView.findViewById(R.id.cv);
            songTitle = itemView.findViewById(R.id.song_title);
            songArtist = itemView.findViewById(R.id.song_artist);
            songAlbum = itemView.findViewById(R.id.song_album);
            Log.d("deboog", "PersonViewHolder songtitle is "+songTitle);


        }
    }

    List<Song> songs;

    RVAdapter(List<Song> songs){
        this.songs = songs;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        Log.d("deboog", "checking onBind"+ songs.get(i).title);
        Log.d("deboog", "song title is " + personViewHolder.songTitle);
//        personViewHolder.songTitle.setText(songs.get(i).title);
        Log.d("deboog", "checking onBind"+ songs.get(i).artist);
        personViewHolder.songArtist.setText(songs.get(i).artist);
        Log.d("deboog", "checking onBind"+ songs.get(i).artist);
        personViewHolder.songAlbum.setImageResource(songs.get(i).photoId);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }



    @Override
    public int getItemCount() {
        return songs.size();
    }
}