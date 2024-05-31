import java.lang.reflect.Array;
import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners;

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        listeners = new ArrayList<>();

    }

    public String getTitle() {

        return title;

    }

    public String getArtist() {

        return artist;

    }

    public int howMany(ArrayList<String> newListeners) {

        int newInt = 0;

        for (String listener : newListeners) {

            if (!listeners.contains(listener.toLowerCase())) {

                listeners.add(listener.toLowerCase());

                newInt++;

            }

        }

        return newInt;

    }
}