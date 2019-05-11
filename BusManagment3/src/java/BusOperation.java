
import Bean.Bus;
import Dao.BusDeclaration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class BusOperation implements BusDeclaration{
    SessionFactory sf;
    Session ss;
    Transaction tr;
    
    public BusOperation(){
        sf=HelpingClasses.SessionFact.getSessionFact();
        ss=sf.openSession();
    }
    @Override
    public long insertBus(Bus st){
        tr=ss.beginTransaction();
        long l=(Long)ss.save(st);
        tr.commit();
        if(l>0){
            return l;
        }else{
            return 0;
        }
    }
    @Override
    public long upDate(long id,Bus st){
        tr=ss.beginTransaction();
        st.setB_id(id);
        try{
            ss.update(st);
            tr.commit();
            return id;
        }catch(Exception ex){
        }
        return 0;
    }
    @Override
    public boolean deleteinfo(long id){
        tr=ss.beginTransaction();
        Bus st=new Bus();
        st.setB_id(id);
        try{
            ss.delete(st);
            tr.commit();
            return true;
    }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    @Override
    public Bus selectBus(long id){
        Bus st=(Bus)ss.get(Bus.class, id);
        if(st!=null){
            return st;
        }
        return null;
    }
    @Override
    public List selectAllBus(){
        tr=ss.beginTransaction();
        String hql="from Bean.Bus";
        Query query=ss.createQuery(hql);
        List<Bus>li=query.list();
        ListIterator list=li.listIterator();
        if(li.size()>0){
            return li;
        }
        return null;
    } 
    @Override
    public ArrayList searchByName(String name){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long Create(Bus st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public long update(long id, Bus st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
