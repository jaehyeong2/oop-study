package javaoop.study;

import javaoop.study.annotation.Cap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
//        Cap cap = new MagicCap();
//        System.out.println(cap.pullOut());
    }
}
