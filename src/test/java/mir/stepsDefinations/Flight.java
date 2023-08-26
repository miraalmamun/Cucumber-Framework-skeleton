package mir.stepsDefinations;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class Flight {


//    @Given("there is/are {int} flight(s) from {airport}")
//    public void selectAirport(int a, Airport airport) {
//        System.out.println(a + " : " + airport.getAirportName());
//    }

//    @Given("there is/are {int} flight\\(s\\) from {string}")
//    public void selectAirport(int a, String airportCode) {
//        System.out.println(a + " : " + airportCode);
//    }

    @Given("there is\\/are {int} flight\\(s) from {string}")
    public void there_is_are_flight_s_from(Integer int1, String string) {

        System.out.println("==============================================");

    }

    @ParameterType("[A-Z]{3}")
    public Airport airport(String code) {
        return new Airport(code);
    }

    private static class Airport {
        private String airportName;


        private Airport(String airportName) {
            this.airportName = airportName;
        }

        public String getAirportName() {
            return airportName;
        }

        public void setAirportName(String airportName) {
            this.airportName = airportName;
        }
    }


}
