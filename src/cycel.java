public class cycel {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.print("\n");
        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j);
        }
        System.out.print("\n");

        int friDay = 5;
        while (friDay<32){
            System.out.println("Сегодня пятница,"+friDay+"-е число. Необходимо подготовить отчет.");
            friDay+=7;
        }

        int r=0, year=2022;
        int year1 = year+100;
        int year2 = year-200;
        while (r<=year1){
            r++;
            if (r%79==0&&r>=year2) {
                System.out.println(r);
            }
        }



    }
}