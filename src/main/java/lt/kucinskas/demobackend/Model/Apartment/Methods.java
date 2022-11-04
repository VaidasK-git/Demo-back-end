package lt.kucinskas.demobackend.Model.Apartment;

import lt.kucinskas.demobackend.Model.Picture.Picture;

public interface Methods {
    default public void add() {}
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
