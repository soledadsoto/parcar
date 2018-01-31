package com.desarrollos.entde;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @3.0
 * @author Soledad soto
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(string[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        accelerate();
        slowDown();
        moveDown();
        accelerate();
        car.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    private void printGarage() {
		// TODO Apéndice de método generado automáticamente
		
	}
	/**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public static void accelerate() throws InterruptedException{
        string c = new string();
        string space = new string();
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public static void slowDown() throws InterruptedException{
    	string c = new string();
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public static void moveDown() throws InterruptedException{
    	string c = new string();
    	for(int i=0; i<5; i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
