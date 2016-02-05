/*Darcy Marmolejos
02/05/2016
CSE002
Lab02
Cyclometer Program
Program will be able to give the time and rotation count of a bicycle cyclometer of two trips. 
It will print the time in minutes, number of counts, and distance of each trip. It will also print the distance combined.*/
public class Cyclometer {
    // main method required for every Java Program
    public static void main (String[] args) {
        //Variable are docunmented
        int Trip1Seconds=480; // The time in seconds of the 1st trip
        int Trip2Seconds=3220; // The time in seconds of the 2nd trip
        int Trip1Rotcount=1561; // The rotation count of trip 1
        int Trip2Rotcount=9037; // The rotation count of trip 2
        
        // Stored Constants/intermediates for conversions
        double WheelDiameter=27.0, // Diameter of the wheel on bike
        PI=3.14159, // 
        feetperMile=5280, // The number of feet per 1 mile
        inchesperfoot=12, // The number of inches per one foot
        secondsperminute=60;  // THe number of seconds per one minute
        double Trip1Distance,Trip2Distance, TotalDistance=0; // Saving variables as doubles
        
        // prrint output data
        System.out.println("Trip 1 took"+ (Trip1Seconds/secondsperminute) + "minutes and had" + Trip1Rotcount + "counts.");
        System.out.println("Trip 2 took" + (Trip2Seconds/secondsperminute) + "minutes and had" + Trip2Rotcount + "counts.");
       
      // Calculate distance of each trip
        Trip1Distance=Trip1Rotcount*WheelDiameter*PI; // the distance in inches of trip 1
        Trip1Distance/=inchesperfoot*feetperMile; // the distance in miles of trip 1
        Trip2Distance=Trip2Rotcount*WheelDiameter*PI/inchesperfoot/feetperMile; // the distance in inches of trip 2
       TotalDistance=Trip1Distance+Trip2Distance;
       
        // print output data
        System.out.println("Trip 1 was" + Trip1Distance+"miles");
        System.out.println("Trip 2 was" + Trip2Distance+"miles");
        System.out.println("The tota distance was"+ TotalDistance+"miles");
        
    
    
        
        
    } //end of main method
    } //end of class

