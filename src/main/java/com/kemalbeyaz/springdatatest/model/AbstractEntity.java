package com.kemalbeyaz.springdatatest.model;

import javax.persistence.*;

/**
 * @author Kemal BEYAZ
 * @created 01/11/2019
 */
@MappedSuperclass
public abstract class AbstractEntity<T extends AbstractSettings> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private T settings;

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

    public T getSettings() {
        return settings;
    }

    public void setSettings(T settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", settings=" + settings +
                '}';
    }
}
