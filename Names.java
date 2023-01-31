enum Names{
    ME("Я"),
    CONDUCTOR("Кондуктор"),
    BROSSAR("Броссар"),
    ACKLEY("Экли"),
    GIRL("девчонку"),
    STRADLEYTER("Стрэдлейтер");

    private String name;

    Names(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

