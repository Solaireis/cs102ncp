public class CaloriesCalculatorTest {
    public static void main(String[] args) {
            NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
            NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
            NewYearGoodie loveLetter = new NewYearGoodie("Love Letters", 56.5, 13);

            System.out.printf("%s more sinful than %s: %b\n", tart.getName(), bakKwa.getName(), tart.isMoreSinful(bakKwa));
            System.out.printf("%s (calories per gram) : %.2f\n",tart.getName(), tart.getCaloriesPerGram() );
            System.out.printf("%s (calories per gram) : %.2f\n",bakKwa.getName(), bakKwa.getCaloriesPerGram() );
            System.out.printf("%s (calories per gram) : %.2f\n",loveLetter.getName(), loveLetter.getCaloriesPerGram() );

            // add 2 tart. 3 bakkwa 5 loveletter
            CaloriesCalculator result = new CaloriesCalculator();
            result.addNewYearGoodie(tart, 2);     
            result.addNewYearGoodie(bakKwa, 3);
            result.addNewYearGoodie(loveLetter, 5);
            System.out.printf("Total Calories: %.2f\n", result.getTotalCalories());
            System.out.printf("Most Sinful Goodie: %s\n", (result.getMostSinfulGoodie()).getName() );




    }
}
