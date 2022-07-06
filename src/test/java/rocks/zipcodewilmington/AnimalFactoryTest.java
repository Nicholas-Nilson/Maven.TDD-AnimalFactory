package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        //Given
        Date expectedBirthdate = new Date();
        String expectedName = "Pim";
        //When
        Dog testDog = AnimalFactory.createDog(expectedName, expectedBirthdate);
        String actualName = testDog.getName();
        Date actualBirthDate = testDog.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        //Given
        Date expectedBirthdate = new Date();
        String expectedName = "Mop";
        //When
        Cat testCat = AnimalFactory.createCat(expectedName, expectedBirthdate);
        String actualName = testCat.getName();
        Date actualBirthDate = testCat.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthDate);
    }


}
