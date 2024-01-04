package rd.pubg_mvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import rd.pubg_mvc.model.DTO.PlayerDTO;
import rd.pubg_mvc.model.database.Player;
import rd.pubg_mvc.model.database.Totals;

@Repository
public class DbAccess {

    @Autowired
    private HibernateUtil hbUtil;


    public boolean checkIfPlayerAlreadyInDbByName(String playerName) {

        boolean playerExists = false;

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        NativeQuery<Player> q = session.createNativeQuery("SELECT * FROM players WHERE name = ?1", Player.class);
        q.setParameter(1, playerName);

        List<Player> players = q.getResultList();

        tx.commit();
        session.close();

        if(players.size() > 0) {
            playerExists = true;
        }

        return playerExists;
    }


    public boolean checkIfPlayerAlreadyInDbById(String accountId) {

        boolean playerExists = false;

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        Player player = session.get(Player.class, accountId);

        tx.commit();
        session.close();

        if(player != null) {
            playerExists = true;
        }

        return playerExists;
    }


    public List<Player> getAllPlayers() {

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        Query<Player> q = session.createQuery("SELECT p FROM Player p", Player.class);

        List<Player> players = q.getResultList();

        tx.commit();
        session.close();

        return players;
    }


    public void persistPlayer(Player player) {

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.persist(player);

        tx.commit();
        session.close();
    }


    public void mergePlayer(Player player) {

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.merge(player);

        tx.commit();
        session.close();
    }


    private Totals getTotalsByAccountId(String accountId) {

        Totals totals = null;

        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        Query<Totals> q = session.createQuery("SELECT t FROM Totals t WHERE t.accountId = ?1", Totals.class);
        q.setParameter(1, accountId);

        List<Totals> totalsList = q.getResultList();

        tx.commit();
        session.close();

        if(totalsList.size() == 1) {
            totals = totalsList.get(0);
        }

        return totals;
    }

    public Totals getTotalsByPlayerDTO(PlayerDTO playerDTO) {
        return this.getTotalsByAccountId(playerDTO.getAccountId());
    }
    

    public void persistTotals(Totals totals) {
        
        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.persist(totals);

        tx.commit();
        session.close();
    }

    public void mergeTotals(Totals totals) {
        
        Session session = hbUtil.getSession();
        Transaction tx = session.beginTransaction();

        Query<Totals> q = session.createQuery("SELECT t FROM Totals t WHERE accountid = ?1", Totals.class);
        q.setParameter(1, totals.getAccountId());

        List<Totals> totalsList = q.getResultList();

        if(totalsList.size() == 1) {

            totals.setId(totalsList.get(0).getId());

            session.merge(totals);
        }

        tx.commit();
        session.close();
    }
}
