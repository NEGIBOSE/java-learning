class DriveCar{
  public static void main(String[] args){
    //Carクラスのオブジェクト c1 を生成
    Car c1 = new Car();

    //c1 のナンバーを 2525 に設定
    c1.no = 2525;

    //c1 の速度を30に設定
    c1.speed = 30;

    //c1 のナンバー、速度を表示
    c1.display();

    //c1 の速度を0に設定
    c1.speed = 0;

    //c1
    c1.display();
  }
}
