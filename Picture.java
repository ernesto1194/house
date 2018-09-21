/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Person dude;
    private Square grass;
    private Square block;
    private Square windoww;
    private Square sky;
    private Square door;
    private Square garage;
    private Square white;
    
    
    
    
   
    
    private boolean drawn;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        moon = new Circle();
        dude = new Person();
        grass = new Square();
        block = new Square(); 
        windoww = new Square();
        sky = new Square ();
        door = new Square();
        garage = new Square();
        white = new Square();
        
       
        
        drawn = false;
    }

    /**
     * Draw this picture.
     * 
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-320);
            grass.moveVertical(130);
            grass.changeSize(540);
            grass.makeVisible();
            
            sky.changeColor("blue");
            sky.moveHorizontal(-320);
            sky.moveVertical(-380);
            sky.changeSize(510);
            sky.makeVisible();
            
         
            wall.changeColor("red");
            wall.moveHorizontal(-260);
            wall.moveVertical(30);
            wall.changeSize(150);
            wall.makeVisible();
            
            garage.changeColor("red");
            garage.moveHorizontal(-110);
            garage.moveVertical(80);
            garage.changeSize(100);
            garage.makeVisible();
            
            white.changeColor("white");
            white.moveHorizontal(-98);
            white.moveVertical(105);
            white.changeSize(75);
            white.makeVisible();
            
            
            door.changeColor("black");
            door.moveHorizontal(-210);
            door.moveVertical(139);
            door.changeSize(40);
            door.makeVisible();
            
            windoww.changeColor("yellow");
            windoww.moveHorizontal(-170);
            windoww.moveVertical(40);
            windoww.changeSize(40);
            windoww.makeVisible();
            
            
            window.changeColor("yellow");
            window.moveHorizontal(-240);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            dude.makeVisible();
            dude.moveHorizontal(-190);
            dude.moveVertical(-5);
            
            block.changeColor("red");
            block.changeSize(40);
            block.moveHorizontal(-240);
            block.moveVertical(80);
            block.makeVisible();
           
    
            roof.changeColor("black");
            roof.changeSize(70, 190);
            roof.moveHorizontal(-90);
            roof.moveVertical(-60);
            roof.makeVisible();
            
           
    
            sun.changeColor("yellow");
            sun.moveHorizontal(220);
            sun.moveVertical(-120);
            sun.changeSize(100);
            sun.makeVisible();
            
            
            
           
           
            
           
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
