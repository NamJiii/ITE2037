package project03_2;

/**
 * Int�� ���� �� ��(n, m)�� ����Ͽ�, ������ ����� Consoleâ�� ����϶�.
 * 
 * ��û����
 * 		- n�� m�� 1���� 5�����̴�.
 * 		- ����� ������ 'n multiplied by m = n*m' �̴�. (n, m, n*m���� ������ ���� ��µǾ��Ѵ�.) 
 */

public class LoopStmt {

	public static void main(String[] args) {
		/* �л� �ڵ� �ۼ� �κ� - ���̿� �ڵ带 �ۼ��Ͻÿ�. */
		int intVal1, intVal2;
		for(intVal1 = 1 ; intVal1<=5 ; intVal1++) {
			for(intVal2 = 5; intVal2 >= 1 ; intVal2--) {
				System.out.println(intVal1+" multiplied by "+intVal2+" = "+intVal1*intVal2);
			}
		}
		/* �л� �ڵ� �ۼ� �κ� - ���̿� �ڵ带 �ۼ��Ͻÿ�. */
	}

}
