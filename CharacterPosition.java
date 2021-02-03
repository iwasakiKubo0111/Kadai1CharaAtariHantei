public class CharacterPosition {
	public int LeftupX,LeftupY,Wide,High;
	//コンストラクタ
	public CharacterPosition(String str) {
		String[] str2=str.split(" ");
		LeftupX=Integer.parseInt(str2[0]);
		LeftupY=Integer.parseInt(str2[1]);
		Wide=Integer.parseInt(str2[2]);
		High=Integer.parseInt(str2[3]);
		System.out.println("登録");
	}

}
