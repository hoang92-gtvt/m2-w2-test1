package Main;
import animal.*;
import fruit.*;


public class Main {
    public static void main(String[] args) {
        Animal checken1 = new Chicken();
        Chicken checken2 = new Chicken();
        //String k1 = chicken1.howtoEat(); Loi do khai bao checken1 thuoc Aniamal, va chua cos tham chieu toi interfac1
        String k2= checken2.howtoEat();
        System.out.println(k2);

        Fruit orange1 = new Organe();
        Fruit apple1  = new Apple();
        Organe orange2 = new Organe();
      //  Fruit traicay = new Fruit(); loi vi ko tao dc doi tuong tu lop truu tuong.


        orange1.howtoEat();
        apple1.howtoEat();
        orange2.howtoEat();
        // khi khai bao interface cho lop truu tuong,
        // thi interface tac dung len  ca lop truu tuong va cac lop con cua no;
        System.out.println(orange2.howtoEat());



    }
}
