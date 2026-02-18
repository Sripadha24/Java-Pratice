package ComparableExample;

import java.util.*;

public class MockSongs {
    public static List<SongV3> getSongs(){
       List<SongV3> list = new ArrayList<>();
       list.add(new SongV3("Baby One More Time","b",120));
        list.add(new SongV3("Baby One More Time","b",120));
       list.add(new SongV3("Shape of You","c",120));
       list.add(new SongV3("The Way You Look Tonight","3",120));
       list.add(new SongV3("Ride","f",120));
       list.add(new SongV3("The Way I Feel","a",120));
       return list;
    }
}
