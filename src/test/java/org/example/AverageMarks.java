package org.example;

public class AverageMarks {
    public static void main (String [] args)
    {
        float [] marks={62,45,59};
        float sum=0;
        for (float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("The average marks of a studnt is:"+ sum/marks.length);
    }
}
