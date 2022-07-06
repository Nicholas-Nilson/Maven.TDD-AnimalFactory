package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog  .getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testDogSpeak() {
        //Given
        String expected = "bark!";

        //When (cat instanced and speaks)
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 01);
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testCatSetBirthDate() {
        //Given
        Date expected = new Date();

        //When (cat instanced and speaks)
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 01);
        dog.setBirthDate(date);
        Date actual = dog.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testDogEatSomeFood() {
        //Given
        Food food = new Food();
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 01);
        int mealsEatenBeforeFeed = dog.getNumberOfMealsEaten();
        int expected = mealsEatenBeforeFeed + 1;

        //When (cat is fed))
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testDogGetID() {
        //Given
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 99);
        int expected = 99;

        //When (cat is fed))
        int actual = dog.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testDogInheritsAnimal() {
        //Given
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 99);
        boolean expected = true;

        //When (cat is fed))
        boolean actual = (dog instanceof Animal);
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testDogInheritsMammal() {
        //Given
        Date date = new Date();
        Dog dog = new Dog("Dog", date, 99);
        boolean expected = true;

        //When (cat is fed))
        boolean actual = (dog instanceof Mammal);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
