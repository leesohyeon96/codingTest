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
                return answer;
            }
        }
    }

}