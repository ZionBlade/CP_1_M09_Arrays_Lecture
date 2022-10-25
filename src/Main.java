import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {

        String[] items = new String [100]; //sparse array

        String[] names = {"tom", "Dick", "Harry"}; //array literal
        //when you make an array, everything has to be the same type

        int itemCount = 0;

        items[0] = "radio";
        itemCount++; // keeps track of record count in sparse array


        System.out.println(names.length);

        System.out.println(names[0]); //tom

        //traversal - list all the elements in order
        for(int r = 0; r < names.length; r++) // traversal, when you go thorugh all the elements of the structure (in order)
        {
            System.out.println(names[r]);
        }

        for(String r: names)
        {
            System.out.println(r);
            //call by value = get a copy
            //call by reference = where it lives in the memory
        }

        int[] values = new int[100]; //first index in values is 0, second index in values is 99
        Random gen = new Random();

        for(int l = 0; l < values.length; l++)
        {
            values[l] = gen.nextInt(100) + 1;
        }

        for(int l = 0; l < values.length; l++)
        {
            System.out.printf("%3d",values[l]);
        }

        //Algorithms
        // sum   min   max
        int sum = 0;
        for(int l = 0; l < values.length; l++)
        {
            sum += values[l];
        }

        for(int l = 0; l < values.length; l++)
        {
            System.out.printf("%4d",values[l]);
        }

        System.out.println("\nThe sum of the array values is " + sum);
        System.out.println("The average is " + sum / values.length);

        int min = values[0];
        int max = values[0];
        for(int l = 0; l < values.length; l++)
        {
            if(values[l] < min)  // got a new min
            {
                min = values[l];
            }
            if(values[l] > max)  // got a new min
            {
                max = values[l];
            }
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);


        // search algorithms
        int target = 53;

        //basic find or find each

        boolean found = false;
        for(int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                System.out.println("Found at: " + t);
                found = true;
            }
        }
        System.out.println("Finished the search!");
        if(!found)
        {
            System.out.println("Did not find the values " + target);
        }


        // find first - terminate the search after finding first occurance

        found = false;

        for(int t = 0; t < values.length; t++)
        {
            if (values[t] == target)
            {
                System.out.println("Found at: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if(!found)
        {
            System.out.println("Did not find the values " + target);
        }

        //write a loop that traverses backwards to implement find last
        found = false;
        //find last - terminate the search after finding first occurance
        for(int t = values.length-1; t >= 0; t--)
        {
            if (values[t] == target)
            {
                System.out.println("Found at: " + t);
                found = true;
                break;
            }
        }
        System.out.println("Finished the search!");
        if(!found)
        {
            System.out.println("Did not find the values " + target);
        }
    }
}