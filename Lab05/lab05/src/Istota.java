class Istota {
    public Istota() {
        System.out.println("Tworzenie instancji klasy Istota");
    }
}

class Czlowiek extends Istota {
    public Czlowiek() {
        super();
        System.out.println("Tworzenie instancji klasy Czlowiek");
    }
}

class Programista extends Czlowiek {
    public Programista() {
        super();
        System.out.println("Tworzenie instancji klasy Programista");
    }
}