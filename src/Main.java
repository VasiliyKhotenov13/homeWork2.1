public class Main {
    public static void main(String[] args) {

    //задание 1
    System.out.println("Задание 1");
    int cat = 131092;
    byte dog = 99;
    short duck = 31203;
    long chicken = 158925;
    float cheese = 5.13f;
    double pie = 1.999999999;
    System.out.println("Значение переменной cat с типом int равно " +cat);
    System.out.println("Значение переменной dog с типом byte равно " +dog);
    System.out.println("Значение переменной duck с типом short равно " +duck);
    System.out.println("Значение переменной chicken с типом long равно " +chicken);
    System.out.println("Значение переменной cheese с типом float равно " +cheese);
    System.out.println("Значение переменной pie с типом double равно " +pie);

    //задани 2
    System.out.println("Задание 2");
    float cheese1 = 27.12f;
    long chicken1 = 987678965549L;
    double pie1 = 2.786;
    boolean rain = false;
    int duck1 = 569;
    short temp = -159;
    short cat1 = 27897;
    byte dog1 = 67;
    System.out.println("Значение переменной cat1 " +cat1);
    System.out.println("Значение переменной dog1 " +dog1);
    System.out.println("Значение переменной duck1 " +duck1);
    System.out.println("Значение переменной chicken1 " +chicken1);
    System.out.println("Значение переменной cheese1 " +cheese1);
    System.out.println("Значение переменной pie1 " +pie1);
    System.out.println("Значение переменной rain " +rain);
    System.out.println("Значение переменной temp " +temp);

    //задача 3
    System.out.println("Задание 3");
    short teachA = 23;
    short teachB = 27;
    short teachC = 30;
    short allPaper = 480;
    int allStud = teachA + teachB + teachC;
    int paper = allPaper / allStud;
    System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги" );

    //задача 4
    System.out.println("Задание 4");
    short bottle2Min = 16;
    int bottle20min = bottle2Min * 10;
    int bottleDay = bottle20min * 3 * 24;
    int bottle3Day = bottleDay * 3;
    int bottleMonth = bottle3Day * 10;
    System.out.println("За 20 минут машины произвела бутылок в кол-ве " + bottle20min + " штук");
    System.out.println("За 1 сутки машины произвела бутылок в кол-ве " + bottleDay + " штук");
    System.out.println("За 3 суток машины произвела бутылок в кол-ве " + bottle3Day + " штук");
    System.out.println("За 1 месяц машины произвела бутылок в кол-ве " + bottleMonth + " штук");

    //задача 5
    System.out.println("Задание 5");
    short potAll = 120;
    short allCollor = 2 + 4; //банок белой и коричневой краски на один класс
    int allClass = potAll / allCollor; //всего классов в школе
    int potWh = allClass * 2; //общее кол-во банок белой краски
    int potBr = allClass * 4; //общее кол-во банок коричневой краски
    System.out.println("В школе, где " + allClass + " классов, нужно " + potWh + " банок белой краски и " + potBr + " банок коричневой краски!");

    //задача 6
    System.out.println("Задание 6");
    byte banana = 80;
    int allBanana = banana * 5;
    byte milk = 105;
    int allMilk = milk * 2;
    byte ice = 100;
    int iceAll = ice * 2;
    byte eggs = 70;
    int eggsAll = eggs * 4;
    int breakfast = allBanana + allMilk + eggsAll + iceAll;
    float breakfastKg = breakfast / 1000f;
    System.out.println("Данный завтра спортсмена составляет " +breakfast+ " грамм, и " +breakfastKg+ " кг, соответственно!");

    //задание 7
    System.out.println("Задание 7");
    short weight = 7000;
    int dayMax = weight / 250; //уйдет на похудение, присжигание 250 грамм в день
    int dayMin = weight / 500; //уйдет на похудение, присжигание 500 грамм в день
    int dayMid = (dayMax+dayMin)/2; //сколько в среднем уйдет дней на сжигание 7 кг
    System.out.println("На сжигание 7 кг в среднем уйдет " +dayMid+ " дней!");

    //задание 8
    System.out.println("Задание 8");
    int Masha = 67760;
    int Denis = 83690;
    int Kristina = 83690;
    double MashaPlus = Masha * 0.1;
    double DenisPlus = Denis * 0.1;
    double KristinaPlus = Kristina * 0.1;
    double MashaNew = MashaPlus + Masha;
    double DenisNew = DenisPlus + Denis;
    double KristinaNew = KristinaPlus + Kristina;
    System.out.println("Маша теперь получает " +MashaNew+ " рублей. Годовой доход вырос на " +MashaPlus+ " рублей");
    System.out.println("Денис теперь получает " +DenisNew+ " рублей. Годовой доход вырос на " +DenisPlus+ " рублей");
    System.out.println("Кристина теперь получает " +KristinaNew+ " рублей. Годовой доход вырос на " +KristinaPlus+ " рублей");
    //задания выполнены.

    }
}