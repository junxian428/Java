/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



class Jess{
    
    String title;
    String genre;
    int rating;
    
    void playIt(){
        
        System.out.println("playing the movie");
    }
    
}
public class Main
{
	public static void main(String[] args) {
	   Jess one = new Jess();
	   one.title = "Gone with the stock";
	   one.genre = "Tragic";
	   one.rating = -2;
	   
	   Jess two = new Jess();
	   two.title = "Lost in Cubicle Space";
	   two.genre = "Comedy";
	   two.rating = 5;
	   two.playIt();
	   
	   Jess three = new Jess();
	   three.title = "Byte Club";
	   three.genre = "Tragic but ultimtely uplifing";
	   three.rating = 127;
		
	}
}
