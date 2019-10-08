/**
 * The main class for this project. 
 * 
 * @author Your Name
 * @since 2019-09-13
 */

package edu.frostburg.cosc310.p00;

import edu.frostburg.cosc310.datastructures.cll.Lynn_CLL;
import edu.frostburg.cosc310.animals.Bobcat;
import edu.frostburg.cosc310.animals.Bunny;

public class DuniganLifeSim {

	public static void main(String[] args) {
            Lynn_CLL circle = new Lynn_CLL();//Creates circular linked list
            Bobcat mascot = new Bobcat();//Inserts Bobcat
            Bunny carrot = new Bunny();//Inserts Bunny 
            
            circle.add(mascot);
            circle.add(carrot);
            circle.remove(mascot);
            
            mascot.speak();
            
            System.out.println(circle.toString());
            System.out.println(circle.size());
	}

}
