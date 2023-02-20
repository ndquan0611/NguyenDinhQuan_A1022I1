package ss00_java.generics;

public class Book<K, V, I, T> extends Dictionary<K, V> implements Writer<T> {
    private I info; // khởi tạo thêm tham số generic

    public Book(K key, V value) {
        super(key, value);
    }

    public Book(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

    @Override
    public void update(T obj) {

    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public void write(T obj) {

    }
}
