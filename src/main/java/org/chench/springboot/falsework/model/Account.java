package org.chench.springboot.falsework.model;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.model.Account
 * @date 8/24/19 3:47 PM
 */
public class Account {
    private long id = -1;
    private String name = "";
    private String email = "";
    private long ctime = -1;
    private long mtime = -1;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    public long getMtime() {
        return mtime;
    }

    public void setMtime(long mtime) {
        this.mtime = mtime;
    }
}
