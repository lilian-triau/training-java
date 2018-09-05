/**
 * Service permettant de savoir qu'elle "output" afficher dans la console
 * FIXME : Copier/coller du service de main : faire des "packages" ?
 */
public class OutputService {

    /**
     * Constructeur
     */
    public OutputService() {

    }

    /**
     * Affiche l'output dans la console suivant un nombre
     *
     * @param int number nombre
     */
    public String outputNumber(int number) {
        String output = "";

        //Surchage de l'output si cas particulier

        //modulo de 3
        if (number % 3 == 0) {
            output += "Fizz";
        }

        //modulo de 5
        if(number % 5 == 0) {
            output += "Buzz";
        }

        //si l'output est toujours vide, affiche le nombre
        if(output == ""){
            output = String.valueOf(number);
        }

        return output;
    }
}