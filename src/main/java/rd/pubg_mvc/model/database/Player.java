package rd.pubg_mvc.model.database;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Player {

    @Id
    @Column(name="accountid")
    private String accountId;

    @Column(name="name")
    private String playerName;

    @Column(name="last_modified")
    private LocalDateTime lastModified;


    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public LocalDateTime getLastModified() {
        return lastModified;
    }
    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }
    public String getLastModifiedAsString() {
        return this.lastModified.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }


    @Override
    public String toString() {
        return "Player [accountId=" + accountId + ", playerName=" + playerName + ", lastModified=" + lastModified + "]";
    }
    
}
