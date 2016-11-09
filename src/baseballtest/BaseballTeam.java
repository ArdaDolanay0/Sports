/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author ardol7945
 */
public class BaseballTeam extends Sports implements Stats{
    private int wins,loses,ties, points;
    public int getWins(){
        return wins;
    }
    public int getLoses(){
        return loses;
    }
    public int getTies(){
        return ties;
    }
    public int getPoints(){
        return points;
    }
    public int points(String stat){
        int instancePoints;
        if(stat.equalsIgnoreCase("win")){
             instancePoints = 2;
             wins += 1;
        }
        else if(stat.equalsIgnoreCase("lose")){
             instancePoints = 0;
             loses  += 1;
        }
        else{
            instancePoints = 1;
            ties += 1;
        }
        points += instancePoints;
        return instancePoints;
        
    }
    
    public int getOverallPoints(){
        return points;
    }
    
    public void setWins(int win){
        wins += win;
        points += win;
    }
    
    public void setLoses(int lose){
        loses += lose;
    }
    
    public void setTies(int tie){
        ties += tie;
        points += tie;
    }
}
