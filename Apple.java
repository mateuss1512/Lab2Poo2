package Lab2.factorysingleton;

class Apple implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {

        if (modelo == "IphoneX") {
            return new IphoneX();
        }
        return null;
    }

}
