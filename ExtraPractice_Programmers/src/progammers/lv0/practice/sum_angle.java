package progammers.lv0.practice;

import java.util.Scanner;

public class sum_angle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle-360*(sum_angle/360));

	}

}
