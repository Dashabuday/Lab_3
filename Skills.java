class Skills { //умения, два поля: name и info
    private final String name;
    private final String info;

    public Skills(String name, String info){ //конструктор класса
        this.name = name;
        this.info = info;
    }

    public String getName(){  //метод, чтобы взять имя
        return name;
    }

    public String getInfo(){ //метод чтобы получить info
        if (info == null)
            return "...";
        else
            return info;

    }

}