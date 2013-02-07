package tum.test.dao;

import org.springframework.data.domain.Persistable;

import java.util.Date;

/**

 *
 */
public class Comment implements Persistable<Integer> {

    private Integer id;
    private String userName;
    private String contents;
    private Date createdTime;

    public Comment(Integer id, String userName, String contents, Date createdTime) {
        this.id = id;
        this.userName = userName;
        this.contents = contents;
        this.createdTime = createdTime;
    }

    public Comment() {

    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getId() == null;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
