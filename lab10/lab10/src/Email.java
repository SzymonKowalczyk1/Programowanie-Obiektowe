public class Email implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Przyslano wiadomosc: "+wiadomosc);
    }
}
