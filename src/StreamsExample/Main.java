package StreamsExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
//        List<String> list = List.of("a","b","C","D","e");
//       Stream<String> stream = list.stream();
//       Stream<String> limit = stream.limit(3);
//       List<String> res = limit.collect(Collectors.toList());
//
//        List<String> res = list.stream().sorted((s1,s2)-> s1.compareToIgnoreCase(s2)).skip(2)
//                                .limit(4)
//                                .collect(Collectors.toUnmodifiableList());
//        System.out.println(res);

        List<Song> songs = new Songs().getSongs();
        List<Song> res = songs.stream().filter(s ->s.getYear() > 1995).toList();
        System.out.println(res);


        List<String> res1 = songs.stream().map(song -> song.getGenre()).distinct().collect(toList());
        System.out.println(res1);


    }
}
