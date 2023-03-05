
package DataStructure;
import java.util.ArrayList;

/*
ArrayList?

Can contain the duplicate element, you can add null values, its thread safe,quick acces,add and remove element using index
position
*/
public class ArrayListEX{

    public static void main(String a[]) {

        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wiii u"};
        VideoGame game1 = new VideoGame("Battle field", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pocke man", 2002, "E", platform2);
        VideoGame game3 = new VideoGame("tom & zerry", 2003, "E", platform2);
        ArrayList<VideoGame> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);
        games.add(game3);
        System.out.println(games);

    }




}
