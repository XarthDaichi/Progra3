import java.util.*;

public class What{ 
	public static void main( String[] args ){
		int x,y;
		Random rand = new Random();
		x=rand.nextInt(5);
		y=rand.nextInt(9);
		System.out.printf( "x: %d y:%d \n", x,y ); 
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.printf( "x: %d y:%d \n", x,y ); 
	} 
}