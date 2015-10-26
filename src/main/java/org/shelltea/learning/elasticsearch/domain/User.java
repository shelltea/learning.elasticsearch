package org.shelltea.learning.elasticsearch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Xiong Shuhong(xiongsh@youyuan.com)
 *         Created on 2015/10/26.
 */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 6640576031240915350L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Integer gender;
    @Column(nullable = false)
    private String nickName;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private Integer height;
    @Column
    private Area area;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
