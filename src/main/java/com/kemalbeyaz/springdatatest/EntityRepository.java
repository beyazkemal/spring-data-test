package com.kemalbeyaz.springdatatest;

import com.kemalbeyaz.springdatatest.model.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Kemal BEYAZ
 * @created 02/11/2019
 */
@NoRepositoryBean
public interface EntityRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
}
