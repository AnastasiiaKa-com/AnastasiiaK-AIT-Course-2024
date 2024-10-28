package Homework_23.car;
// Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

public class Car {
    public static void main(String[]args){
        //Данные о автомобилях
        String[] carBrands = { "Audi","BMW","Opel","VW", "Mercedec"};

        char[] fuelTypes = {'d', 'b', 'd', 'b'};// b - бензин d - дизтопливо
        double[] fuelCosts = {1.6, 1.8};//Стоимость 1 литра
        double[] fuelConsumption = {6.6, 6.8, 6.9, 6.5, 6.3};//Расход на 100 км
        double[] rentalCosts = {45, 47, 30, 50, 51};//стоимость аренды за неделю
        double distance = 3000; // расстояние в км

        //Переменные для хранения минимальной стоимости и индекса автомобиля
        double minTotalCost = Double.MAX_VALUE;
        int bestCarIndex = -1;

        //Проходим по каждому автомобилю
        for (int i = 0; i < carBrands.length; i++) {

         //Вычисляем стоимость топлива для авто
         double fuelCostPerLiter = fuelCosts[fuelTypes[i] == 'd'? 0:1];
         double totalFuelConsumption = (fuelConsumption[i] / 100) * distance;//Общий расход топлива
            double totalFuelCost = totalFuelConsumption * fuelCostPerLiter;//Общая стоимость топлива

           // Общая стоимость аренд и топлива
            double totalCost = rentalCosts[i] + totalFuelCost;
            //проверяем является ли текущая стоимость меньше минимальной
            if (totalCost < minTotalCost){
                minTotalCost = totalCost;
                bestCarIndex = i; // Соханяем индекс лучшего авто

               // Выводим результат
                if (bestCarIndex != -1){
                    System.out.println(" The best car to rent: " + carBrands[bestCarIndex]);
                    System.out.println(" Total Cost: " + minTotalCost + " EUR ");
                }
            }
        }
        }
    }

