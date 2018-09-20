package catandmouse.services;

public class MoveCatService {

    int jumpCat = 3;
    /**
     * Suivant la position le chat attrape t'il la souris ?
     *
     * @param position position du chat face à la souris
     * @return string : indique si la souris est attapée ou enfuit
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

        int distance = position.length() - 2;

        if(distance > jumpCat){
            return "Escaped!";
        }else{
            return "Caught!";
        }
    }
}
