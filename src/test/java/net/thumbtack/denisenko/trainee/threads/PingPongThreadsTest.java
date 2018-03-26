package net.thumbtack.denisenko.trainee.threads;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class PingPongThreadsTest {

    @Test
    public void testPingPong(){

        Thread ping = new Thread (new PingPongThreads ("ping"));
        Thread pong = new Thread (new PingPongThreads ("PONG"));

        ping.start();
        try {
            //for simulation of flight time's ball s
            Thread.currentThread().sleep(ThreadLocalRandom.current().nextInt(500, 2800+ 1));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        pong.start();
        try {
            //for simulation of flight time's ball
            Thread.currentThread().sleep(ThreadLocalRandom.current().nextInt(1500, 5000 + 1));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}