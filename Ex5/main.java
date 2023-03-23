package Ex5;

public class main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setIndex(10265);
        adress.setCountry("Ukraine");
        adress.setCity("Kyiv");
        adress.setStreet("Nova");
        adress.setHouse("22a");
        adress.setApartment(100);

        System.out.println(adress.getIndex());
        System.out.println(adress.getCountry());
        System.out.println(adress.getCity());
        System.out.println(adress.getStreet());
        System.out.println(adress.getHouse());
        System.out.println(adress.getApartment());
    }
}
