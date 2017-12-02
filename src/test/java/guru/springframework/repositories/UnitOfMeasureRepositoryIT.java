package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ujwal-mac on 11/25/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findByDescription() throws Exception {
        Optional<UnitOfMeasure> ofMeasureOptional =unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon",ofMeasureOptional.get().getDescription());

    }

}