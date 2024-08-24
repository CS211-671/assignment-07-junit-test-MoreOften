package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user-01", "123456");
        userList.addUser("user-02", "654321");
        userList.addUser("user-03", "qwerty");

        // TODO: find one of them
        User user = userList.findUserByUsername("user-01");

        // TODO: assert that UserList found User
        String expected = "user-01";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user-01", "123456");
        userList.addUser("user-02", "654321");
        userList.addUser("user-03", "qwerty");

        // TODO: change password of one user
        boolean actual = userList.changePassword("user-02", "654321", "666444");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user-01", "123456");
        userList.addUser("user-02", "654321");
        userList.addUser("user-03", "qwerty");

        // TODO: call login() with correct username and password
        User expected = userList.findUserByUsername("user-03");
        User actual = userList.login("user-03", "qwerty");

        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user-01", "123456");
        userList.addUser("user-02", "654321");
        userList.addUser("user-03", "qwerty");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("user-03", "asdfgh");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}