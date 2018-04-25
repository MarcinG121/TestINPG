public class BusinessCardDemo {
    public static void main(String[] args){
        BusinessCard moja = new BusinessCard("Marcin", "Gargala", "Rakszawa", 2257566);
        moja.print();
        moja.setCity("Krakow");
        moja.print();

    }
}
