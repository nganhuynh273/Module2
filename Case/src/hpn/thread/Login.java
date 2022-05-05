package hpn.thread;

public class Login implements Runnable {
    public static void main(String[] args) {
//        Thread_Login threadLogin = new Thread_Login();
//   Thread thread = new Thread(threadLogin);
//   thread.start();
    }

    @Override
    public void run() {
        String a = "Những";
        String b = " CHÀO";
        String c = " CÁC";
        String d = " BẠN";
        String e = " ĐÃ";
        String f = " GHÉ";
        String g = " THĂM";
        String h = " CỬA";
        String ti = " HÀNG";
        String tut = " CỦA";
        String uio = " MÌNH!!!";
        String[] list = {a,b,c,d,e,f,g,h,ti,tut,uio};

        for (int i = 0; i< list.length;i++ ){
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(list[i]);
        }
    }
}



