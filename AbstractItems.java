abstract class AbstractItems implements ItemsAble {
    public String itemName;
    public String typeName;


    @Override
    public int hashCode() {
        return super.hashCode()+this.getItems().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Предмет " + this.getItems();
    }

    public String getItems() {
        return itemName;
    }
}

interface ItemsAble {
    String getItems();
    void setType(Item type);
    String getType();
}
enum Item {
    Snowball,
    Car,
    Pump_House,
    Bed;
}

