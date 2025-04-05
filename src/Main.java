public class Main {
    public static void main(String[] args) {

    System.out.println();
    System.out.println("Задача 1");
    int a = 25000;
    byte b = 5;
    short c = 11000;
    long d = 55000L;
    float e = 3.14f;
    double f = 5.2607;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

    System.out.println();
    System.out.println("Задача 2");
    float a1 = 27.12f;
    long b1 = 987678965549L;
    float c1 = 2.786f;
    short d1 = 569;
    short e1 = 159;
    short f1 = 27897;
    byte g1 = 67;
        System.out.println("Значение переменной a1 с типом float равно " + a1);
        System.out.println("Значение переменной b1 с типом long равно " + b1);
        System.out.println("Значение переменной c1 с типом float равно " + c1);
        System.out.println("Значение переменной d1 с типом short равно " + d1);
        System.out.println("Значение переменной e с типом short равно " + e1);
        System.out.println("Значение переменной f с типом short равно " + f1);
        System.out.println("Значение переменной g с типом byte равно " + g1);

    System.out.println();
    System.out.println("Задача 3");
    byte lyudmilaPavlovna = 23;
    byte annaSergeevna = 27;
    byte ekaterinaAndreevna = 30;
    short sheetsOfPaper = 480;
        System.out.println("Учеников у Людмилы Павловны - " + lyudmilaPavlovna);
        System.out.println("Учеников у Анны Сергеевны - " + annaSergeevna);
        System.out.println("Учеников у Екатерины Андреевны - " + ekaterinaAndreevna);
        System.out.println("Всего листов бумаги закуплено - " + sheetsOfPaper);
    short totalStudents = (short) (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("Всего учеников - " + totalStudents);
    byte sheetsPerPupil = (byte) (sheetsOfPaper / totalStudents);
        System.out.println(sheetsPerPupil + " листов бумаги достанется каждому ученику.");

    System.out.println();
    System.out.println("Задача 4");
    byte bottlesPerTwoMinutes = 16;
    byte bottlesPerMinute = (byte) (bottlesPerTwoMinutes/2);
        System.out.println("Производительность машини - " + bottlesPerTwoMinutes + " бутылок за 2 минты.");
        System.out.println("Производительность машини - " + bottlesPerMinute + " бутылок за 1 минту.");
    short bottlesIn20Minutes = (short) (bottlesPerMinute*20);
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
    short bottlesInDay = (short) (60*24*bottlesPerMinute);
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок.");
    int bottlesInThreeDay = bottlesInDay*3;
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDay + " штук бутылок.");
    int bottlesInMonth = bottlesInDay*30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок, с учетом если в месяце будет 30 дней.");

    System.out.println();
    System.out.println("Задача 5");
    byte totalCans = 120;
    byte cansOfWhitePerClass = 2;
    byte cansOfBrownPerClass = 4;
        System.out.println("Всего куплено " + totalCans + " банок краски.");
        System.out.println(cansOfWhitePerClass + " банки белой краски уходит на один класс.");
        System.out.println(cansOfBrownPerClass + " банки коричневой краски уходит на один класс.");
    byte cansPerClass = (byte) (cansOfWhitePerClass + cansOfBrownPerClass);
        System.out.println("всего " + cansPerClass + " банок краски уходит на один класс.");
    byte totalClassRoom = (byte) (totalCans/cansPerClass);
        System.out.println("Всего " + totalClassRoom + " классов в школе.");
    byte totalCansOfWhite = (byte) (cansOfWhitePerClass*totalClassRoom);
        System.out.println("Всего " + totalCansOfWhite + " банок белой краски было куплено.");
    byte totalCansOfBrown = (byte) (cansOfBrownPerClass*totalClassRoom);
        System.out.println("Всего " + totalCansOfBrown + " банок коричневой краски было куплено.");
        System.out.println("В школе, где " + totalClassRoom + " классов, нужно " + totalCansOfWhite + " банок белой краски и " + totalCansOfBrown + " банок коричневой краски.");

    System.out.println();
    System.out.println("Задача 6");
    byte bananas = 5;
    byte bananaWeight = 80;
    short totalBananaWeight = (short) (bananas*bananaWeight);
        System.out.println("Бананы " + bananas + " штук (1 банан - " + bananaWeight + " гр.)");
        System.out.println("Общий вес бананов " + totalBananaWeight + " гр.");

    short Milk = 200;
    byte grIn100Ml = 105;
    short weightMilk = (short) (2*grIn100Ml);
        System.out.println("Молоко " + Milk + " мл." + "(100 мл. = " + grIn100Ml + " гр.)");
        System.out.println("Общий вес молока " + weightMilk + " гр.");

    byte numberOfBriquettes = 2;
    byte weightOneBriquette = 100;
    short totalWeightIceCream  = (short) (numberOfBriquettes * weightOneBriquette);
        System.out.println("Мороженное " + numberOfBriquettes + " брикета по " + weightOneBriquette + " гр.");
        System.out.println("Общий вес мороженного " + totalWeightIceCream + " грамм.");

    byte numberEggs = 4;
    byte weightOneEggs = 70;
    short totalWeightEggs = (short) (numberEggs * weightOneEggs);
        System.out.println("Яйца сырые - " + numberEggs + " (1 яйцо - " + weightOneEggs + " гр.)");
        System.out.println("Общий вес яиц " + totalWeightEggs + " грамм.");

    short totalWeightInGrams = (short) (totalBananaWeight + weightMilk + totalWeightIceCream + totalWeightEggs);
        System.out.println("Общий вес завтрака " + totalWeightInGrams + " грамм.");
    float totalWeightInKg = (float) totalWeightInGrams / 1000;
        System.out.println("Общий вес завтрака " + totalWeightInKg + " кг.");

        System.out.println();
        System.out.println("Задача 7");
    byte excessWeight = 7;
    short grInKg = 1000;
        System.out.println(excessWeight + " кг., необходимо сбросить спортсмену");
    short weight250GrInOneDay = 250;
    short numberDaysIs250 = (short) ((excessWeight * grInKg) / weight250GrInOneDay);
        System.out.println(numberDaysIs250 + " дней, необходимо спортсмену, для тоого что бы сбросить " + excessWeight + " кг., при условии что он будет терять по " + weight250GrInOneDay + " гр. каждый день");


    short weight500GrInOneDay = 500;
    short numberDaysIs500 = (short) ((excessWeight * grInKg) / weight500GrInOneDay);
        System.out.println(numberDaysIs500 + " дней, необходимо спортсмену, для тоого что бы сбросить " + excessWeight + " кг., при условии что он будет терять по " + weight500GrInOneDay + " гр. каждый день");

    byte averageNumberDays = (byte) ((numberDaysIs250 + numberDaysIs500) / 2);
        System.out.println(averageNumberDays + " дней, необходимо спортсмену в среднем, для тоого что бы сбросить " + excessWeight + " кг.");

        System.out.println();
        System.out.println("Задача 8");
    int currentSalaryMasha = 67760;
    int currentSalaryDenis = 83690;
    int currentSalaryKris = 76230;
        System.out.println(currentSalaryMasha + " рублей - текущая зарплата Маши");
        System.out.println(currentSalaryDenis + " рублей - текущая зарплата Дениса");
        System.out.println(currentSalaryKris + " рублей - текущая зарплата Кристины");

    byte monthsInYear = 12;
    int currentSalaryMashaPerYear = currentSalaryMasha * monthsInYear;
    int currentSalaryDenisPerYear = currentSalaryDenis * monthsInYear;
    int currentSalaryKrisPerYear = currentSalaryKris * monthsInYear;
        System.out.println(currentSalaryMashaPerYear + " рублей - текущая зарплата Маши за год");
        System.out.println(currentSalaryDenisPerYear + " рублей - текущая зарплата Дениса за год");
        System.out.println(currentSalaryKrisPerYear + " рублей - текущая зарплата Кристины за год");

    float increasedCoefficient = 1.1f;
        System.out.println(increasedCoefficient + " повышенный коэффициент");

    int salaryMashaAfterPromotion = (int) (currentSalaryMasha * increasedCoefficient);
    int salaryDenisAfterPromotion = (int) (currentSalaryDenis * increasedCoefficient);
    int salaryKrisAfterPromotion = (int) (currentSalaryKris * increasedCoefficient);
        System.out.println(salaryMashaAfterPromotion + " рублей - зарплата Маши после повышения.");
        System.out.println(salaryDenisAfterPromotion + " рублей - зарплата Дениса после повышения.");
        System.out.println(salaryKrisAfterPromotion + " рублей - зарплата Кристины после повышения.");


    int salaryMashaPerYearAfterPromotion = salaryMashaAfterPromotion * monthsInYear;
    int salaryDenisPerYearAfterPromotion = salaryDenisAfterPromotion * monthsInYear;
    int salaryKrisPerYearAfterPromotion = salaryKrisAfterPromotion * monthsInYear;
        System.out.println(salaryMashaPerYearAfterPromotion + " рублей - зарплата Маши за год, после повышения.");
        System.out.println(salaryDenisPerYearAfterPromotion + " рублей - зарплата Дениса за год, после повышения.");
        System.out.println(salaryKrisPerYearAfterPromotion + " рублей - зарплата Кристины за год, после повышения.");

    int salaryDifferenceMasha = salaryMashaPerYearAfterPromotion - currentSalaryMashaPerYear;
    int salaryDifferenceDenis = salaryDenisPerYearAfterPromotion - currentSalaryDenisPerYear;
    int salaryDifferenceKris = salaryKrisPerYearAfterPromotion - currentSalaryKrisPerYear;
        System.out.println("Маша теперь получает " + salaryMashaAfterPromotion + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisAfterPromotion + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKrisAfterPromotion + " рублей. Годовой доход вырос на " + salaryDifferenceKris + " рублей.");
    }
}