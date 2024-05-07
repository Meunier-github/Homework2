public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Задача 2");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Задача 3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // Задача 4
        var friend = 19;

        System.out.println("Задача 4");
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend = " + friend);

        friend = friend/7;
        System.out.println("friend = " + friend);

        // Задача 5
        var frog = 3.5;

        System.out.println("Задача 5");
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog = " + frog);

        frog = frog / 3.5;
        System.out.println("frog = " + frog);

        frog = frog + 4;
        System.out.println("frog = " + frog);

        // Задача 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;

        System.out.println("Задача 6");
        System.out.println("Масса двух бойцов = " + weightTotal);

        var weightDif = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между массами бойцов = " + weightDif);

        // Задача 7
        System.out.println("Задача 7");
        var weightDif2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между массами бойцов = " + weightDif2);

        // Задача 8
        var hourTotal = 640;
        var hourEmployee = 8;
        var employeeTotal = hourTotal/hourEmployee;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании — " + employeeTotal);

        employeeTotal = employeeTotal + 94;
        hourTotal = hourEmployee * employeeTotal;
        System.out.println("Если в компании работает " + employeeTotal + " человек, то всего " + hourTotal + " часов работы может быть поделено между сотрудниками");

    }
}