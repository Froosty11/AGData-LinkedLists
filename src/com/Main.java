package com.company;

public class Main {



    public static void main(String[] args) {

        LinkedList lsB = new LinkedList();
        LinkedList lsA = new LinkedList();
        long t_Start = 0;
        long t_total = 0;
        long t_Sum;
        long t_Min;
        System.out.println("# n\taverage\tminimum");
        int[] nlist = {5, 10, 20, 40, 800, 1600, 3200, 6400, 12800};
        for (int n :
                nlist) {
            int iterations = 100;
            t_Sum = 0;
            t_Min = (int)Double.POSITIVE_INFINITY;
            for(int i = 0; i < iterations; i ++){
                lsB.clearList();
                lsB.appendData(69);
                for (int j = 1; j < n; j++) {
                    lsA.appendData(j);
                }
                t_Start = System.nanoTime();

                LinkedList.appendNode(lsB.getNode(5));
                //After this, both lsA and lsB refrence the start, 5.

                t_total =  System.nanoTime()-t_Start;
                t_Sum += t_total;
                if(t_Sum < t_Min) t_Min = t_Sum;
            }
            System.out.printf("%d\t%d\t%d\n", n, t_Min, t_Sum/iterations);
        }
    }
}
