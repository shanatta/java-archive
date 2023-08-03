import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze extends World
{

    /**
     * Constructor for objects of class Maze.
     * 
     */
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(285, 251, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Emma emma = new Emma();
        addObject(emma,34,213);
        emma.setLocation(25,223);
        Heart heart = new Heart();
        addObject(heart,140,144);
        heart.setLocation(28,102);
        Heart heart2 = new Heart();
        addObject(heart2,139,127);
        heart2.setLocation(73,23);
        Heart heart3 = new Heart();
        addObject(heart3,117,159);
        heart3.setLocation(143,222);
        Heart heart4 = new Heart();
        addObject(heart4,220,69);
        heart4.setLocation(119,134);
        Heart heart5 = new Heart();
        addObject(heart5,192,108);
        heart5.setLocation(180,61);
        Heart heart6 = new Heart();
        addObject(heart6,241,134);
        heart6.setLocation(255,125);
    }
}
