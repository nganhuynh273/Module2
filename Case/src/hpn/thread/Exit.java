package hpn.thread;

public class Exit implements Runnable{
    @Override
    public void run() {
        String[] string = {"Tạm ",
                "Biệt ", "Các ", "Bạn, ", "Hẹn ", "Gặp ", "Lại !!!!"};
        for (int i = 0; i < string.length; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(string[i]);
        }
        System.exit(0);
        return;
    }
}
