public class demenagement {
    public static void main(String[] args) {
        int numberOfBoxes = 34;
        int truckCapacity = 9;
        int numberOfTrips = 0;

        while(numberOfBoxes>=truckCapacity){
            System.out.println("un voyage de 9 carton");
            numberOfBoxes-=truckCapacity;
            numberOfTrips ++;
        }

        if(numberOfBoxes<=truckCapacity && numberOfBoxes!=0){
            System.out.println("un voyage de " + numberOfBoxes + " carton");
            numberOfTrips ++;
            System.out.println("Number of trips : "+ numberOfTrips ++);

        }
    }
}
