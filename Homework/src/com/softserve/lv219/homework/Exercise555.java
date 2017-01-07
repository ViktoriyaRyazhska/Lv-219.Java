package com.softserve.lv219.homework;

import java.util.Random;

public class Exercise555 implements Executable {
	
	@Override
	public void execute() {
		int n = 0;
		Random generator = new Random();
		
		n = generator.nextInt(20)+1;		
		
        int [][] p = new int [n][];
        p[0] = new int [1];
        p[1] = new int [2];
        p[1][0] = p[1][1] = 1;
        System.out.println(p[0][0] = 1);
        System.out.println(p[1][0] + " " + p[1][1]);
        for (int i = 2; i < n; i++)
        {
            p[i] = new int [i+1];
            System.out.print((p[i][0] = 1) + " ");
            for (int j = 1; j < i; j++)
            {
                System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + " ");
            }
            System.out.println(p[i][i] = 1);
        }
	}

}
