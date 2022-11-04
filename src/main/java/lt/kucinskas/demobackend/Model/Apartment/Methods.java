package lt.kucinskas.demobackend.Model.Apartment;

public interface Methods {

    default int count(){
        return 0;
    }
    default int countFree(){
        return 0;
    }
    default boolean isBooked(){
        return false;
    }
}
