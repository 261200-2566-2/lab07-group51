import java.util.HashMap;
public class Main {

    public interface Set<T> {

        boolean add(T element);

        boolean contains(Object obj);

        boolean remove(Object obj);

        int size();

        void clear();

        boolean isEmpty();
    }

    public static class  MyHashSet<T> implements Set<T> {

        private final HashMap<T, Object> map;

        public MyHashSet() {
            this.map = new HashMap<>();
        }

        @Override
        public boolean add(T element) {
            return map.put(element, null) == null;
        }

        @Override
        public boolean contains(Object obj) {
            return map.containsKey(obj);
        }

        @Override
        public boolean remove(Object obj) {
            return map.remove(obj) != null;
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public boolean isEmpty() {
            return map.isEmpty();
        }
    }
}