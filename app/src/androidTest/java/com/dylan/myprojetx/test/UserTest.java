package com.dylan.myprojetx.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.dylan.myprojetx.ExampleInstrumentedTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import Model.User;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class UserTest extends ExampleInstrumentedTest {

    User user = new User("dylan","funity");
    User userBis = new User("jordan","akardian");

    @Test
    public void getName() {
        assertEquals("dylan",user.getName());
    }

    @Test
    public void getPseudo() {
        assertEquals("funity",user.getPseudo());
    }

    /* TODO */
    @Test
    public void setName() {

    }

    /* TODO */
    @Test
    public void setPseudo() {
    }

    /* TODO */
    @Test
    public void testToString() {
    }
}