package ComparableExample;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Jukebox3 extends Object {
    public static void main(String[] args) {
        go();
    }
    public static void go(){
        List<SongV3> list = MockSongs.getSongs();
        System.out.println(list);
        list.sort((o1,o2)-> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println(list);
        list.sort((o1,o2) -> o1.getArtist().compareTo(o2.getArtist()));
        System.out.println(list);

        HashSet<SongV3> set = new HashSet<>(list);
         System.out.println(set);


    }



}
