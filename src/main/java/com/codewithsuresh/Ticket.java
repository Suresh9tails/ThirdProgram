package com.codewithsuresh;

public class Ticket{
    private String ticketId;
    private double price;

//    Constructor
    public Ticket(String ticketId, double price){
        this.ticketId = ticketId;
        this.price = price;
    }


        public void printTicketDetails(){
            System.out.println("TicketID : " + ticketId);
            System.out.println("Fare : " + price);
        }
}
