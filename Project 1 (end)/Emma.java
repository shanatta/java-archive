import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Emma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Emma extends Actor
{
    /**
     * Act - do whatever the Emma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Emma()
    {
        getImage().scale(getImage().getWidth() / 38 , getImage().getHeight() / 38);
    }
    public void act() 
    {
        moveAround();
        hitHeart();
    }  
    public void moveAround() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        { 
            setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() -3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() +3);
        }
    }
    public void hitHeart()
    {
        if ( isTouching(Heart.class) )
        {
            removeTouching(Heart.class);
            Greenfoot.playSound("Heart Sound.mp3");
        }
    }         
}