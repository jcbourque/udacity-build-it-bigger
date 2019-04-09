package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {
    @Test
    public void testAsyncJoke() {
        new JokeAsyncTask(new JokeDelivery() {
            @Override
            public void deliver(String content) {
                assertFalse(content.isEmpty());
            }
        });
    }
}
