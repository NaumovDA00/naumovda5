package N53;

public class Call {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7 977 123 1234","Samsung",0.5f);
        Phone phone2 = new Phone("+7 977 456 1234","Sony",0.4f);
        Phone phone3 = new Phone("+7 977 789 1234","Nokia",0.45f);

        System.out.println();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println();

        System.out.println(phone1.receiveCall("Витя"));
        System.out.println(phone2.receiveCall("Паша"));
        System.out.println(phone3.receiveCall("Даша"));

        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println();

        System.out.println(phone1.receiveCall("Витя","+7 977 345 2356"));
        System.out.println(phone2.receiveCall("Паша","+7 977 756 2435"));
        System.out.println(phone3.receiveCall("Даша","+7 977 675 9876"));

        System.out.println();

        String[] numbers = {"4091","112","911"};
        Phone.sendMessage(numbers);


    }
}
