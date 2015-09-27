import java.util.*;
import java.io.*;


/**
 * A Class that has a lot of uses that i use
 * 
 * @author John Elizarraras
 * @version 0.12
 */

public class Solver
{
    
    private double t;
    private double d;
    private double xVelo;
    private double yVelo;
    private double combinedVelocity;
    private double realAngle;
    private double maxHeight;
    private Point firstPoint;
    private Point secondPoint;
    private Point maxHeightPoint;
    private Point fourthPoint;
    private Point fifthPoint;
    private double aX;
    private double bX;
    private double cX;
    private double oX;
    private double tX;
    private double ranNum;
    private String response;
    private String s;
    private int wordCount;
    private int happy;
    private double x;
    private double y;
    private String reply;
	
    
/**
@return returns hi because why not?
*/
    
    public String formulaSolver()
    {
        
    System.out.println ("What do you need help with? (Type !commands if you want a list of commands you can solve for)");
    Scanner kbReader = new Scanner(System.in);
    response = kbReader.nextLine();
    if(response.equalsIgnoreCase("!commands")
      || response.equalsIgnoreCase("!help"))
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("HINT - CAPITALIZATION DOESN'T MATTER.");
        System.out.println("!commands or !help - gets commands");
        System.out.println("!polysolv - solves  a polynomial");
        System.out.println("!timedistancepara - solves for Vectors, Max Height and other info of a object thrown in 2-D with no interference");
        System.out.println("!end - ends the program");
        System.out.println("!reset - resets the terminal");
        System.out.println("!classgen - picks a random class for hearthstone");
        System.out.println("!code - link to a gist of the code");
        System.out.println("!trigCalc - calculates all of the main trig functions");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
    else if(response.equalsIgnoreCase("!timedistancepara"))
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What is the time it took for the ball to hit the ground?");
        t = kbReader.nextDouble();
        System.out.println("What distance did the ball travel");
        d = kbReader.nextDouble();
        System.out.println("Thank You");
        xVelo =  d /  t;
        System.out.println("The X Velocity Was " + xVelo + "m/s");
        yVelo = 0 - ((-9.8 *  t) / 2);
        System.out.println("The Y Velocity Was " + yVelo + "m/s");
        combinedVelocity = Math.sqrt( Math.pow(  yVelo, 2 ) + Math.pow ( xVelo , 2 ) );
        System.out.println("The Combined Velocity Was " + combinedVelocity + "m/s");
        realAngle = Math.toDegrees(Math.atan( yVelo / xVelo ));
        System.out.println("The Real Angle Was " + realAngle + " Degrees");
        maxHeight = (yVelo*(t/2) + (-4.9 * Math.pow(t/2,2)));
        System.out.println("The Maximum Height Was " + maxHeight + "m");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Points Are In The Format Of (Time, Distance)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        firstPoint = new Point(0,0);
        System.out.println("The First Point To Graph Is " + firstPoint);
        secondPoint = new Point(t/4 , yVelo * (t/4) + Math.pow(t*.25,2)*-4.9);
        System.out.println("The Second Point To Graph Is " + secondPoint);
        maxHeightPoint = new Point(t/2 , maxHeight);
        System.out.println("The Third Point To Graph Is (Which Is Also The Max Height) " + maxHeightPoint);
        fourthPoint = new Point(t * .75 , yVelo * (t * .75) + (Math.pow(t*.75,2)*-4.9));
        System.out.println("The Fourth Point To Graph Is " + fourthPoint);
        fifthPoint = new Point(t , 0);
        System.out.println("The Fifth Point To Graph Is " + fifthPoint);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
    else if(response.equalsIgnoreCase("!polysolv"))
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What is A?(Ax^2 + Bx + C)?");
        aX = kbReader.nextDouble();
        System.out.println("What is B?");
        bX = kbReader.nextDouble();
        System.out.println("What is C?");
        cX = kbReader.nextDouble();
        oX = ((-bX + Math.sqrt(Math.pow(bX,2)-(4*aX*cX)))/(2*aX));
        tX = ((-bX - Math.sqrt(Math.pow(bX,2)-(4*aX*cX)))/(2*aX));
        System.out.println("X can equal " + oX + " or " + tX +".");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
    else if(response.equalsIgnoreCase("!end")
           || response.equalsIgnoreCase("end")
            || response.equalsIgnoreCase("!close")
            || response.equalsIgnoreCase("close"))
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ending Program");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.exit(0);
    }
    else if (response.equalsIgnoreCase("!reset"))
    {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
        formulaSolver();
    }
    else if (response.equalsIgnoreCase("!classgen"))
    {
        Random rand = new Random();
        ranNum = rand.nextInt(9) + 0;
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if(ranNum == 0)
        {
            System.out.println("Pick Rogue"); 
        }
        else if(ranNum == 1)
        {
            System.out.println("Pick Shaman") ;
        }
        else if(ranNum == 2)
        {
            System.out.println("Pick Druid") ;
        }
        else if(ranNum == 3)
        {
            System.out.println("Pick Mage") ;
        }
        else if(ranNum == 4)
        {
            System.out.println("Pick Warrior") ;
        }
        else if(ranNum == 5)
        {
            System.out.println("Pick Warlock") ;
        }
        else if(ranNum == 6)
        {
            System.out.println("Pick Priest") ;
        }
        else if(ranNum == 7)
        {
            System.out.println("Pick Paladin") ;
        }
        else if(ranNum == 8)
        {
            System.out.println("Pick Hunter");
        }
        else
        {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
   
        
    
    else if(response.equalsIgnoreCase("!code"))
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("view code at https://gist.github.com/iblacksand/2a64cf9a10bdc527483c");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
        
    else if(response.equalsIgnoreCase("!trigCalc"))
    {
        this.x = 0;
        this.y = 0;
        System.out.println("What do you want to solve for(Sin,Cos,Tan,aSin, aTan or aCos)");
        response = kbReader.nextLine();
        if(response.equalsIgnoreCase("!sin")
          || response.equalsIgnoreCase("sin"))
            {
            System.out.println("What is your angle?");
            x = kbReader.nextDouble();
            
            System.out.println(Math.sin(x));
            formulaSolver();
        }
        else if(response.equalsIgnoreCase("!tan")
          || response.equalsIgnoreCase("tan"))
            {
            System.out.println("What is your angle");
            x = kbReader.nextDouble();
           
            System.out.println(Math.tan(x));
            formulaSolver();
        }
         else if(response.equalsIgnoreCase("!cos")
          || response.equalsIgnoreCase("cos"))
            {
            System.out.println("What is your angle?");
            x = kbReader.nextDouble();
            
            System.out.println(Math.cos(x));
             formulaSolver();
        }
         else if(response.equalsIgnoreCase("!aTan")
          || response.equalsIgnoreCase("aTan"))
            {
            System.out.println("What is your opposite?");
            x = kbReader.nextDouble();
            System.out.println("What is your adjacent?");
            y = kbReader.nextDouble();
            System.out.println(Math.toDegrees(Math.atan(x/y)));
             formulaSolver();
        }
         else if(response.equalsIgnoreCase("!asin")
          || response.equalsIgnoreCase("asin?"))
            {
            System.out.println("What is your opposite?");
            x = kbReader.nextDouble();
            System.out.println("What is your hypotenuse?");
            y = kbReader.nextDouble();
            System.out.println(Math.toDegrees(Math.asin(x/y)));
             formulaSolver();
        }
         else if(response.equalsIgnoreCase("!acos")
          || response.equalsIgnoreCase("acos"))
            {
            System.out.println("What is your adjacent?");
            x = kbReader.nextDouble();
            System.out.println("What is your hypotenuse");
            y = kbReader.nextDouble();
            System.out.println(Math.toDegrees(Math.acos(x/y)));
        }
        
    }
        
    else
    {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("ERROR NOT A COMMAND");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        formulaSolver();
    }
        return reply;
    }
}
