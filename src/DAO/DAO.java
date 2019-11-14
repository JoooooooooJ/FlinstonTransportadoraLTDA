package DAO;

import java.util.Collection;

public interface DAO<T> {
    
    public void add(Object obj);
    
    public void remove(Object obj);
    
    public void update(Object obj);
    
    public Object read(Object obj);
    
    public Collection<T> getList();
    
}
