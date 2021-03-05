/**
 * @Author Zelex
 * @Date 2021/1/14 15:21
 * @Version 1.0
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");
    }
    public abstract void printList(String prefix);
    public String toString(){
        return getName()+" (" +getSize()+") ";
    }
}
