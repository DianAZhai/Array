import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		System.out.print("请输入行数：");
		Scanner sc= new Scanner(System.in);
		int b= sc.nextInt();
		int[][]a = new int[b][b];
		int x=0, y=0;
		for (int i = 0; i < a.length * a.length; i++) {
			a[x][y] = i + 1;
			if (y+1<b && a[x][y+1] == 0)//
				{
				if (x-1<b && x-1>-1 && a[x-1][y]==0) {
				} else {
					y++;
					continue;
				}
			}
			if (x + 1 >= -1 && x + 1 < b && a[x + 1][y] == 0) {
				x++;
				continue;
			}
			if (y - 1 > -1 && a[x][y - 1] == 0) {
				y = y - 1;
				continue;
			}
			if (x - 1 > -1 && a[x - 1][y] == 0) {
				x -= 1;
				continue;
			}
		}
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(a[i][j] + " ");
				if (a[i][j] < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
