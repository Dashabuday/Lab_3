class Items extends AbstractItems {
    private Item type;

    static {
        class Features {
            String color, purity;
            Features() {
                this.color = "белый";
                this.purity = "чистый";
            }
        }
        Features ft = new Features();
    }

    public Items(String name){
        this.itemName = name;
        System.out.println("Предмет - " + name  + " успешно создана!");
    }

    public void setType(Item type){
        this.type = type;
        typeName = "";
        switch (type){
            case Snowball : typeName = "снежок";
                break;
            case Car: typeName = "машина";
                break;
            case Pump_House: typeName = "водокачку";
                break;
            case Bed: typeName = "кровать";
                break;
        }
        System.out.println(itemName +" обозначено как " + typeName);
    }

    public String getType() {
        return this.typeName;
    }

    public String getItem() {
        return itemName == null ? "..." : itemName;
    }
}
