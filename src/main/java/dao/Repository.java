package dao;

import java.util.List;

public interface Repository {
    public String read();
    boolean update();
    boolean remove();
    boolean insert();
}
