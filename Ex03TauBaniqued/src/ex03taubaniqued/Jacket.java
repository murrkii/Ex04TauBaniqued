/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03taubaniqued;

/**
 *
 * @author boy
 */
public class Jacket {
    public String name, material, size, color, design, length = "Uncropped", hasZipper = "False", hasHoodie = "False";
    public boolean zipper, hoodie;
    
    public Jacket (String name, String material, String size, String color, String design, boolean zipper, boolean hoodie){
        this.name = name;
        this.material = material;
        this.size = size;
        this.color = color;
        this.design = design;
        this.zipper = zipper;
        this.hoodie = hoodie;
        
        if(zipper){
            hasZipper = "True";
        }
        
        if(hoodie){
            hasHoodie = "True";
        }
    }
    
    public void crop(){
        length = "Cropped";
        System.out.printf("%nJACKET LENGTH%nName: %s%nLength: %s%n", name, length);
    }

    public void uncrop(){
        length = "Uncropped";
        System.out.printf("%nJACKET LENGTH%nName: %s%nLength: %s%n", name, length);
    }
    
    public void jacketData(){
        System.out.printf("%nJACKET%nName: %s%nMaterial: %s%nSize: %s%nColor: %s%nDesign: "
                + "%s%nZipper: %s%nHoodie: %s%nLength: %s%n", name, material, 
                size, color, design, hasZipper, hasHoodie, length);
    }  
}