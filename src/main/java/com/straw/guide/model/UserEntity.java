package com.straw.guide.model;

import javax.persistence.*;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Entity
@Table(name = "u_user", schema = "guide", catalog = "")
public class UserEntity {
    private String id;
    private String userName;
    private Integer type;
    private String passWord;
    private String nickName;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "pass_word")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        return result;
    }
}
