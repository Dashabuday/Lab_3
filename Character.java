import java.util.ArrayList;
import java.util.List;

class Character extends AbstractChar{
    private final List<Skills> skills = new ArrayList<Skills>();

    public Character(){
        System.out.println("Персонаж создан");
    }

    public Character(String nm){
        this.name = nm;
        System.out.println("Человек по имени "+nm+" создан");
    }

    @Override
    public boolean addSkill(Skills skill) { //
        if (skills.add(skill)){
            System.out.println("Персонажу \"" + this.getName() + "\" добавлен скилл " + skill.getName()
                    + " (" + skill.getInfo()+ ")");
            skills.add(skill);
            return true;
        }
        else{
            System.out.println("При добавлении скилла произошла ошибка...");
            return false;
        }
    }

    public String getSkill(String nameSkill){
        String str = "";
        for (Skills skill : skills) {
            if (skill.getName().equals(nameSkill)) {
                if (skill.getInfo()!="...") {
                    str = skill.getName() + " " + skill.getInfo();
                    break;
                }
                else{
                    str = skill.getName();
                    break;
                }
            }
        }
        return str;
    }

    public static class Actions_fst_paragraph{

        static class Window{
            static final String name="окно";

            public void gotowindow(Character obj){
                String went=null;
                switch(obj.name){
                    case "Я", "Кондуктор", "Броссар", "Экли", "Стрэдлейтер" -> went=" подошёл ";
                    case "девчонка" -> went=" полошла ";
                }
                System.out.println(obj.name + went+ "к окну.");
            }

            public void openTheWindow(Character obj, String skill){
                String open = null;
                switch(obj.name){
                    case "Я", "Кондуктор", "Броссар", "Экли", "Стрэдлейтер" -> open=" открыл ";
                    case "девчонка" -> open=" открыла ";
                }
                System.out.println(obj.name + open+ name+" настежь и "+skill+".");
            }
        }

        static class Snow{

            static final String name="снежок";

            public void not_throw(Character obj, String skill, Items sc_odj){
                System.out.println("Но "+obj.name+" "+skill+" "+ name + ", хоть и собрался его бросить в "+sc_odj.getType()+" — она стояла через дорогу.");
            }

            public void white_car(String skill, Items obj){
                System.out.println("Но потом "+skill+" — "+obj.getType()+" вся была такая чистая, белая.");
            }

            public void want_throw(String skill, Items obj2){
                System.out.println("Потом "+skill+" "+name + " в "+ obj2.getType() +", но она тоже была чистая и белая.");
            }

            public void really_not_throw(Character n){
                System.out.println("Так "+ n.name +" " + name + " никуда и не кинул.");
            }

            public void Roll_Snowball(String skill1, String skill2){
                System.out.println(skill1+" и "+skill2+" "+name+".");
            }

            public void in_bus(Character my, String skill, Character br, Character ack, String skill2){
                System.out.println(my.name+" еще "+skill+", когда мы с "+br.name+" и "+ack.name+" "+skill2+".");
            }

            public void konduct(Character cond, String skill1, String skill2){
                System.out.println(cond.name+" "+skill1+" и "+skill2+" "+name+".");
            }

            public void not_believe(Character my, String mySkill, Character cond, String cond_skill){
                System.out.println(my.name+" "+mySkill+" "+name+", но "+cond.name+" мне "+cond_skill+".");
            }
        }
    }

    public static class Actions_scn_paragraph{

        static class Cinema{
            static final String name = "кино";

            public void not_come(Character my){
                System.out.println(my.name+" не жалел, что мы не пошли в "+name+".");
            }

            public void ate_cutlet(Character br, Character ack, String skill, String skill2, String skill3, PlaceAble place){
                System.out.println("И "+br.name+" и "+ack.name+" уже "+skill+", который там показывали, так что мы "+skill2+", "+skill3+", а потом вернулись в "+place.getType()+".");
            }

            public void after(Character my, Character br, Character ack, String skill1, String skill2){
                System.out.println("А потом "+my.name+" уж как-то ходил в "+ name +" с "+ br.name +"ом и "+ ack.name +".\n"+
                        "Мне и "+skill1+" рядом было противно.\n" +
                        "Было всего без четверти десять, когда мы "+skill2+".");
            }
        }

        static class inDormitory{

            public void has_left(Character br, Character ack, PlaceAble place, String skill, String skill2){
                System.out.println(br.name+" "+skill+" и пошел "+skill2+".\n"+ack.name+", конечно, влез ко мне в "+place.getType()+".");
            }

            public void ackly(String skill, Items item, String sk1, String sk2, String sk3){
                System.out.println("Только теперь он сел не на ручку стрэдлейтеровского кресла, а "+skill+" на мою "+ item.getType() +", прямо лицом в подушку.\n"+sk1+" и "+sk2+", монотонным таким голосом, а сам все время "+sk3+".");
            }

        }

        static class Girl{

            public void lies(Character my, Character ack, Character girl, String skill, String skill2, String skill3){
                System.out.println(my.name+" раз сто ему "+skill+", но никак не мог от него отделаться.\n" +
                        ack.name+" все "+skill2+" и "+skill2+", монотонным таким голосом, про какую-то "+girl.name+", с которой он "+skill3+".\n" +
                        "Он мне про это рассказывал раз сто, и каждый раз по-другому, а также про «многократное спутывание».");
            }

            public void lair_real(Character ack, String skill1, String skill2, String skill3){
                System.out.println("То он с ней "+skill2+" в «бьюике» своего кузена, то где-то в подъезде." +
                        "\nГлавное, все это было вранье. "+skill1+", что "+ack.name+" женщин не знал, это сразу было видно." +
                        "\nНаверно, он и "+skill3+", честное слово.") ;
            }
        }

        static class Essay{

            static final String name = "сочинение";
            static final String sokrName="он";

            public void focused(Character str, Character my, String mySkill, QualityAble deyst){
                System.out.println("В общем, мне пришлось "+deyst.getType()+" сказать, что мне надо писать "+name+" за "+str.name+"а и чтоб "+sokrName+" выметался, а то "+my.name+" "+mySkill+".");
            }

            public void sit_write(Character my, QualityAble deyst, String skill){
                System.out.println("В конце концов "+sokrName+" ушел, только не сразу — "+sokrName+" ужасно всегда канителится.\n" +
                        "А "+my.name+" "+skill+" и "+deyst.getType()+".");
            }
        }
    }


    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }
}
