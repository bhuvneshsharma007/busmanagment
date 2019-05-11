
package Dao;

import Bean.Bus;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PURU
 */
public interface BusDeclaration {
    public long insertBus(Bus st);
    public long upDate(long id,Bus st);
    public boolean deleteinfo(long id);
    public Bus selectBus(long id);
    public List selectAllBus();
    public ArrayList searchByName(String name);
    
}


