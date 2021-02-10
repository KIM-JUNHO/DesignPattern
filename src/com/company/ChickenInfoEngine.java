package com.company;

import java.util.Scanner;

public class ChickenInfoEngine {
    Chicken chicken;
    int token;
    String exitToken;

    public void chickenChooser() {

        Scanner sc = new Scanner(System.in);

        System.out.println("치킨 정보 시스템");
        System.out.println("---------------------");
        System.out.println("");

        do {
            System.out.println("원하는 치킨의 정보를 입력하세요.");
            System.out.println("메뉴 : 1)후라이드 치킨    2)마늘 치킨  3)양념 치킨    4)오븐 치킨");
            token = sc.nextInt();

            switch (token) {

                case 1:

                    chicken = new FriedChicken();
                    break;

                case 2:

                    chicken = new GarlicChicken();
                    break;

                case 3:

                    chicken = new SpicyChicken();
                    break;

                case 4:
                    chicken = new OvenChicken();
                    break;

            }

            chicken.cooking();
            chicken.flavor();
            chicken.display();
            chicken.number();
            System.out.println("");
            System.out.println("------------------");
            System.out.println("");
            System.out.println("계속 진행하시겠습니까? y/N");
            exitToken = sc.next();

        } while (exitToken.equals("y"));

        System.out.println("종료되었습니다.");

    }
}
