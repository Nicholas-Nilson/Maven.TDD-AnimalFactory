package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given
        Dog testDog = new Dog("Marlow", null, 4);
        DogHouse.add(testDog);
        //When
        Dog actualDog = DogHouse.getDogById(4);
        //Then
        Assert.assertEquals(testDog, actualDog);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeDogTest() {
        //Given
        Dog testDog = new Dog("Alfalfa", null, 13);
        DogHouse.add(testDog);
        DogHouse.remove(13);
        //When
        Dog actualDog = DogHouse.getDogById(13);
        //Then
        Assert.assertNull(actualDog);
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDogByNameTest() {
        //Given
        Dog testDog = new Dog("Alfalfa", null, 13);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        //When
        Dog actualDog = DogHouse.getDogById(13);
        //Then
        Assert.assertNull(actualDog);
    }



    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest() {
        //Given
        Dog testDog = new Dog("Alfalfa", null, 13);
        Dog testDog2 = new Dog("Sprinkle", null, 12);
        DogHouse.add(testDog);
        DogHouse.add(testDog2);
        //When
        Dog actualDog = DogHouse.getDogById(12);
        //Then
        Assert.assertEquals(testDog2, actualDog);
    }
        // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfCDog() {
        //Given
        Dog testDog = new Dog("Athos", null, 1);
        Dog testDog2 = new Dog("D'artagnan", null, 4);
        Dog testDog3 = new Dog("Porthos", null, 3);
        Dog testDog4 = new Dog("Aramis", null, 2);
        DogHouse.add(testDog);
        DogHouse.add(testDog2);
        DogHouse.add(testDog3);
        DogHouse.add(testDog4);
        int expected = 4;
        //When
        int actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
