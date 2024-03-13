import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the x,y coordinates of A>> ");
        float[] a = readCoordinates(scanner);

        System.out.print("Write the x,y coordinates of B>> ");
        float[] b = readCoordinates(scanner);

        System.out.print("Write the x,y coordinates of C>> ");
        float[] c = readCoordinates(scanner);

        // 가장 먼 두 점 찾기
        String farPoints = findFarPoints(a, b, c);
        System.out.println("Find the two people who are the furthest away from each other: " + farPoints);

        // 삼각형의 중심 좌표 계산 + 반올림
        float centerX = (float)Math.round((a[0] + b[0] + c[0])/3*10) / 10;
        float centerY = (float)Math.round((a[1] + b[1] + c[1])/3*10) / 10;

        // 중심 좌표 출력전용 함수
        printCoordinate("The coordinates of meeting place this weekend: ", centerX, centerY);
    }

    private static float[] readCoordinates(Scanner scanner) {
        //쉼표로 구분해서 String 배열로 만든다.
        String[] input = scanner.nextLine().split(", ");
        float x = Float.parseFloat(input[0]);
        float y = Float.parseFloat(input[1]);
        return new float[]{x, y}; // 배열 리턴
    }

    // 먼지점 찾기
    private static String findFarPoints(float[] a, float[] b, float[] c) {
        double ab = distance(a, b);
        double bc = distance(b, c);
        double ca = distance(c, a);

        if (ab >= bc && ab >= ca)
        {
            return "A, B";
        }
        else if (bc >= ab && bc >= ca) {
            return "B, C";
        }
        else {
            return "A, C";
        }
    }

    //거리 계산
    private static double distance(float[] p1, float[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }

    // 출력용 함수
    private static void printCoordinate(String message, float x, float y) {
        System.out.print(message + ": ");
        System.out.print(x);
        System.out.print(", ");
        System.out.println(y);
    }
}
