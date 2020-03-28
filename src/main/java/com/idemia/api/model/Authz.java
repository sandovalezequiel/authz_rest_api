package com.idemia.api.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Authz {

    @Id
    private String oxId;
    private String oxAuthUserId;
    @ElementCollection
    @CollectionTable(name="scopes")
    private List<String> oxAuthScope;
    private String objectClass;
    private Boolean del;
    private String dn;
    private String oxAuthClientId;

    public String getOxId() {
        return oxId;
    }

    public void setOxId(String oxId) {
        this.oxId = oxId;
    }

    public String getOxAuthUserId() {
        return oxAuthUserId;
    }

    public void setOxAuthUserId(String oxAuthUserId) {
        this.oxAuthUserId = oxAuthUserId;
    }

    public List<String> getOxAuthScope() {
        return oxAuthScope;
    }

    public void setOxAuthScope(List<String> oxAuthScope) {
        this.oxAuthScope = oxAuthScope;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getOxAuthClientId() {
        return oxAuthClientId;
    }

    public void setOxAuthClientId(String oxAuthClientId) {
        this.oxAuthClientId = oxAuthClientId;
    }
}