/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex04taubaniqued;

public class Song {
    public String songName, singer, genre, status = "Paused";
    public int length;
        
    public Song (String songName, String singer, String genre, int length){
        this.songName = songName;
        this.singer = singer;
        this.genre = genre;
        this.length = length;
    }
    
    public void play(){
        status = "Playing";
        System.out.printf("%nSONG STATUS%nName: %s%nStatus: %s%n", songName, status);
    }
    
    public void pause(){
        status = "Paused";
        System.out.printf("%nSONG STATUS%nName: %s%nStatus: %s%n", songName, status);
    }
   
    public void songData(){
        System.out.printf("%nSONG%nName: %s%nSinger: %s%nGenre: %s%nLength: %s seconds%n", 
                songName, singer, genre, length);
    }
    
}