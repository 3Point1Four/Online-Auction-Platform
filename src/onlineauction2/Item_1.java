/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineauction2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author dhyan
 */
@Entity
@Table(name = "item", catalog = "onlineauction", schema = "")
@NamedQueries({
    @NamedQuery(name = "Item_1.findAll", query = "SELECT i FROM Item_1 i")
    , @NamedQuery(name = "Item_1.findByProductid", query = "SELECT i FROM Item_1 i WHERE i.productid = :productid")
    , @NamedQuery(name = "Item_1.findByName", query = "SELECT i FROM Item_1 i WHERE i.name = :name")
    , @NamedQuery(name = "Item_1.findByPrice", query = "SELECT i FROM Item_1 i WHERE i.price = :price")
    , @NamedQuery(name = "Item_1.findByBuynow", query = "SELECT i FROM Item_1 i WHERE i.buynow = :buynow")
    , @NamedQuery(name = "Item_1.findBySellerid", query = "SELECT i FROM Item_1 i WHERE i.sellerid = :sellerid")
    , @NamedQuery(name = "Item_1.findByAdminid", query = "SELECT i FROM Item_1 i WHERE i.adminid = :adminid")
    , @NamedQuery(name = "Item_1.findBySessionid", query = "SELECT i FROM Item_1 i WHERE i.sessionid = :sessionid")
    , @NamedQuery(name = "Item_1.findByUnsold", query = "SELECT i FROM Item_1 i WHERE i.unsold = :unsold")
    , @NamedQuery(name = "Item_1.findByCategoryId", query = "SELECT i FROM Item_1 i WHERE i.categoryId = :categoryId")})
public class Item_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Product_id")
    private Integer productid;
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "Picture")
    private byte[] picture;
    @Column(name = "Price")
    private Integer price;
    @Column(name = "Buynow")
    private Integer buynow;
    @Column(name = "Seller_id")
    private Integer sellerid;
    @Column(name = "Admin_id")
    private Integer adminid;
    @Column(name = "Session_id")
    private Integer sessionid;
    @Column(name = "Unsold")
    private Integer unsold;
    @Column(name = "category_id")
    private Integer categoryId;

    public Item_1() {
    }

    public Item_1(Integer productid) {
        this.productid = productid;
    }

    public Item_1(Integer productid, byte[] picture) {
        this.productid = productid;
        this.picture = picture;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        Integer oldProductid = this.productid;
        this.productid = productid;
        changeSupport.firePropertyChange("productid", oldProductid, productid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        byte[] oldPicture = this.picture;
        this.picture = picture;
        changeSupport.firePropertyChange("picture", oldPicture, picture);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Integer getBuynow() {
        return buynow;
    }

    public void setBuynow(Integer buynow) {
        Integer oldBuynow = this.buynow;
        this.buynow = buynow;
        changeSupport.firePropertyChange("buynow", oldBuynow, buynow);
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        Integer oldSellerid = this.sellerid;
        this.sellerid = sellerid;
        changeSupport.firePropertyChange("sellerid", oldSellerid, sellerid);
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        Integer oldAdminid = this.adminid;
        this.adminid = adminid;
        changeSupport.firePropertyChange("adminid", oldAdminid, adminid);
    }

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        Integer oldSessionid = this.sessionid;
        this.sessionid = sessionid;
        changeSupport.firePropertyChange("sessionid", oldSessionid, sessionid);
    }

    public Integer getUnsold() {
        return unsold;
    }

    public void setUnsold(Integer unsold) {
        Integer oldUnsold = this.unsold;
        this.unsold = unsold;
        changeSupport.firePropertyChange("unsold", oldUnsold, unsold);
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        Integer oldCategoryId = this.categoryId;
        this.categoryId = categoryId;
        changeSupport.firePropertyChange("categoryId", oldCategoryId, categoryId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item_1)) {
            return false;
        }
        Item_1 other = (Item_1) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "onlineauction2.Item_1[ productid=" + productid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
