/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import Model.Details;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jaskaran
 */
public class Station {

    String FromPlace, ToPlace, Platform, Terminal, TrainTime, CompType, seatNo, compNo, Compwith;
    Scanner sc = new Scanner(System.in);
    Details d;
    Train t;
    Ticket tc;
    ArrayList<Details> al = new ArrayList<>();
    ArrayList<Train> trainal = new ArrayList<>();
    ArrayList<Ticket> ticket = new ArrayList<>();
    int n, price;

    public Station() {
    }

    private void showmessage() {
        System.out.println("1) Book Ticket: ");
        System.out.println("2) Show result:");

        n = sc.nextInt();

    }

    public void BookTicket() {
        while (true) {
            showmessage();
            if (n == 1) {
                System.out.println("Please Enter the Departure Place: ");
                FromPlace = sc.next();
                System.out.println("Please Enter the Departure Place: ");
                ToPlace = sc.next();
                d = new Details();
                d.setFromPlace(FromPlace);
                d.setToPlace(ToPlace);
                al.add(d);
                System.out.println("Please Enter the Platform Number:");
                Platform = sc.next();
                System.out.println("Please Enter the Interstate Terminal:");
                Terminal = sc.next();
                System.out.println("Please Enter the Train Time:");
                TrainTime = sc.next();
                t = new Train(Platform, Terminal, TrainTime) {};
                trainal.add(t);
                System.out.println("Please Enter Train Compartment Class Type: 1) First-Class or 2) Economy");
                CompType = sc.next();
                if (CompType.equals("First-Class")) {
                        System.out.println("Please Enter Compartment No: ");
                        compNo = sc.next();
                        System.out.println("Please Enter Ticket Price: ");
                        price = sc.nextInt();
                        tc = new Ticket(CompType, price, compNo);
                        ticket.add(tc);
                    
                } else {
                    System.out.println("Please Enter Seat No: ");
                    seatNo = sc.next();
                    System.out.println("Please Enter Ticket Price: ");
                    price = sc.nextInt();
                    tc = new Ticket(CompType, seatNo, price);
                    ticket.add(tc);
                }

            } else if (n == 2) {
                toString();
                System.exit(0);
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < al.size(); i++) {
            Details d = al.get(i);
            System.out.println("Detail " + i + ")");
            System.out.println("Departure place: " + d.getFromPlace());
            System.out.println("Destination place: " + d.getToPlace());
            Train t = trainal.get(i);
            System.out.println("Platform Number: " + t.getPlatForm());
            System.out.println("Interstate Terminal " + t.getInterState());
            System.out.println("Time: " + t.getTime());
            Ticket tc=ticket.get(i);
            System.out.println("Ticket compartment type: "+ tc.getCompType());
            if(tc.getCompType().equals("First-Class")){
                System.out.println("Ticket Compartment No: "+tc.getCompNo());
                System.out.println("Ticket Price: "+tc.getTicketPrice());
            }
            else{
                System.out.println("Ticket Seat No: "+tc.getSeatNo());
                System.out.println("Ticket Price: "+tc.getTicketPrice());
            }
        }
        return null;
    }

}
