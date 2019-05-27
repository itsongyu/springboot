package com.syx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 1.默认从全局配置文件 application.yml中获取值；
 * 2.将配置文件中配置的每一个属性的值，映射到这个组件中
 *  @ConfigurationProperties：告诉SpringBoot将配置文件中相关的属性注入本类中的属性中；
 *  prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 */

@Component
// @Component 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
@ConfigurationProperties(prefix = "user")
public class User {

    private  String name;
    private  int age;
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
    public String getName() {
        return name;
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
        this.name = name;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
