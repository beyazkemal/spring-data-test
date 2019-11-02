package com.kemalbeyaz.springdatatest;

import com.kemalbeyaz.springdatatest.model.Person;
import com.kemalbeyaz.springdatatest.model.PersonSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kemal BEYAZ
 * @created 01/11/2019
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void testPerson() {
        System.out.println("I'm ready for test.");

        Person person = new Person();
        person.setName("Trump");

        PersonSettings personSettings = new PersonSettings();
        personSettings.setFieldName("Settings");

        person.setSettings(personSettings);

        personRepository.save(person);

        List<Person> persons = personRepository.findBySettingsFieldName("Settings");
        persons.forEach(System.out::println);
    }
}
