package ru.ponomarev.lessons;

import org.junit.Ignore;
import org.junit.Test;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
@Ignore
public class CounterTest {
    @Test
    public void increase() throws InterruptedException{
        final Counter counter = new Counter();
        final List<Reader> readers = Arrays.asList(new Reader(counter),
                new Reader(counter),new Reader(counter),new Reader(counter),
                new Reader(counter),new Reader(counter),new Reader(counter),
                new Reader(counter),new Reader(counter),new Reader(counter),
                new Reader(counter),new Reader(counter));
        for (final Reader reader : readers) {
            reader.start();
        }
        Thread.sleep(10001);
        assertEquals(1, counter.increase());
    }
    public static final class Reader extends Thread implements Run {
        private final Counter counter;
        public Reader (Counter counter) {this.counter = counter;}

        //@Override
        public void Run(){
            for(int i=0; i != 100; ++i){
                System.out.println(String.format("%s : %s", Thread.currentThread().getId(), this.counter.increase()));
            }
        }
    }
}