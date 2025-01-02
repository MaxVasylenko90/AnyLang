package dev.mvasylenko.anylang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnyLangApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnyLangApplication.class, args);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
