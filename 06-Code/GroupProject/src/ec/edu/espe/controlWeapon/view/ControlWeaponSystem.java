package ec.edu.espe.controlWeapon.view;

import ec.edu.espe.controlWeapon.model.Ammunition;
import ec.edu.espe.controlWeapon.model.Explosive;
import ec.edu.espe.controlWeapon.model.WarMaterial;

/**
 *
 * @author ASUS
 */
public class ControlWeaponSystem {
        public static void main(String[] args) {
            System.out.println(" ------->Alexander Ruano<-----");
            Ammunition ammunition= new Ammunition();
            WarMaterial warMaterial=new WarMaterial();
            System.out.println("Ammunition is ---> " + ammunition);
            System.out.println("WarMaterial is ---> " + warMaterial);
            
            System.out.println("------->Leandro Quinga<-------");
            Explosive explosive = new Explosive();
            System.out.println("Exolisive is ---> "+explosive);
           
            
        }
}