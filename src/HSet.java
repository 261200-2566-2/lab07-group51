import java.util.*;

public class HSet<E> implements Set<E> {
    private final HashMap<E,Integer> HMap = new HashMap<>();

    public HSet() { }

    @Override
    public boolean add(E element) {
        HMap.put(element,0);
        return true;
    }

    @Override
    public boolean remove(Object element) {
        return HMap.remove(element,0);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for( Object i : c){
            if(!contains(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(E i : c){
            add(i);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for(Object i : c){

        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for(Object i : c){
            remove(i);
        }
        return true;
    }

    @Override
    public boolean contains(Object element) {
        return HMap.containsKey(element);
    }

    @Override
    public int size() {
        return HMap.size();
    }

    @Override
    public void clear() {
        HMap.clear();
    }

    @Override
    public boolean isEmpty() {
        return HMap.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return HMap.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


}
