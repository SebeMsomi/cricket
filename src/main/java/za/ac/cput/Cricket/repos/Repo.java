package za.ac.cput.Cricket.repos;

public interface Repo<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);

   // Set<Cricket> getAll();


}
