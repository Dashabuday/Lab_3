class Place extends AbstractPlace {
    private Places type;

    public Place(String name){
        this.placeName = name;
        System.out.println("Место " + name  + " успешно создана!");
    }

    public void setType(Places type){
        this.type = type;
        typeName = "";
        switch (type){
            case Bus : typeName = "Автобус";
                break;
            case Room : typeName = "комнату";
                break;
            case Cinema: typeName = "Кино";
                break;
            case School: typeName = "школу";
                break;
        }
        System.out.println(placeName +" объявлена как " + typeName);
    }

    public String getType() {
        return this.typeName;
    }

    public String getPlace() {
        return placeName == null ? "..." : placeName;
    }
}
abstract class AbstractPlace implements PlaceAble {
    public String placeName;
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
        return "Место " + this.getPlace();
    }

    public String getPlace() {
        return placeName;
    }
}
interface PlaceAble {
    String getPlace();
    void setType(Places type);
    String getType();
}
enum Places {
    Bus,
    Cinema,
    School,
    Room;
}

