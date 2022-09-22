package com;

public class Main {



    public static void main(String[] args) {

        LinkedList lsB = new LinkedList();
        LinkedList lsA = new LinkedList();
        long t_Start = 0;
        long t_total = 0;
        long ba_Sum, ba_Min, ab_Sum, ab_Min;
        System.out.println("# n\tba-average\tba-minimum\tab-average\tab-minimum");
        int[] nlist = { 10, 20, 40, 800, 1600, 3200, 6400, 12800};
        for (int n :
                nlist) {
            int iterations = 100;
            ba_Sum = 0;
            ba_Min = (int)Double.POSITIVE_INFINITY;
            ab_Sum = 0;
            ab_Min = (int)Double.POSITIVE_INFINITY;
            for(int i = 0; i < iterations; i ++){
                lsB.clearChain();
                lsB.addNode(69);
                for (int j = 1; j < n; j++) {
                    lsA.addNode(j);
                }
                t_Start = System.nanoTime();

                lsB.addNode(lsA.getNode(1));
                //After this, both lsA and lsB refrence the start, 5.

                t_total =  System.nanoTime()-t_Start;
                ba_Sum += t_total;
                if(ba_Sum < ba_Min) ba_Min = ba_Sum;
                //lsB.printList();


                //System.out.println("\n -------------------------------------------------------------");
                lsA.clearChain();
                lsB.clearChain();

                lsA.addNode(420);
                for (int j = 1; j < n; j++) {
                    lsB.addNode(j);
                }
                t_Start = System.nanoTime();
                LinkedList.Node t = lsA.getNode(420);
                lsB.addNode(t);
                t_total =  System.nanoTime()-t_Start;
                ab_Sum += t_total;
                if(ab_Sum < ab_Min) ab_Min = ab_Sum;
                //lsB.printList();

            }
            //System.out.println("\n -------------------------------------------------------------");
            System.out.printf("%d\t%d\t%d\t%d\t%d\n", n, ba_Min, ba_Sum/iterations,ab_Min, ab_Sum/iterations);
        }
    }
}
