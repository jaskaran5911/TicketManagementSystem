/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmanagement;

import Model.Details;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navdeep
 */
public class Station {

    String FromPlace, ToPlace, Platform, Terminal, TrainTime, CompType, seatNo, compNo, Compwith, data;
    Scanner sc = new Scanner(System.in);
    Details d;
    Train t;
    Ticket tc;
    ArrayList<Details> al = new ArrayList<>();
    ArrayList<Train> trainal = new ArrayList<>();
    ArrayList<Ticket> ticket = new ArrayList<>();
    ArrayList<String> CarriageData = new ArrayList<>();
    int n, price;

    public Station() {
    }
    //Method to show different operating message
    private int showmessage() {
        System.out.println("1) Train details");
        System.out.println("2) Book Ticket: ");
        System.out.println("3) Generate carriage detail:");

        n = sc.nextInt();
        return n;
    }
    //Method to perform different operations using switch case
    public void BookTicket() {
        while (true) {
            switch (showmessage()) {
                case 1:
                    Train traindata = new Train() {
                    };
                    ArrayList<String> trainlist = new ArrayList<>();
                     {
                        try {
                            trainlist = traindata.readFromFile();
                            for (int i = 0; i < trainlist.size(); i++) {
                                System.out.println(trainlist.get(i));
                            }
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please Enter the Train Name:");
                    Terminal = sc.next();
                    System.out.println("Please Enter the Interstate Terminal: ");
                    FromPlace = sc.next();
                    System.out.println("Please Enter the Platform:");
                    Platform = sc.next();
                    System.out.println("Please Enter the Train Time:");
                    TrainTime = sc.next();

                    System.out.println("Please Enter Train Class Type: 1) SLEEPER or 2) NON-SLEEPER");
                    CompType = sc.next();
                    Carriage c = new Carriage();
                    ArrayList<Carriage> list = new ArrayList<>();
                    list = c.checkavailable();
                    System.out.println(list.size());
                    if (CompType.equals("SLEEPER")) {
                        System.out.println("Please Enter Compartment No: ");
                        compNo = sc.next();

                        for (int i = 0; i < list.size(); i++) {
                            Carriage check = new Carriage();
                            check = list.get(i);
                            System.out.println(check.getCompartmentNo());
                            if (check.getCompartmentNo().equals(compNo)) {
                                System.out.println("Compartment is already booked!!!");
                                break;
                            } else {
                                System.out.println("Please Enter Ticket Price: ");
                                price = sc.nextInt();
                                tc = new Ticket(CompType, price, compNo);
                                ticket.add(tc);
                                break;
                            }
                        }

                    } else {
                        System.out.println("Please Enter Seat No: ");
                        seatNo = sc.next();
                        for (int i = 0; i < list.size(); i++) {
                            Carriage check = list.get(i);
                            if (check.getSeatNo().equals(seatNo)) {
                                System.out.println("Seat is already booked!!!");
                                break;
                            } else {
                                System.out.println("Please Enter Ticket Price: ");
                                price = sc.nextInt();
                                tc = new Ticket(CompType, seatNo, price);
                                ticket.add(tc);
                                break;
                            }
                        }

                    }
                    break;

                case 3:
                    try {
                        Carriage ca = new Carriage();
                        ca.tostring();
                        ca.writeToFile();
                        System.out.println("Carriage detail added in text file");
                    } catch (IOException ex) {
                        Logger.getLogger(Station.class.getName()).log(Level.SEVERE, null, ex);
                    }

            }
        }
    }

}
