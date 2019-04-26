package za.ac.cput.Cricket.service;

public interface Servic <T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
