package java1;

/*
예제 3-13
사용자가 명령행에 입력한 실수들을 main()메소드에서 전달받아
합을 구하는 프로그램을 작성하라
 */
public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        for(int i=0; i<args.length; i++) //인자 개수만큼 반복
            sum += Double.parseDouble(args[i]); //문자열을 실수(double 타입)로 변환하여 합산

        /*
        parseDouble()은 문자열을 실수로 변환하여 리턴한다
        예를들면 Double.parseDouble("20.5")는 실수 20.5를 리턴한다
         */

        System.out.println("sum = " + sum);
    }
}
