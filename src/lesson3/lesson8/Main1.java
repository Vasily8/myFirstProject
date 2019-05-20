package lesson3.lesson8;

public class Main1 {
    public static void main(String[] args) {
        String [][] tours = {{"Greek", "15000", "poluponsionat", "7days"},
                {"Spain", "45000", "hotel", "14 days"},
                {"France", "100000", "hotel", "14 days"},
                {"France", "50000", "appartament", "6days"}};

        TurUtils.tourPrint(tours,"France");
        TurUtils.printVeryExpensiveTour(tours);


       TurUtils.allEveregeTour(tours);



    }
}
