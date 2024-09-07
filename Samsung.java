package Lab2.factorysingleton;

public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {

        if (modelo == "Galaxy") {
            return new Galaxy();
        }
        return null;
    }
}
