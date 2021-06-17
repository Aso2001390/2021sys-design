public class Karte {
    public static void main(String[] args)
        Karte.hospitalName = "福岡病院";
        Karte.hospitalTel = "092-1234-5678";
        Karte karte1 = new Karte();
        Karte karte2 = new Karte();
        karte1.id = 1123; karte1.name = "太郎";
        karte2.id = 1124; karte2.name = "次郎";
        System.out.printf("病院名:%s 電話番号:%s id: %d 名前: %s \n", 
            Karte.hospitalName, Karte.hospitalTel, karte1.id, karte1.name);
        System.out.printf("病院名:%s 電話番号:%s id: %d 名前: %s \n", 
            Karte.hospitalName, Karte.hospitalTel, karte2.id, karte2.name);
    }    
}
