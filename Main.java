import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Story.EndOfStory st = new Story.EndOfStory();

            Character my = new Character(Names.ME.getName());
            my.addSkill(new Skills("подошёл", "к окну"));
            my.addSkill(new Skills("открыл окно", "настежь"));
            my.addSkill(new Skills("слепил", "снежок"));
            my.addSkill(new Skills("не швырнул", null));
            my.addSkill(new Skills("передумал", null));
            my.addSkill(new Skills("хотел", "залепить"));
            my.addSkill(new Skills("Закрыл", "окно"));
            my.addSkill(new Skills("начал", "катать"));
            my.addSkill(new Skills("держал", "в руках"));
            my.addSkill(new Skills("сказал", "что не собираюсь кидать"));
            my.addSkill(new Skills("сидеть", "с ними"));
            my.addSkill(new Skills("вернулись", "в общежитие"));
            my.addSkill(new Skills("намекал", null));
            my.addSkill(new Skills("Ручаюсь", null));
            my.addSkill(new Skills("не могу", "сосредоточиться"));
            my.addSkill(new Skills("надел", "пижаму, халат и дикую охотничью шапку"));
            System.out.println();

            Character conductor = new Character(Names.CONDUCTOR.getName());
            conductor.addSkill(new Skills("открыл", "дверцу"));
            conductor.addSkill(new Skills("велел", "бросить"));
            conductor.addSkill(new Skills("не поверил", null));
            System.out.println();

            Character Brossar = new Character(Names.BROSSAR.getName());
            Brossar.addSkill(new Skills("сели", "в автобус"));
            Brossar.addSkill(new Skills("искать", "партнеров"));
            Brossar.addSkill(new Skills("обожал", "бридж"));
            Brossar.addSkill(new Skills("видели", "фильм"));
            System.out.println();

            Character Ackley = new Character(Names.ACKLEY.getName());
            Ackley.addSkill(new Skills("сесть", "в автобус"));
            Ackley.addSkill(new Skills("съели", "по котлете"));
            Ackley.addSkill(new Skills("поиграли", "в рулетку-автомат"));
            Ackley.addSkill(new Skills("плюхнулся", null));
            Ackley.addSkill(new Skills("Лег", null));
            Ackley.addSkill(new Skills("завел", "волынку"));
            Ackley.addSkill(new Skills("ковырял", "прыщи"));
            Ackley.addSkill(new Skills("говорил", null));
            Ackley.addSkill(new Skills("не дотрагивался", "ни до кого"));
            Ackley.addSkill(new Skills("спутался", null));
            System.out.println();

            Character girl = new Character(Names.GIRL.getName());
            girl.addSkill(new Skills("путался", "прошлым летом"));
            System.out.println();

            Character strad = new Character(Names.STRADLEYTER.getName());
            System.out.println();

            QualityAble quality1 = new Quality("Качество1");
            QualityAble quality2 = new Quality("Качество2");
            QualityAble quality3 = new Quality("Качество3");
            QualityAble quality4 = new Quality("Качество4");
            quality1.setType(Qualities.Snow_in_hands);
            quality2.setType(Qualities.Love_Bridge);
            quality3.setType(Qualities.Revelation);
            quality4.setType(Qualities.Unwritten_Essay);
            System.out.println();

            PlaceAble location1 = new Place("Локация1");
            PlaceAble location2 = new Place("Локация2");
            PlaceAble location3 = new Place("Локация3");
            PlaceAble location4 = new Place("Локация4");
            location1.setType(Places.Bus);
            location2.setType(Places.Room);
            location3.setType(Places.Cinema);
            location4.setType(Places.School);
            System.out.println();

            Items itm1 = new Items("Предмет №1");
            Items itm2 = new Items("Предмет №2");
            Items itm3 = new Items("Предмет №3");
            Items itm4 = new Items("Предмет №4");
            itm1.setType(Item.Snowball);
            itm2.setType(Item.Car);
            itm3.setType(Item.Pump_House);
            itm4.setType(Item.Bed);
            System.out.println();

            Character.Actions_fst_paragraph.Window win = new Character.Actions_fst_paragraph.Window();
            win.gotowindow(my);
            win.openTheWindow(my, my.getSkill("слепил"));
            Character.Actions_fst_paragraph.Snow sn = new Character.Actions_fst_paragraph.Snow();
            sn.not_throw(my, my.getSkill("не швырнул"), itm2);
            sn.white_car(my.getSkill("передумал"), itm2);
            sn.want_throw(my.getSkill("хотел"), itm3);
            sn.really_not_throw(my);
            sn.Roll_Snowball(my.getSkill("Закрыл"), my.getSkill("начал"));
            sn.in_bus(my, my.getSkill("держал"), Brossar, Ackley, Brossar.getSkill("сели"));
            sn.konduct(conductor, conductor.getSkill("открыл"), conductor.getSkill("велел"));
            sn.not_believe(my, my.getSkill("сказал"), conductor, conductor.getSkill("не поверил"));
            System.out.println();

            Character.Actions_scn_paragraph.Cinema cinema = new Character.Actions_scn_paragraph.Cinema();
            cinema.not_come(my);
            cinema.ate_cutlet(Brossar, Ackley, Brossar.getSkill("видели"), Ackley.getSkill("съели"), Ackley.getSkill("поиграли"), location4);
            cinema.after(my, Brossar, Ackley, my.getSkill("сидеть"), my.getSkill("вернулись"));

            Character.Actions_scn_paragraph.inDormitory after = new Character.Actions_scn_paragraph.inDormitory();
            after.has_left(Brossar, Ackley, location2, Brossar.getSkill("обожал"), Brossar.getSkill("искать"));
            after.ackly(Ackley.getSkill("плюхнулся"), itm4, Ackley.getSkill("Лег"), Ackley.getSkill("завел"), Ackley.getSkill("ковырял"));

            Character.Actions_scn_paragraph.Girl grl = new Character.Actions_scn_paragraph.Girl();
            grl.lies(my, Ackley, girl, my.getSkill("намекал"), Ackley.getSkill("говорил"), girl.getSkill("путался"));
            grl.lair_real(Ackley, my.getSkill("Ручаюсь"), Ackley.getSkill("спутался"), Ackley.getSkill("не дотрагивался"));

            Character.Actions_scn_paragraph.Essay ess = new Character.Actions_scn_paragraph.Essay();
            ess.focused(strad, my, my.getSkill("не могу"), quality3);
            ess.sit_write(my, quality4, my.getSkill("надел"));
            System.out.println();

            st.End();
        }
        catch (NamingException ex){
            System.out.println("NamingException catched: " + ex.getMessage());
        }
        catch (PermissionException ex){
            System.out.println("PermissionException catched: " + ex.getMessage());
        }
    }
}
