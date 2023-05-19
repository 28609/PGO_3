public class Main {
    public static void main(String[] args) {
        // Tworzenie kont gościa
        User guestUser1 = new User("jacek@gmail.com");
        User guestUser2 = new User("kowal@gmail.com");

        // Tworzenie konta użytkownika
        User user = new User("Michal", "Chmielewski", "chmielu@gmail.com", "haslo1234");

        // Konwersja konta gościa na konto użytkownika
        guestUser1.convertToUser("Jacek", "Szpakowski", "421olsah");

        // Wyświetlanie informacji o kontach
        System.out.println("Konto gościa 1:");
        System.out.println("Email: " + guestUser1.getEmail());
        System.out.println("Imię: " + guestUser1.getFirstName());
        System.out.println("Nazwisko: " + guestUser1.getLastName());
        System.out.println("Czy to konto gościa? " + guestUser1.isGuest());
        System.out.println();
        System.out.println("Konto gościa 2:");
        System.out.println("Email: " + guestUser2.getEmail());
        System.out.println("Czy to konto gościa? " + guestUser2.isGuest());
        System.out.println();
        System.out.println("Konto użytkownika:");
        System.out.println("Email: " + user.getEmail());
        System.out.println("Imię: " + user.getFirstName());
        System.out.println("Nazwisko: " + user.getLastName());
        System.out.println("Czy to konto gościa? " + user.isGuest());
    }
}

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Produkt1", 39.49, "ABC123");

        Product product2 = new Product("Produkt2", 15.99, "DEF456", 10);

        product1.changePrice(49.99);

        product2.changeQuantity(5);

        System.out.println("Produkt 1:");
        System.out.println("Nazwa: " + product1.getName());
        System.out.println("Cena: " + product1.getPrice());
        System.out.println("Kod produktu: " + product1.getProductCode());
        System.out.println("Liczba sztuk: " + product1.getQuantity());
        System.out.println();
        System.out.println("Produkt 2:");
        System.out.println("Nazwa: " + product2.getName());
        System.out.println("Cena: " + product2.getPrice());
        System.out.println("Kod produktu: " + product2.getProductCode());
        System.out.println("Liczba sztuk: " + product2.getQuantity());
    }
}