public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot() {
        numberOfPlants = (int) (Math.random() * 90 + 10);
        int plantID = (int) (Math.random() * 5);

        if (plantID == 0) {
            plantName = "Empty";
            numberOfPlants=0;
        } else if (plantID == 1) {
            plantName = "Tomato";
        } else if (plantID == 2) {
            plantName = "Carrot";
        } else if (plantID == 3) {
            plantName = "Tulip";
        } else {
            plantName = "lettuce";
        }
        int waterId = (int) (Math.random() * 2);
        if (waterId == 0 && !plantName.equals("Empty")) {
            needsWater = true;
        } else {
            needsWater = false;
        }
    }

    public void printPlotInfo() {
        System.out.println("*** PLOTINFO***");
        System.out.println("plant Name" + plantName);
        System.out.println("number Of Plants:" + numberOfPlants);
        System.out.println("needs water:" + needsWater);
    }

}








//randomly assign true or false to needsWater
//MyFarm