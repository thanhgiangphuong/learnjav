package TinhDaHinh;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.makeSound();
        myDog.makeSound();
        myPig.makeSound();
        System.out.println("-------------------");

        System.out.println("Enter payment type: ");
        PaymentGateway paymentGateway = null;

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if (inputString.equals("Visa")) {
            paymentGateway = new VisaCard();
        } else if (inputString.equals("Master")) {
            paymentGateway = new MasterCard();
        } else if (inputString.equals("Amex")) {
            paymentGateway = new AmexCard();
        } else {
            System.out.println("Vui lòng nhập lại! Chỉ được chọn Master / Visa hoặc Amex");
        }
        if(paymentGateway != null){
            paymentGateway.payment();
        }
    }
}

            
        
        
