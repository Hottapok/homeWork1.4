public class Main {
    public static void main(String[] args) {
        //task 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        //task2

        for (int friday = 2; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println();

        //task3
        int year = 2022;
        int pastYears = year - 200;
        int futureYears = year + 100;
        for (int s=0;s<=futureYears;s=s+79){
            if(s>pastYears && s<futureYears){
                System.out.println(s);
            }
        }
    }
}