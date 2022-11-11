import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Tyrese Senior
 * @version 1.0
 */
public class Mario extends Actor
{
    private GreenfootImage image;
    
    public Mario()
    {
        image = getImage();
        image.scale(30, 30);
    }
}
