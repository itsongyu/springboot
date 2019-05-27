package com.syx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@PropertySource加载指定的配置文件；
@Component
@ConfigurationProperties(prefix = "empoyee")
@PropertySource(value = {"classpath:empoyee.properties"})
public class Empoyee {

    private String eName;
    private int age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteName() {
        return eName;
    }

    public String getName() {
        return eName;
    }

    public int getAge() {
        return age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setName(String name) {
        this.eName = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + eName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
