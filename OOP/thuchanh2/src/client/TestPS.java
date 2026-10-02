package client;

public class TestPS {

    public static void main(String[] args) {

  
        // 1. Tao phan so p = 1/2, q = 5/7
        

        PS p = new PS(1, 2);
        PS q = new PS(5, 7);

        System.out.println("===== PHAN SO =====");

        System.out.println("p = " + p);
        System.out.println("q = " + q);


        // 2. r = p + q
       

        PS r = p.cong(q);

        System.out.println("r = p + q = " + r);


      
        // 3. t = 2*p - p/q
      

        // 2*p
        PS haiP = p.nhan(2);

        // p/q
        PS pChiaQ = p.chia(q);

        // t = 2*p - p/q
        PS t = haiP.tru(pChiaQ);

        System.out.println("t = 2*p - p/q = " + t);


      
        // 4. So sanh p va q
       

        int kq = p.soSanh(q);

        System.out.print("So sanh p va q: ");

        if (kq < 0) {
            System.out.println("p < q");
        }
        else if (kq == 0) {
            System.out.println("p = q");
        }
        else {
            System.out.println("p > q");
        }


     
        // 5. Tao mang 5 phan so
     

        PS[] ds = {
                new PS(1, 2),
                new PS(13, 2),
                new PS(5, 7),
                new PS(6, 9),
                new PS(30, 23)
        };


        // 6. Sap xep tang dan
    

        for (int i = 0; i < ds.length - 1; i++) {

            for (int j = i + 1; j < ds.length; j++) {

                if (ds[i].soSanh(ds[j]) > 0) {

                    PS temp = ds[i];

                    ds[i] = ds[j];

                    ds[j] = temp;
                }
            }
        }
   
        // 7. In danh sach sau khi sap xep

        System.out.println();
        System.out.println("Danh sach phan so sau khi sap xep:");

        for (int i = 0; i < ds.length; i++) {

            System.out.println(ds[i]);
        }
    }
}