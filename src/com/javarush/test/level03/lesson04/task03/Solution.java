package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg.newZerg();
        Protos.newProtos();
        Terran.newTerran();

    }

    public static class Zerg
    {
        public String name;

        public static void newZerg(){

            Zerg zerg1 = new Zerg();
            zerg1.name = "Zerg1";
            System.out.println(zerg1.name);

            Zerg zerg2 = new Zerg();
            zerg2.name = "Zerg2";
            System.out.println(zerg2.name);

            Zerg zerg3 = new Zerg();
            zerg3.name = "Zerg3";
            System.out.println(zerg3.name);

            Zerg zerg4 = new Zerg();
            zerg4.name = "Zerg4";
            System.out.println(zerg4.name);

            Zerg zerg5 = new Zerg();
            zerg5.name = "Zerg5";
            System.out.println(zerg5.name);

            Zerg zerg6 = new Zerg();
            zerg6.name = "Zerg6";
            System.out.println(zerg6.name);

            Zerg zerg7 = new Zerg();
            zerg7.name = "Zerg7";
            System.out.println(zerg7.name);

            Zerg zerg8 = new Zerg();
            zerg8.name = "Zerg8";
            System.out.println(zerg8.name);

            Zerg zerg9 = new Zerg();
            zerg9.name = "Zerg9";
            System.out.println(zerg9.name);

            Zerg zerg10 = new Zerg();
            zerg10.name = "Zerg10";
            System.out.println(zerg10.name);
        }
        

    }

    public static class Protos
    {
        public String name;
        public static void newProtos(){
            Protos protos1 = new Protos();
            protos1.name = "Protos1";
            System.out.println(protos1.name);

            Protos protos2 = new Protos();
            protos2.name = "Protos2";
            System.out.println(protos2.name);

            Protos protos3 = new Protos();
            protos3.name = "Protos3";
            System.out.println(protos3.name);

            Protos protos4 = new Protos();
            protos4.name = "Protos4";
            System.out.println(protos4.name);

            Protos protos5 = new Protos();
            protos5.name = "Protos5";
            System.out.println(protos5.name);
        }
    }

    public static class Terran
    {
        public String name;
        public static void newTerran(){
            Terran terran1 = new Terran();
            terran1.name = "Terran1";
            System.out.println(terran1.name);

            Terran terran2 = new Terran();
            terran2.name = "Terran2";
            System.out.println(terran2.name);

            Terran terran3 = new Terran();
            terran3.name = "Terran3";
            System.out.println(terran3.name);

            Terran terran4 = new Terran();
            terran4.name = "Terran4";
            System.out.println(terran4.name);

            Terran terran5 = new Terran();
            terran5.name = "Terran5";
            System.out.println(terran5.name);

            Terran terran6 = new Terran();
            terran6.name = "Terran6";
            System.out.println(terran6.name);

            Terran terran7 = new Terran();
            terran7.name = "Terran7";
            System.out.println(terran7.name);

            Terran terran8 = new Terran();
            terran8.name = "Terran8";
            System.out.println(terran8.name);

            Terran terran9 = new Terran();
            terran9.name = "Terran9";
            System.out.println(terran9.name);

            Terran terran10 = new Terran();
            terran10.name = "Terran10";
            System.out.println(terran10.name);

            Terran terran11 = new Terran();
            terran11.name = "Terran11";
            System.out.println(terran11.name);

            Terran terran12 = new Terran();
            terran12.name = "Terran12";
            System.out.println(terran12.name);
        }
    }
}