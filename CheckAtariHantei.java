import java.util.ArrayList;
import java.util.Scanner;
public class CheckAtariHantei {
//動作は確認
	public static void main(String[] args) {
		ArrayList<CharacterPosition> EnemyList=new ArrayList<CharacterPosition>();
		Scanner scan=new Scanner(System.in);
		CharacterPosition MePosition=new CharacterPosition(scan.nextLine());
		int EnemyCounter=Integer.parseInt(scan.nextLine());

		//敵の場所を登録
		for(int i=0;i<EnemyCounter;i++) {
			CharacterPosition Enemy=new CharacterPosition(scan.nextLine());
			EnemyList.add(Enemy);
		}

		//接触しているか判定
		for(int i=0; i<EnemyCounter;i++) {
			//Enemy数分判定
			if(MePosition.LeftupX <= EnemyList.get(i).LeftupX+EnemyList.get(i).Wide
					||EnemyList.get(i).LeftupX<= MePosition.LeftupX+MePosition.Wide
					&&MePosition.LeftupY >= EnemyList.get(i).LeftupY-EnemyList.get(i).High
					||EnemyList.get(i).LeftupY>= MePosition.LeftupY-MePosition.High) {

					System.out.println("敵機"+(i+1)+"が当たり");

			}
		}
	}

}

//-----------------------------------



