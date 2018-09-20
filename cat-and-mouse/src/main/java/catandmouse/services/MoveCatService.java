package catandmouse.services;

public class MoveCatService {

    /**
     * Suivant la position le chat attrape t'il la souris ?
     *
     * @param position position du chat face à la souris
     * @return
     */
    public String attack(String position) throws Exception {
        char cat = position.charAt(0);
        if(cat != 'C'){
            throw new Exception();
        }

        char mouse = position.charAt(position.length()-1);
        if(mouse != 'm'){
            throw new Exception();
        }

        return "";
    }
}
