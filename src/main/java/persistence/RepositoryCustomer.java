package persistence;

import java.util.List;
import javax.persistence.EntityManager;
import model.Customer;
import util.DBUtil;

public class RepositoryCustomer {

    private EntityManager em;

    public RepositoryCustomer() {
        em = DBUtil.getEntityManager();
    }

    public List<Customer> listAllCustomers() {
        return em.createQuery("Select f from Customer as f order by f.firstName asc")
                .getResultList();
    }

    public void updateStockProduct(int customerId, int newStatus) {
        em.getTransaction().begin();
        int result = em.createQuery("UPDATE Customer p SET p.accountStatus = :newValue WHERE p.id = :id")
                .setParameter("newValue", newStatus)
                .setParameter("id", customerId)
                .executeUpdate();
        if (result > 0) {
            System.out.println("\nCustomer status updated with success.");
        }
        em.getTransaction().commit();
    }

    public Customer findCustomerById(int id) {
        return em.find(Customer.class, id);
    }

    //READ
    //https://www.baeldung.com/hibernate-aggregate-functions
    public long getTotalCustomerActives() {
        return (long) em.createQuery("SELECT count(c) from Customer c WHERE c.accountStatus = 1")
                .getSingleResult();
    }

    public List<Object[]> getTotalCustomerActivesAndNotActives() {
        String sql = "SELECT c.accountStatus, count(c) from Customer c GROUP BY c.accountStatus";
        return em.createQuery(sql).getResultList();
    }
}
