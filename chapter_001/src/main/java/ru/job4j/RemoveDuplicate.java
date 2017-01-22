
/**
 * Created by Helena on 14/01/2017.
 */
public class RemoveDuplicate {

    public static void removeDuplicates(String[] list) {
        for (int i = 0; i < list.length; i++)
        {
            String a = list[i];
            for(int j = 0; j< list.length; )

                if (a == list[j])
                {
                    list[j] = null; list[j] = list[list.length - j]; }
                else {
                    j++;

                }
        }
    }


}