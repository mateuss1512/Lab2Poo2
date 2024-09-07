package Lab2.factorysingleton;

public class FabricanteCelularSingleton {

    static FabricanteCelular appleInstance;
    static FabricanteCelular samsungInstance;

    public static FabricanteCelular getInstance(String fabricante){
        if (fabricante == "Apple") {
            if(appleInstance == null) {
                return new Apple();
            }
            return appleInstance;

        } else if (fabricante == "Samsung"){
            if(samsungInstance == null) {
                return new Samsung();
            }
            return samsungInstance;
        }
        return null;
    }

}
