/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ex03taubaniqued;

/**
 *
 * @author boy
 */
public class Ex03TauBaniqued {

    public static void main(String[] args) {
        Jacket faveJacket = new Jacket("Favorite Jacket", "Cotton", "M", "Pink", "Plain", false, true);
        Jacket winterJacket = new Jacket("Winter Jacket", "Wool", "XXL", "Sage Green", "Knitted", false, false);
        Jacket fallJacket = new Jacket("Fall Jacket", "Denim", "L", "Navy Blue", "Stripes", true, true);
        
        faveJacket.jacketData();
        
        winterJacket.jacketData();
        
        fallJacket.jacketData();
        fallJacket.crop();
        fallJacket.uncrop();
        
        
        Song oo = new Song("O.O", "NMixx", "K-Pop & Electronic", 172);
        Song cherryWine = new Song("Cherry Wine", "Grent Perez", "R&B/Soul", 173);
        
        cherryWine.songData();
        
        oo.songData();
        oo.play();
        oo.pause();
       
        
        Singer dojaCat = new Singer("Doja Cat", cherryWine);
        dojaCat.singerData();
        
        dojaCat.performForAudience(12);
        dojaCat.changeFavSong(oo);
        dojaCat.singerData();
    }
}