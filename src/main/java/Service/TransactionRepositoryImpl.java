package Service;

import Repository.CrudRepository;

import java.util.List;
import java.util.function.Predicate;

public class TransactionRepositoryImpl<T ,ID> implements CrudRepository<T , ID> {


    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public T get(ID id) {
        return null;
    }

    @Override
    public List<T> get(Predicate<T> predicate) {
        return null;
    }
}
