package com.company;
import lombok.AllArgsConstructor;
import lombok.ToString;
public class Country {
        public String name;
        public double size;
        public int numberOfCitizens ;
        public String continent;
        public void printCountrySize(){
            System.out.println(String.format("Country size is : %2f",size ));
        }
        public void printSizePerCitizen(){
            System.out.println(String.format("Country size per sitizen is : %2f",size/numberOfCitizens ));
        }
        public Country(String name, double size, int numberOfCitizens, String continent) {
            this.name = name;
            this.size = size;
            this.numberOfCitizens = numberOfCitizens;
            this.continent = continent;
        }
        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    ", numberOfCitizens=" + numberOfCitizens +
                    ", continent='" + continent + '\'' +
                   '}';
        }
    }
    
    
    public class Main {
   public static void main(String[] args) {
     Country israel= new Country ( "Israel", 250000000,8000000," Asia");
     israel.printCountrySize();
     israel.printSizePerCitizen();
     System.out.print(israel);
   }
}
