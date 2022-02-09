package com.company;

public class Main {

    public static void main(String[] args) {
        PassengerPersonalInfo passenger = new PassengerPersonalInfo();
        passenger.setFirstName("Sam");
        passenger.setLastName("Mark");
        passenger.setAge(22);
        passenger.aboutPassenger();

        BuyingAirTickets buyingTickets = new BuyingAirTickets();
        buyingTickets.setFromCountry("Kanada");
        buyingTickets.setToCountry("Kazakhstan");
        buyingTickets.setPlace(52);
        buyingTickets.setPrice(20000.00);
        buyingTickets.buyingTickets();
    }

    static class PassengerPersonalInfo{
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            if (firstName.isEmpty()){
                System.out.println("First name did not entered");
            } else {
                this.firstName = firstName;
            }
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            if (lastName.isEmpty()){
                System.out.println("Last name did not entered");
            } else {
                this.lastName = lastName;
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 18){
                System.out.println("Passenger can`t enter the data");
            }
            this.age = age;
        }

        void aboutPassenger(){
            System.out.println("First name: " + getFirstName() + "\nSecond name: "+ getLastName() + "\nAge: " + getAge());
        }
    }

    static class BuyingAirTickets{
        private String fromCountry;
        private String toCountry;
        private double price;
        private int place;

        public String getFromCountry() {
            return fromCountry;
        }

        public void setFromCountry(String fromCountry) {
            if(fromCountry.isEmpty()){
                System.out.println("Please, enter the country name");
            } else
            this.fromCountry = fromCountry;
        }

        public String getToCountry() {
            return toCountry;
        }

        public void setToCountry(String toCountry) {
            if(toCountry.isEmpty()){
            System.out.println("Please, enter the country name");
        } else
            this.toCountry = toCountry;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getPlace() {
            return place;
        }

        public void setPlace(int place) {
            this.place = place;
        }

        void buyingTickets(){
            System.out.println("\nFrom " + getFromCountry() + " to " + getToCountry()  + "\nPlace: " + getPlace() + "\nPrice:  " + getPrice());
        }
    }
}
