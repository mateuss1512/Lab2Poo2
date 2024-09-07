package Lab2.factorysingleton;

public class main {
    public static void main(String[] args) {

        FabricanteCelularSingleton singleton = new FabricanteCelularSingleton();
        @SuppressWarnings("static-access")
        FabricanteCelular apple = singleton.getInstance("Apple");

        @SuppressWarnings("static-access")
        FabricanteCelular samsung = singleton.getInstance("Samsung");

        Celular celularL = samsung.constroiCelular("Galaxy");
        Celular celularM = apple.constroiCelular("IphoneX");

        celularM.fazLigacao();
        celularM.tiraFoto();

        celularL.fazLigacao();
        celularL.tiraFoto();

    }

}
