import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;


public class  Lab8
{

    public static void main(String args[]) throws IOException
    {

        ArrayList<String> obj = new ArrayList<>();

        System.out.println("Adding and removing elements: ");
        obj.add("Sasha");
        obj.add("Sasha");
        obj.add("Misha");
        obj.add("Anton");
        obj.add("Senya");
        obj.add("Dima");
        System.out.println("Current array list is:"+obj);

        obj.add(0, "Dasha");
        obj.add(1, "Ann");
        System.out.println("Current array list after addiding elements: "+obj);

        //Remove elements
        obj.remove("Dima");
        obj.remove("Misha");
        System.out.println("Current array list after removing elements: "+obj  +"\n");

        System.out.println("Searching for dublicates^ ");
        HashMap<String, Integer> letters = new HashMap<String, Integer>();
        for (int i = 0; i < obj.size(); i++)
        {
            String tempChar = obj.get(i);
            if (!letters.containsKey(tempChar))
            {
                letters.put(tempChar, 1);
            }
            else
            {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + ", Number of dublicates = " + entry.getValue());
        }

        System.out.println("\n" + "Revers of elements: ");
        Collections.reverse(obj);
        System.out.println("After reverse" + obj +"\n");

        System.out.println("Statistics for all element: ");
        for (int a = 0; a < obj.size(); a++)
        {
            int yes=0;
            for (int b=0; b<obj.size(); b++) if (obj.get(a).length()>=obj.get(b).length()) yes++;
            if (yes==5)
                System.out.println("The number of words that have more letters than the selected number: " +obj.get(a));
        }
        System.out.println("Words with max lenght: "+Collections.max(obj));
        System.out.println("Words with min lenght: "+Collections.min(obj));

        System.out.println("\nSubstring search:  ");
        int index = obj.lastIndexOf("Ann");
        if(index==-1)
        {
            System.out.println("Substring \"Ann\" not found");
        }else{
            System.out.println("Last occurrence of a string \"Ann\" in the index " + index);
        }

        Collections.sort(obj);
        System.out.println("\nThe same list after sorting string by length " +obj);

    }
}

