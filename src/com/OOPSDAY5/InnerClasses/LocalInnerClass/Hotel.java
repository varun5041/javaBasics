package com.OOPSDAY5.InnerClasses.LocalInnerClass;

public class Hotel {
    private String name;
    private int totalrooms;
    private int ReservedRooms;

    public Hotel(String name, int totalrooms, int reservedRooms) {
        this.name = name;
        this.totalrooms = totalrooms;
        this.ReservedRooms = reservedRooms;
    }

    public void Reserveroom(String GuestName,int numberofRooms){
        class ReservationValidator{
            boolean validate(){
                if(GuestName==null || GuestName.isBlank()){
                    System.out.println("guestname cannot be blank!");
                    return false;
                }
                if(numberofRooms < 0){
                    System.out.println("enter correct no of rooms");
                    return false;
                }
                if(ReservedRooms + numberofRooms > totalrooms){
                    System.out.println("not enough rooms available!");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            ReservedRooms +=numberofRooms;
            System.out.println("Reservation Confirmed for guest " + GuestName + " " + numberofRooms + " rooms are booked!");
        }else{
            System.out.println("we have only" + (totalrooms - ReservedRooms) + "Available");
        }
    }


}
