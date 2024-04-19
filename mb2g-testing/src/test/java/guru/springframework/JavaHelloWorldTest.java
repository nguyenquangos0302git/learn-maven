package guru.springframework;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldTest {

    @Test
    void test() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equalsIgnoreCase(javaHelloWorld.getHello()));
    }

}