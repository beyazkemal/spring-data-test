package com.kemalbeyaz.springdatatest;

import com.kemalbeyaz.springdatatest.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kemal BEYAZ
 * @created 01/11/2019
 */
@Repository
public interface PersonRepository extends EntityRepository<Person> {

    List<Person> findBySettingsFieldName(String fieldName);
}
