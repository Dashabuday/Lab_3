abstract class AbstractChar implements CharAble {  //абстрактный класс, который юзаем, чтобы создать класс Character
    public String name;
    public int age;

    public AbstractChar(){ //конструктор где 0 аргументов
    }

    public AbstractChar(String name){  //конструктор где 1 аргумент
        this.name = name;
    }

    public AbstractChar(String name, int age){  //конструктор где 2 аргумента
        this.name = name;
        this.age = age;
    }

    public String getName(){  //получение имени
        return name;
    }
}
interface CharAble { //интерфейс
    String getName();
    boolean addSkill(Skills skills);
}
