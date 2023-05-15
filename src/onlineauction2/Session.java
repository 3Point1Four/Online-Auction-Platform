/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineauction2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author dhyan
 */
@Entity
@Table(name = "session", catalog = "onlineauction", schema = "")
@NamedQueries({
    @NamedQuery(name = "Session.findAll", query = "SELECT s FROM Session s")
    , @NamedQuery(name = "Session.findBySessionID", query = "SELECT s FROM Session s WHERE s.sessionID = :sessionID")
    , @NamedQuery(name = "Session.findByDate", query = "SELECT s FROM Session s WHERE s.date = :date")
    , @NamedQuery(name = "Session.findByWinnerid", query = "SELECT s FROM Session s WHERE s.winnerid = :winnerid")
    , @NamedQuery(name = "Session.findByInvoice", query = "SELECT s FROM Session s WHERE s.invoice = :invoice")})
public class Session implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "session_ID")
    private Integer sessionID;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "Winner_id")
    private Integer winnerid;
    @Column(name = "Invoice")
    private String invoice;

    public Session() {
    }

    public Session(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public Session(Integer sessionID, Date date) {
        this.sessionID = sessionID;
        this.date = date;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        Integer oldSessionID = this.sessionID;
        this.sessionID = sessionID;
        changeSupport.firePropertyChange("sessionID", oldSessionID, sessionID);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Integer getWinnerid() {
        return winnerid;
    }

    public void setWinnerid(Integer winnerid) {
        Integer oldWinnerid = this.winnerid;
        this.winnerid = winnerid;
        changeSupport.firePropertyChange("winnerid", oldWinnerid, winnerid);
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        String oldInvoice = this.invoice;
        this.invoice = invoice;
        changeSupport.firePropertyChange("invoice", oldInvoice, invoice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionID != null ? sessionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Session)) {
            return false;
        }
        Session other = (Session) object;
        if ((this.sessionID == null && other.sessionID != null) || (this.sessionID != null && !this.sessionID.equals(other.sessionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "onlineauction2.Session[ sessionID=" + sessionID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
