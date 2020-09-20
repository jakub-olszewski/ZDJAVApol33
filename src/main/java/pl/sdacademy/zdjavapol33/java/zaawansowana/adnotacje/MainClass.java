package pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.Main;

import java.lang.annotation.Annotation;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class MainClass {

    public MainClass(){

        // klasa w której jesteśmy
        Class obj = this.getClass();

        if(obj.isAnnotationPresent(JavaTopic.class)){
            // sprawdzenie czy istnieje adnotacja @JavaTopic

            // refleksja
            Annotation annotation = obj.getAnnotation(JavaTopic.class);

            // obiekt naszej adnotacji
            JavaTopic testerInfo = (JavaTopic) annotation;
            System.out.printf("%n=============================================");
            System.out.printf("%nTopic: %s",testerInfo.topic());// %s oznacza String
            System.out.printf("%nDescription: %s",testerInfo.descripion());// %s oznacza String
            System.out.printf("%nPriority: %s",testerInfo.priority());// %s oznacza String
            System.out.printf("%nCreated by: %s",testerInfo.createdBy());// %s oznacza String
            System.out.printf("%nTags : ");// %s oznacza String
            int tagLength = testerInfo.tags().length;
            for (String tag : testerInfo.tags()){
                if(tagLength>1){
                    System.out.print(tag + ", ");
                }else {
                    System.out.printf(tag);
                }
                tagLength--;
            }
            System.out.printf("%n=============================================%n%n");


            if(testerInfo.createdBy().contains("SDA")){
                System.out.println("Witamy na kursie !");
                System.out.printf("%n=============================================%n%n");
            }
        }
    }
}
