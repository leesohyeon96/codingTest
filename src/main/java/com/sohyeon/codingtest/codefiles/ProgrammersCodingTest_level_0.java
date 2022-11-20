package com.sohyeon.codingtest.codefiles;

public class ProgrammersCodingTest_level_0 {

    //전역설정때문에 저렇게 올라가는데 다시 바꿔서 해야겠다 어휴,,

    class 프로그래머스_난이도0_옹알이문제 {
        //TODO 어려워서 보류

    }

    class 프로그래머스_난이도0_다음에올숫자 {

        class Solution {
            public int solution(int[] common) {

                int answer = 0;

                //등차
                int arithmeticSequence;
                //등비
                int geometricSequence;

                if(common[1] - common[0] == common[2] - common[1]) {
                    //등차
                    arithmeticSequence = common[2] - common[1];
                    answer = common[common.length - 1] + arithmeticSequence;
                } else {
                    //등비
                    geometricSequence = common[1]/common[0];
                    answer = common[common.length - 1] * geometricSequence;
                }

                return answer;
            }
        }
    }

    //TODO 투포인터 알고리즘 공부해보기 + 나중에 다시 풀어보기..
    class 프로그래머스_난이도0_연속된수의합 { 
        class Solution {
            public int[] solution(int num, int total) {
                int[] answer = new int[num];

                //생각해보기(원리)
                int sum = num * (num + 1) / 2;
                int offset = (total - sum) / num;

                System.out.println("sum" + sum);
                System.out.println("offset" + offset);

                for(int i = 1; i <= num; i++) {
                    answer[i - 1] = (i + offset);
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_몫구하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                answer = num1 / num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의곱 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                answer = num1 * num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_숫자비교하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;

                answer = num1 == num2? 1: -1;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_나머지구하기 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = num1 % num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의차 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = num1 - num2;

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_나이출력 {
        class Solution {
            public int solution(int age) {
                int answer = 0;

                if(0 < age && age <= 120) {
                    answer = 2022 - age + 1;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의합 {
        class Solution {
            public int solution(int num1, int num2) {

                int answer = -1;

                if((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000)) {
                    answer = num1 + num2;
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_각도기 {
        class Solution {
            public int solution(int angle) {
                int answer = 0;
                // 0 < 예각 < 90
                // 90 < 둔각 < 180
                // 평각 = 180

                if (angle <= 90) {
                    answer = (angle < 90) ? 1 : 2;
                } else {
                    answer = (angle == 180) ? 4 : 3;
                }


                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_두수의나눗셈 {
        class Solution {
            public int solution(int num1, int num2) {
                int answer = 0;
                double result = (double)num1 / (double)num2;

                if((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)) {
                    answer = (int)(result * 1000);
                }

                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_짝수의합 {
        class Solution {
            public int solution(int n) {
                int answer = 0;

                if(0 < n && n <= 1000) {
                    for(int i = 0; i <= n; i++) {
                        answer += (i%2 == 0)? i: 0;
                    }
                }
                return answer;
            }
        }
    }

    class 프로그래머스_난이도0_양꼬치 {
        class Solution {
            public int solution(int n, int k) {
                int answer = 0;
                int nTotalPrice = 0;
                int kTotalPrice = 0;

                if((0 < n && n < 1000) && (n/10 <= k && k < 1000)) {

                    if(n >= 10) {
                        kTotalPrice = (k >= 2)? (k - (n/10)) * 2000: 0; //10인분마다 1개씩 k++;
                        nTotalPrice = n * 12000;

                    } else {
                        kTotalPrice = k * 2000;
                        nTotalPrice = n * 12000;
                    }
                    answer = kTotalPrice + nTotalPrice;
                }

                return answer;
            }
            
            /*

            <객체 지향적 풀이 - 참고>

            class Solution {
                public int solution(int n, int k) {
                    int lambTotalPrice = totalPrice(Menu.LAMB, n);
                    int drinkTotalPrice = totalPrice(Menu.DRINK, k);
                    int discountPrice = discount(Menu.DRINK, n);

                    int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
                    return totalPay;
                }

                private int totalPrice(Menu menu, int quantity) {
                    return menu.getPrice() * quantity;
                }

                private int discount(Menu menu, int lambQuantity) {
                    // 양꼬치 10인분에 음료수 하나
                    int point = lambQuantity / 10;

                    return menu.getPrice() * point;
                }
            }

            enum Menu {

                LAMB("양꼬치", 12000),
                DRINK("음료수", 2000);

                private final String name;
                private final int price;

                Menu(String name, int price) {
                    this.name = name;
                    this.price = price;
                }

                public String getName() {
                    return name;
                }

                public int getPrice() {
                    return price;
                }
            }

            */

        }
    }

    class 프로그래머스_난이도0_배열의평균값 {
        class Solution {
            public double solution(int[] numbers) {
                double answer = 0;
                double tempTotal = 0;
                boolean isLimit = false;

                for(int i = 0;  i < numbers.length; i++) {
                    if((numbers[i] >= 0 && numbers[i] <= 1000) &&
                            (numbers.length >= 1 && numbers.length <= 100)) {

                        isLimit = true;
                    }
                }

                if(isLimit) {
                    for(int j = 0; j < numbers.length; j++) {
                        tempTotal += numbers[j];
                    }

                    answer = tempTotal / numbers.length;
                }

                return answer;
            }
        }
    }
}
