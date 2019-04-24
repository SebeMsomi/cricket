package za.ac.cput.Cricket.repos;

import za.ac.cput.Cricket.domain.Cricket;

import java.util.Set;

public interface Repo<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(T t);

    Set<Cricket> getAll();
}
