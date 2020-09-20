package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Animal {
    private boolean escape;


    public String getName() {
        return name;
    }

    private String name;

    public Animal(String name){
        this.name = name;
        this.escape=false;
        System.out.printf("\n%s urodził się\n",getName());
    }

    public boolean isEscape()
    {
        return escape;
    }

    public void setEscape(boolean escape)
    {
        this.escape = escape;
    }

    public void runAwayFrom(Animal animal)
    {
        System.out.printf("\n%s uciekł przed %s",this.getName(),animal.getName());
        this.setEscape(true);
    }
}
