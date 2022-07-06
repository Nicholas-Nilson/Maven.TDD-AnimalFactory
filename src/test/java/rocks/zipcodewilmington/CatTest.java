package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.net.Authenticator;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak() {
        //Given
        String expected = "meow!";

        //When (cat instanced and speaks)
        Date date = new Date();
        Cat cat = new Cat("Cat", date, 01);
        String actual = cat.speak();
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
        Cat cat = new Cat("Cat", date, 01);
        cat.setBirthDate(date);
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatEatSomeFood() {
        //Given
        Food food = new Food();
        Date date = new Date();
        Cat cat = new Cat("Cat", date, 01);
        int mealsEatenBeforeFeed = cat.getNumberOfMealsEaten();
        int expected = mealsEatenBeforeFeed + 1;

        //When (cat is fed))
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testCatGetID() {
        //Given
        Date date = new Date();
        Cat cat = new Cat("Cat", date, 99);
        int expected = 99;

        //When (cat is fed))
        int actual = cat.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testCatInheritsAnimal() {
        //Given
        Date date = new Date();
        Cat cat = new Cat("Cat", date, 99);
        boolean expected = true;

        //When (cat is fed))
        boolean actual = (cat instanceof Animal);
        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testCatInheritsMammal() {
        //Given
        Date date = new Date();
        Cat cat = new Cat("Cat", date, 99);
        boolean expected = true;

        //When (cat is fed))
        boolean actual = (cat instanceof Mammal);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
