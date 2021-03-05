import java.util.Iterator;

/**
 * @Author Zelex
 * @Date 2021/1/14 15:21
 * @Version 1.0
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException { //仅对directory有效，因此后期在directory中重写
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName()+" (" +getSize()+") ";
    }
}
