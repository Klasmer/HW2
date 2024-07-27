public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        var result1 = dog - 3.5;
        System.out.println(result1);
        var result2 = cat - 1.6;
        System.out.println(result2);
        var result3 = paper - 7639;
        System.out.println(result3);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        var result4 = friend / 7;
        System.out.println(result4);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        var result5 = frog / 3.5;
        System.out.println(result5);
        result5 = result5 + 4;
        System.out.println(result5);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров" + totalWeight + "кг");
        var massDifference = firstBoxer - secondBoxer;
        System.out.println("Разница между массами боксеров" + massDifference + "кг");
        /*
         в задаче 7 не понял условия, использовать вес иp предыдущей задачи или нет. сделал
         новые переменные.
        */
        var firstMan = 78.2;
        var secondMan = 82.7;
        var remainingWeight = (secondMan % firstMan);
        System.out.println("Остаток между двумя весами" + remainingWeight +"кг");

        var workingРours = 640;
        var workingРoursEmployee = 8;
        var totalEmployees = workingРours / workingРoursEmployee;
        System.out.println("Всего работников в компании" + totalEmployees + "человек");

        var result6 = totalEmployees + 94;
        var workingРoursEmployee2 = workingРours / result6;
        System.out.println("Если в компании работает" + result6 + "человек, то всего" + workingРoursEmployee2 + "часов работы может быть поделено между сотрудниками");






    }
}