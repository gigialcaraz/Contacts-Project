package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class FillApartments {

    private Scanner input = new Scanner(System.in);
    private ArrayList<ApartmentBlocks> blockList = new ArrayList<>(10);

    public void menuCompany () {
        String name;
        int bedRooms;
        int bathrooms;
        boolean balcony = false;
        int livingRoom;
        boolean playRoom = false;
        String option;

        String location;

        System.out.println("What would you like to name this apartment?");
        name = input.nextLine();
        System.out.println("Number of bedrooms?");
        bedRooms = input.nextInt();
        System.out.println("Number of bedrooms?");
        bathrooms = input.nextInt();
        System.out.println("Does it have a balcony, yes or no ?");
        option = input.nextLine();
        if (option.equalsIgnoreCase("yes")) {
            balcony = true;
        }
        System.out.println("How many living rooms does it have?");
        livingRoom = input.nextInt();
        System.out.println("Does it have a playroom, yes or no ?");
        option = input.nextLine();
        if(option.equalsIgnoreCase("no")) {
            playRoom = true;
        }
        System.out.println("Where is this apartment located");
        location = input.nextLine();

        ApartmentBlocks blocks = new ApartmentBlocks(name, bedRooms, bathrooms, balcony, livingRoom,playRoom, location);


        blockList.add(blocks);
        if(blockList.add(blocks)) {
            System.out.println("You added " + blocks.getName() + "to the system ");
        }

    }








}
