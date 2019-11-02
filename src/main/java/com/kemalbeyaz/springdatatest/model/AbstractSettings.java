package com.kemalbeyaz.springdatatest.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Kemal BEYAZ
 * @created 01/11/2019
 */
@MappedSuperclass
public class AbstractSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fieldName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        return "AbstractSettings{" +
                "id=" + id +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}
