package kadai.kadai_014;

public class Car_Chapter14 {
	
	//フィールド
	private int gear  = 1;
	private int speed = 10;
	
	//コンストラクタ
	public Car_Chapter14(int gear, int speed) {
		this.gear  = gear;
		this.speed = speed;		
	}
	
	//メソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		speed = switch(afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};
	}	
	
	//メソッド2
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}

}
