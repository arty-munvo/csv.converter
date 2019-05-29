package models;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserConstructor() throws Exception {
        User expectedUser = new User("Arty", "Skliar", "artsoim.sk@gmail.com", 22);
        User actualUser = new User("Arty", "Skliar", "artsoim.sk@gmail.com", 22);
        Assert.assertEquals(expectedUser.toString(), actualUser.toString());
        Assert.assertEquals(expectedUser.getFirstName(), actualUser.getFirstName());
        Assert.assertEquals(expectedUser.getLastName(), actualUser.getLastName());
        Assert.assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        Assert.assertEquals(expectedUser.getAge(), actualUser.getAge());
    }

}
