class Quality extends AbstractQuality {
    private Qualities type;

    public Quality(String name){
        this.qualityName = name;
        System.out.println("Характеристика - " + name  + " успешно создана!");
    }

    public void setType(Qualities type){
        this.type = type;
        typeName = "";
        switch (type){
            case Snow_in_hands : typeName = "его держал в руках";
                break;
            case Revelation: typeName = "откровенно";
                break;
            case Love_Bridge: typeName = "обожал бридж";
                break;
            case Unwritten_Essay: typeName = "сел писать сочинение";
                break;
        }
        System.out.println(qualityName +" обозначено как " + typeName);
    }

    public String getType() {
        return this.typeName;
    }

    public String getQuality() {
        return qualityName == null ? "..." : qualityName;
    }
}
abstract class AbstractQuality implements QualityAble {
    public String qualityName;
    public String typeName;


    @Override
    public int hashCode() {
        return super.hashCode()+this.getPlace().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Свойство " + this.getQuality();
    }

    public String getPlace() {
        return qualityName;
    }
}

interface QualityAble {
    String getQuality();
    void setType(Qualities type);
    String getType();
}
enum Qualities {
    Snow_in_hands,
    Throw_Away,
    Revelation,
    Love_Bridge,
    Unwritten_Essay;
}
