import java.util.HashMap;
import java.util.Map;

final class student{

    private final String name;
    private final int regNo;
    private final Map<String,String> metadata1;

    public student(String name, int regNo,
                   Map<String, String> metadata1)
    {

        this.name = name;
        this.regNo = regNo;
        this.metadata1 = metadata1;


        Map<String,String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry : metadata1.entrySet())
        {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.metadata1 = tempMap;
        }

}


public class immutable {
}
