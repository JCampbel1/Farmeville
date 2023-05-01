import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyFarm {
    ArrayList<Plot> row;
    public int test;

    public static void main(String[] args) {
        MyFarm ToddsFarm= new MyFarm();

    }

    public MyFarm() {
//this iw where you call methods
        row = new ArrayList <>();
        // fill my array list

        for (int i=0; i<10; i++){
            row.add(new Plot());
        }

        addLettuce();
        printRowInfo();
        totalCarrots();
        totalPlants();
        printPlantNames();
        tomatolocations();
        averageNumberOfPlants();
        numberOfCarrotPlots();

    }

    //practice
    public void totalPlants () {
        System.out.println("****** TOTAL PLANTS******");
        int total = 0;
        for (int i = 0; i < row.size(); i++) {
            total = total + row.get(i).numberOfPlants;
        }

        System.out.println("total plants:" + total);

    }

    public void printPlantNames() {
        System.out.println("*******Plant Names********");
        for (int i = 0; i < row.size(); i++) {
            System.out.print(i + ":" + row.get(i).plantName + ",");
        }
        System.out.println();

    }

    public void totalCarrots(){
        System.out.println("****** TOTAL CARROTS******");
        int total = 0;
        for (int i=0; i<row.size(); i++) {
    if(row.get(i).plantName.equals("carrot")) {
        total = total + row.get(i).numberOfPlants;
    }

    }

        System.out.println("The total number of carrots is"+ total);

        }

        public void printRowInfo() {
            System.out.println("******PRINT ROW INFO*******");
            for (int i = 0; i < row.size(); i++) {
                row.get(i).printPlotInfo();

            }

        }

        public void addLettuce() {
            System.out.println("****** ADD LETTUCE*******");
            printPlantNames();
            row.add(new Plot());
            row.get(10).plantName = "lettuce";
            row.get(10).numberOfPlants = 42;
            row.get(10).needsWater = true;

            }

            public void tomatolocations(){
        System.out.println("******* TOMATO LOCATIONS*******");
        printPlantNames();
        for (int i=0 ;i<row.size(); i++) {
            if (row.get(i).plantName.equals("tomato")) {
                System.out.print(i + ",");

            }
        }}

            public void averageNumberOfPlants() {
                System.out.println("*******Average Plants*******");
                int total = 0;
                int avg = 0;
                for (int k = 0; k < row.size(); k++) {
                    total = total + row.get(k).numberOfPlants;
                }
                avg = total / row.size();

            }

                public void  numberOfCarrotPlots() {
                    System.out.println("******* TOTAL CARROT PLOT *******");
                    int total= 0;
                    for (int t=0; t<row.size(); t++) {
                        if (row.get(t).plantName.equals("Carrot")) {
                            total = total + 1;
                        }
                    }
                    }

                    public void everyOtherNeedsWater() {
                            for (int t = 0; t < row.size(); t = t + 2) {
                                row.get(t).needsWater = false;
                            }
                        }
                        public void greaterThan10() {
                            System.out.println("******* Greater than 10******");

                            int count=0;
                            for(int i=0; i< row.size(); i++) {
                                if (row.get(i).numberOfPlants>10) {
                                    count++;
                                }
                            }
                                System.out.println("The number of plots with more than 10 plants is" +count);




                }



            }












