package br.com.utfpr.dao;

import java.util.Collection;

public interface Dao<T> {
    
    public void add(Object obj);
    
    public void remove(Object obj);
    
    public void update(Object obj);
    
    public Object read(long id);
    
    public Collection<T> getList();
    
}
