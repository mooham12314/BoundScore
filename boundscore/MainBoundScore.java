/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundscore;

import java.util.Scanner;

/**
 *
 * @author mooham12314
 */
public class MainBoundScore {
    public static void main(String[] args){
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        Scanner input = new Scanner(System.in);
        String currentScore = input.nextLine();
        while(!currentScore.equals(""))
        {
                mySource.setValue(currentScore);
                System.out.print("Enter Score : ");
                currentScore = input.nextLine();
        }
}
}
