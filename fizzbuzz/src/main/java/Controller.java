public class Controller{

    /**
     * Compte de 1 à 100 est affiche le résulat
     *
     * @param output
     */
    public void oneToHundred(){
        OutputService outputService = new OutputService();
        for (int number = 1; number < 100; number++) {
            String output = outputService.outputNumber(number);
            View view = new View();
            view.displayInConsole(output);
        }
    }
}