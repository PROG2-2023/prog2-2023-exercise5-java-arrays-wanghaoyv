package prog2.exercise5.flight.booking.system;

import java.time.Period;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.security.PublicKey;
import javax.sound.sampled.SourceDataLine;
import javax.security.auth.callback.ConfirmationCallback;

public class FlightBooking {
    public String flightCompany;
    public String flightID;
    public LocalDate departureDate;
    public LocalDate returnDate;
    public int childPassengers;
    public int adultPassengers;
    public int totalPassengers;
    public double totalTicketPrice;

    // public FlightBooking(String passengerFullName, LocalDate depart, LocalDate
    // returnDate,
    // int childPassengers, int adultPassengers) {
    // this.passengerFullName = passengerFullName;
    // this.departureDate = depart;
    // this.returnDate = returnDate;
    // this.childPassengers = childPassengers;
    // this.adultPassengers = adultPassengers;
    // }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }

    public String getFlightCompany() {

        return flightCompany;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightID() {
        return flightID;
    }

    // public void setPassengerFullName(String passengerFullName) {
    // this.passengerFullName = passengerFullName;
    // }
    // public String getPassengerFullName() {
    // return passengerFullName;
    // }

    public void setDepartingDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getDepartingDate() {
        return departureDate;
    }

    public void setChildrenPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getChildrenPassengers() {
        return childPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers) {
        this.totalPassengers = childPassengers + adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    // 练习四 添加区
    // task 2

    public enum BookingClass {
        FIRST, BUSINESS, ECONOMY;
    }

    private BookingClass booking;

    public void setBookingClass(String bookingClass) {
        switch (bookingClass) {
            case "1":
                this.booking = BookingClass.FIRST;
                break;
            case "2":
                this.booking = BookingClass.BUSINESS;
                break;
            case "3":
                this.booking = BookingClass.ECONOMY;
                break;
            default:
                break;
        }
    }

    public BookingClass getBookingClass() {
        return this.booking;
    }

    // task 3
    private TripType trip;

    public enum TripType {
        RETURN, ONE_WAY;
    }

    public void setTripType(String tripType) {
        switch (tripType) {
            case "1":
                this.trip = TripType.ONE_WAY;
                break;
            case "2":
                this.trip = TripType.RETURN;
                break;
            default:
                break;
        }
    }

    public TripType getTripType() {
        return this.trip;
    }

    // task 4-5
    private TripSource tripSource;
    private TripDestination tripDestination;
    private SourceAirport sourceAirport;
    private DestinatioAairport destinatioAairport;

    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    public enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    public enum SourceAirport {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT, PARIS_CHARLESDE_GAULLE_AIRPORT;
    }

    public enum DestinatioAairport {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT, PARIS_CHARLESDE_GAULLE_AIRPORT;
    }

    public void setTripSource(String tripSource) {
        switch (tripSource) {
            case "1":
                this.tripSource = TripSource.NANJING;
                break;
            case "2":
                this.tripSource = TripSource.BEIJING;
                break;
            case "3":
                this.tripSource = TripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = TripSource.OULU;
                break;
            case "5":
                this.tripSource = TripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = TripSource.PARIS;
                break;
            default:
                break;
        }
    }

    public TripSource getTripSource() {
        return this.tripSource;
    }

    public void setTripDestination(String tripDestination, String destinatioAairport) {
        switch (tripDestination) {
            case "1":
                this.tripDestination = TripDestination.NANJING;
                this.destinatioAairport = DestinatioAairport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.tripDestination = TripDestination.BEIJING;
                this.destinatioAairport = DestinatioAairport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.tripDestination = TripDestination.SHANGHAI;
                this.destinatioAairport = DestinatioAairport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4":
                this.tripDestination = TripDestination.OULU;
                this.destinatioAairport = DestinatioAairport.OULU_AIRPORT;
                break;
            case "5":
                this.tripDestination = TripDestination.HELSINKI;
                this.destinatioAairport = DestinatioAairport.HELSINKI_AIRPORT;
                break;
            case "6":
                this.tripDestination = TripDestination.PARIS;
                this.destinatioAairport = DestinatioAairport.PARIS_CHARLESDE_GAULLE_AIRPORT;
                break;
            default:
                break;
        }
    }

    public TripDestination getTripDestination() {
        return this.tripDestination;
    }

    // public void setSourceAirport(String sourceAirport)
    // {
    // switch(sourceAirport){
    // case"1":
    // this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
    // break;
    // case"2":
    // this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
    // break;
    // case"3":
    // this.sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
    // break;
    // case"4":
    // this.sourceAirport = SourceAirport.OULU_AIRPORT;
    // break;
    // case"5":
    // this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
    // break;
    // case"6":
    // this.sourceAirport = SourceAirport.PARIS_CHARLESDE_GAULLE_AIRPORT;
    // break;
    // default:
    // break;
    // }
    // }
    // public SourceAirport getSourceAirport() {
    //     return this.sourceAirport;
    // }

    public DestinatioAairport get() {
        return this.destinatioAairport;
    }

    // task 6

    public void setDepartureDate(LocalDate departureDate) {
        String sdepart = "2023-03-04";
        this.departureDate = LocalDate.parse(sdepart);
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        String sreturn = "2023-03-05";
        this.returnDate = departureDate.plusDays(2);
        long i = departureDate.toEpochDay() - returnDate.toEpochDay();
        if (i == 0) {
            LocalDate reDay = departureDate.plusDays(2);
        } else if (i == 1) {
            LocalDate reDay = departureDate.plusDays(1);
        }
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    // task 7
    Random r = new Random();

    // public String ticketNumber="11FASDFDOM";
    public void setTicketNumber(int i) {
        String ticketNumber = "11FASDFDOM";
        switch (trip) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
            default:
                break;
        }

        switch (booking) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
            default:
                break;
        }

        // for(int i=0;i<4;i++){
        // char number=(char)((r.nextInt(26)+65));
        // ticketNumber=ticketNumber+number;
        // }
        // this.ticketNumber=ticketNumber+"DOM";

        // if(tripSource ==tripSource.NANJING && tripDestination ==
        // tripDestination.BEIJING){
        // this.ticketNumber=ticketNumber+"DOM";
        // }

        // if(tripSource ==tripSource.BEIJING && tripDestination ==
        // tripDestination.NANJING){
        // this.ticketNumber=ticketNumber+"DOM";
        // }

        // if(tripSource ==tripSource.OULU && tripDestination ==
        // tripDestination.HELSINKI){
        // this.ticketNumber=ticketNumber+"DOM";
        // }

        // if(tripSource ==tripSource.HELSINKI && tripDestination ==
        // tripDestination.OULU){
        // this.ticketNumber=ticketNumber+"DOM";
        // }

        // if(tripSource ==tripSource.OULU && tripDestination ==
        // tripDestination.BEIJING){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.HELSINKI && tripDestination ==
        // tripDestination.BEIJING){
        // this.ticketNumber=ticketNumber+"INT";

        // }

        // if(tripSource ==tripSource.OULU && tripDestination ==
        // tripDestination.NANJING){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.HELSINKI && tripDestination ==
        // tripDestination.NANJING){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.BEIJING && tripDestination ==
        // tripDestination.HELSINKI){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.NANJING && tripDestination ==
        // tripDestination.HELSINKI){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.BEIJING && tripDestination ==
        // tripDestination.OULU){
        // this.ticketNumber=ticketNumber+"INT";
        // }

        // if(tripSource ==tripSource.NANJING && tripDestination ==
        // tripDestination.OULU){
        // this.ticketNumber=ticketNumber+"INT";
        // }

    }

    public String[] getTicketNumber() {
        return ticketNumber;
    }

    // task 8
    public void setTotalTicketPrice() {
        this.totalTicketPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));

    }

    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    public double departingTicketPrice;
    public double returnTicketPrice;
    double expectedPrice = 2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250)));
    public void setDepartingTicketPrice(int child, int adult) {
        this.departingTicketPrice = departingTicketPrice;
    }

    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice() {
        this.returnTicketPrice = returnTicketPrice;
    }

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }

    // task 9
    public enum ConfirmationMessage {
        CHANGE, NOTCHANGE;
    }

    private ConfirmationMessage ConfirmationMessage;

    public void setConfirmationMessage(String confirmationMessage) {
        // switch(confirmationMessage){
        // case"1":
        // this.ConfirmationMessage = ConfirmationMessage.CHANGE;
        // System.out.println("Thank you for booking your flight with "+flightCompany+".
        // Following are the details \n of your booking and the trip: \n"+
        // "Ticket Number:"+ticketNumber+"\nPassenger Name:"+passengerFullName+"\nFrom
        // TripSource to"+tripDestination+"\nDate of departure:"+
        // departureDate+"\nDate of return: returningDate (Changed from old
        // returningDate to new\n" +returnDate+"\nIMPORTANT NOTICE: As per our policy,"+
        // " the return date was changed because it was \nless than two days apart from
        // your departure date.");
        // break;
        // }
    }
    // 练习四 添加区

    // 练习五 添加区
    int size = 3;
    public String[] passengerFullName = new String[] { "Matt Jive", "Sally Fields", "Posh Quattro" };
    public String[] passengerGender = new String[] { "Male", "Female", "Other" };
    public int[] passengerAge = new int[] { 43, 32, 21 };
    public String[] ticketNumber = new String[size];
    int number;
    private Airport destinationAirport;

    public void setPassengerFullName(int i, String passengerFullName) {
        this.passengerFullName = new String[] { "Matt Jive", "Sally Fields", "Posh Quattro" };
    }

    public String getPassengerFullName(int i) {
        return passengerFullName[i];
    }

    public void setPassengerGender(int i, String passengerGender) {
        this.passengerGender = new String[] { "Male", "Female", "Other" };
    }

    public String getPassengerGender(int i) {
        return passengerGender[i];
    }

    public void setPassengerAge(int i, int passengerAge) {
        this.passengerAge = new int[] { 43, 32, 21 };
    }

    public int getPassengerAge(int i) {
        return this.passengerAge[i];
    }

    public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers,
            int adultPassengers) {
        this.passengerFullName = new String[1];
        this.passengerFullName[0] = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        setTotalPassengers(childPassengers, adultPassengers);
    }

    public FlightBooking(int number) {
        this.passengerFullName = new String[number];
        this.passengerGender = new String[number];
        this.passengerAge = new int[number];
        this.ticketNumber = new String[number];
    }

    public void setSourceAirport(String sourceAirport) {
        switch (sourceAirport) {
            case "1":
                this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2":
                this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3":
                this.sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4":
                this.sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
            case "5":
                this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
                break;
            case "6":
                this.sourceAirport = SourceAirport.PARIS_CHARLESDE_GAULLE_AIRPORT;
                break;
            default:
                break;
        }
    }
    public SourceAirport getSourceAirport(){
        return sourceAirport;
    }

    public void setDestinationAirport(String soureAirport,String destinationAirport){
        switch(destinationAirport){
            case "1":
            this.destinatioAairport = DestinatioAairport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.destinatioAairport = DestinatioAairport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.destinatioAairport = DestinatioAairport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.destinatioAairport = DestinatioAairport.OULU_AIRPORT;
            break;
            case "5":
            this.destinatioAairport = DestinatioAairport.HELSINKI_AIRPORT;
            break;
            default:
            break;
        }
    }

    public Airport getDestinationAirport(){
        return destinationAirport;
    }

    static public void assertEquals(long expected, long actual) {
        assertEquals(expected, actual);
    }

}
