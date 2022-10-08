/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex04taubaniqued;

public class Singer {
    public String name;
    public int noOfPerformances = 0, audience;
    public double performanceEarnings = 0;
    private double earnings = 0;
    public Song favoriteSong;
    public static int totalPerformances = 0;
   
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.favoriteSong = favoriteSong;
    }
    
    public String getName(){
        return name;
    }
    
    public int getTotalPerformances(){
        return totalPerformances;
    }
    
    public void performForAudience(int audience){
        earnings += 100*audience;
        noOfPerformances++;
        totalPerformances++;
    }
    
    public void performForAudience (Singer otherSinger, int audience){
        String otherSingerName = otherSinger.getName();
        performanceEarnings = (100*audience)/2;
        earnings += performanceEarnings;
        otherSinger.earnings += performanceEarnings;
        noOfPerformances++;
        otherSinger.noOfPerformances++;
        totalPerformances += 2;
        System.out.printf("%nSPLIT PERFORMANCE%nNames: %s, %s%nEarnings for Each Singer: %s%n", 
                name, otherSingerName, performanceEarnings);
    }
    
    public void changeFavSong(Song faveSongName){
        favoriteSong = faveSongName;
    }
    
    public static void numberOfTotalPerformances(){
        System.out.printf("%nTOTAL PERFORMANCES%nNumber of Total Performances: %s%n", totalPerformances);
    }
    
    public void singerData(){
        System.out.printf("%nSINGER%nName: %s%nFavorite Song: %s%nNo. of Performances: %s%nEarnings: %s%n", 
                name, favoriteSong.songName, noOfPerformances, earnings);
    }
}