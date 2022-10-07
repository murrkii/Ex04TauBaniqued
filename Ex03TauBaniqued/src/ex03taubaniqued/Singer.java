/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03taubaniqued;

/**
 *
 * @author boy
 */
public class Singer {
    public String name;
    public int noOfPerformances = 0, audience;
    public double earnings = 0;
    public Song favoriteSong;
    public static int totalPerformances = 0;
   
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.favoriteSong = favoriteSong;
    }
    
    public String getName(){
    return name;
    }
        
    public void performForAudience(int audience){
        earnings += 100*audience;
        noOfPerformances++;
        totalPerformances++;
    }
    
    public void performForAudience (Singer otherSinger, int audience){
        String otherSingerName = otherSinger.getName();
        int performanceEarnings = 0;
        performanceEarnings = (100*audience)/2;
        earnings += (100*audience)/2;
        noOfPerformances++;
        totalPerformances++;
        System.out.printf("%nSPLIT PERFORMANCE%nNames: %s, %s%nEarnings for Each Singer: %s%n", name, otherSingerName, performanceEarnings);
    }
    
    public void changeFavSong(Song faveSongName){
        favoriteSong = faveSongName;
    }
    
    public void singerData(){
        System.out.printf("%nSINGER%nName: %s%nFavorite Song: %s%nNo. of Performances: %s%nEarnings: %s%n", 
                name, favoriteSong.songName, noOfPerformances, earnings);
    }
}