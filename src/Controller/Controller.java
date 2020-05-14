
package Controller;


import Model.Book;
import Model.Client;
import Model.Registration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author aurore
 */
public class Controller {
    public List<Client> AllClients() {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    ss.getTransaction().begin();
        List<Client> cl= ss.createQuery("from Client").list();
        ss.getTransaction().commit();
        return cl;  
    }
    public Client OneClient(int id){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    ss.getTransaction().begin();
    Client cl= (Client) ss.get(Client.class, id);
    ss.getTransaction().commit();
    return cl;
    
    }
       public void insertBook(Book b){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();
        ss.save(b);
        x.commit();
        ss.close();
    }
        public void insertClient(Client b){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();
        ss.save(b);
        x.commit();
        ss.close();
    }
    public void updateClient(Client b){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();
        ss.update(b);
        x.commit();
        ss.close();
    }
    
    public void updateBook(Book b){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();
        ss.update(b);
        x.commit();
        ss.close();
    }
    public List<Book> AllBooks(){
        List<Book> all;
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();
        Query q= ss.createQuery("from Book");
        all=q.list();
        x.commit();
        ss.close();
        return all;
    }
    public List<Book> findBc(String  name){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();

Criteria cr= ss.createCriteria(Book.class);
cr.add(Restrictions.eq("bc", name));
    List<Book> bc= cr.list();
    x.commit();
    ss.close();
    return bc;
    }
    public List<Object[]> allOps(){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Query q=ss.createSQLQuery("select clientid,dateop,bookid from client inner join book on\n" +
"        client.clientid=book.client_clientid");
    List<Object[]> ls=q.list();
     
    return ls;
    }
    public List<Book> bookByCat(String name){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Query q=ss.createQuery("from Book where bc=:name");
    q.setParameter("bc", name);
    List<Book> ls=q.list();
    return ls;
    
    }
     public List<Book> bookByDate(String date){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Query q=ss.createQuery("from Book where dateofpublication=:date");
    q.setParameter("date", date);
    List<Book> ls=q.list();
    return ls;
    
    }
    public Client clientByName(String name){
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Criteria cr=ss.createCriteria(Client.class);
    cr.add(Restrictions.eq("Fname", name));
    Client cl=(Client) cr.uniqueResult();
    return cl;
    }
    public List<Object[]>  report(String start,String end){
        List<String> ls2 =new ArrayList<>();
        ls2.add(start);
        ls2.add(end);
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Query q=ss.createSQLQuery("select clientid,dateop,bookid from client inner join book on\n" +
"        client.clientid=book.client_clientid where dateop between :start and :end");

q.setParameterList(start, ls2);
    List<Object[]> ls= q.list();
    return ls;
    }
    public Book getBook(int id){
     Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
    Criteria cr=ss.createCriteria(Book.class);
    cr.add(Restrictions.eq("bookid", id));
      Book b=(Book) cr.uniqueResult();
      x.commit();
      ss.close();
    return b;
    }
    public void updateClientremove(String date){
      Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();

        Query q=ss.createSQLQuery("delete from borrow where date=:date");
        q.setParameter("date", date);
        x.commit();
        ss.close();
    }
    List<Integer> ls2=null;
    public void updateBooks(List<Book> ls,int clid){
            Integer e;
       ls2 =new ArrayList<>();
         for (Iterator<Book> iterator = ls.iterator(); iterator.hasNext();) {
            Book next = iterator.next();
            e=next.getBookid();
            ls2.add(e);
        }
        Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction x= ss.beginTransaction();
     
    Query q=ss.createSQLQuery("update book set client_clientid=:clid where bookid in :ls2");
    x.commit();
    ss.close();
    }
   
    public void insertregister(Registration rg){
     Session ss = HibernateUtil.getSessionFactory().openSession();
      Transaction x= ss.beginTransaction();
      ss.save(rg);
      x.commit();
      ss.close();
    }
    
    public Registration getLogine(String user){
     Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction x= ss.beginTransaction();

        Criteria cr=ss.createCriteria(Registration.class);
        cr.add(Restrictions.eq("username", user));
        Registration r=(Registration) cr.uniqueResult();
        x.commit();
        ss.close();
    return r;
    }
    
    
}
