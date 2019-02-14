package com.personal.Pattern;

public class Pattern {
    public static boolean printPattern(int limit)
    {
        int rows;
        int column;
        for(rows=1;rows<=limit;rows++)
        {
            for(column=1;column<=rows;column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
        for(rows=limit-1;rows>=1;rows--)
        {
            for(column=1;column<=rows;column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
        return true;
    }
}
