/**
 * Service permettant de savoir qu'elle "output" afficher dans la console
 */
public class TestOutputService {

    //constructeur
    public TestOutputService() {
        OutputService outputService = new OutputService();

        this.testIt("1 is prints the numbers", outputService.outputNumber(1).equals("1"));
        this.testIt("2 is prints the numbers", outputService.outputNumber(2).equals("2"));
        this.testIt("3 is multiples of three print \"Fizz\"", outputService.outputNumber(3).equals("Fizz"));
        this.testIt("4 is prints the numbers", outputService.outputNumber(4).equals("4"));
        this.testIt("5 is multiples of five print \"Buzz\"", outputService.outputNumber(5).equals("Buzz"));
        this.testIt("6 is multiples of three print \"Fizz\"", outputService.outputNumber(6).equals("Fizz"));
        this.testIt("7 is prints the numbers", outputService.outputNumber(7).equals("7"));
        this.testIt("8 is prints the numbers", outputService.outputNumber(8).equals("8"));
        this.testIt("9 is multiples of three print \"Fizz\"", outputService.outputNumber(9).equals("Fizz"));
        this.testIt("10 is multiples of five print \"Buzz\"", outputService.outputNumber(10).equals("Buzz"));
        this.testIt("11 is prints the numbers", outputService.outputNumber(11).equals("11"));
        this.testIt("12 is multiples of three print \"Fizz\"", outputService.outputNumber(12).equals("Fizz"));
        this.testIt("13 is prints the numbers", outputService.outputNumber(13).equals("13"));
        this.testIt("14 is prints the numbers", outputService.outputNumber(14).equals("14"));
        this.testIt("15 is multiples of both three and five print \"FizzBuzz\"", outputService.outputNumber(15).equals("FizzBuzz"));
        this.testIt("16 is prints the numbers", outputService.outputNumber(16).equals("16"));
        this.testIt("17 is prints the numbers", outputService.outputNumber(17).equals("17"));
        this.testIt("18 is multiples of three print \"Fizz\"", outputService.outputNumber(18).equals("Fizz"));
        this.testIt("19 is prints the numbers", outputService.outputNumber(19).equals("19"));
        this.testIt("20 is multiples of five print \"Buzz\"", outputService.outputNumber(20).equals("Buzz"));

    }

    public void testIt(String title, Boolean condition){
        System.out.println(title);
        if(condition){
            System.out.println("ok");
        }else{
            System.out.println("<!> ko");
        };
    }

}