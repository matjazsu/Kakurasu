/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kakurasu;

import java.util.Random;

/**
 * Simple class for generating kakurasu solutions
 * See: https://www.brainbashers.com/kakurasuhelp.asp#w1
 */
public class Solutions {
    
    private int m_numOfSolutions = 3;    
    private String[][] solution1 = new String[][]{
        new String[] {"","1","2","3","4","5",""},
        new String[] {"1","B","B","B","B","B","15"},
        new String[] {"2","","B","B","","B","10"},
        new String[] {"3","","B","","B","B","11"},
        new String[] {"4","","B","","","","2"},
        new String[] {"5","","","B","","","3"},
        new String[] {"","1","10","8","4","6",""},
    };
    private String[][] solution2 = new String[][]{
        new String[] {"","1","2","3","4","5",""},
        new String[] {"1","B","B","B","","B","11"},
        new String[] {"2","B","","B","B","","8"},
        new String[] {"3","","B","B","","","5"},
        new String[] {"4","","B","","","B","7"},
        new String[] {"5","","","B","B","","7"},
        new String[] {"","3","8","11","7","5",""},
    };
    private String[][] solution3 = new String[][]{
        new String[] {"","1","2","3","4","5",""},
        new String[] {"1","","B","B","","B","10"},
        new String[] {"2","B","B","","","","3"},
        new String[] {"3","","","","B","","4"},
        new String[] {"4","B","B","B","B","B","15"},
        new String[] {"5","B","B","","","","3"},
        new String[] {"","11","12","5","7","5",""},
    };
    
    public String[][] getRandomSolution(){
        Random rand = new Random();
        int randNumber = rand.nextInt(this.m_numOfSolutions) + 1;
        
        if(randNumber == 1){
            return solution1;
        }
        else if(randNumber == 2){
            return solution2;
        }
        else{
            return solution3;
        }
    }    
}
