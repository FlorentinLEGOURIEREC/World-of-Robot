import java.util.Random;
/**
 * Write a description of class rainbowRobot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class knightRobot extends RobotG
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class rainbowRobot
     */
    public knightRobot(String nameRobot, int dir, int x, int y)
    {
        super(nameRobot,dir,x,y);
    }
    
    /**
     * Redéfinition de la méthode avancer pour que le robot avance de en L.
     */
    @Override
    public void avancer()  {
        Random random = new Random();
        int newDirection = random.nextInt(2) * 2; // Génère 0 ou 2 de manière aléatoireu 3)
         // Change la direction du robot
        super.avancer(); super.avancer();super.avancer();
        setDirection(newDirection);
        super.avancer();// Appelle la méthode avancer de la classe parent (RobotG)
        
        setDirection(3);
    }
    

    
    
}
