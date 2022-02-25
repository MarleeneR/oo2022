public class Main {
    public static void main(String[] args) {
        Info info = new Info("asdad", "sdsada", "kddsfs", 1, 2);
        Arvuti arvuti = new Arvuti(info, 1344);
        String arvutiInfo = arvuti.getInfo();
        System.out.println(arvutiInfo);
    }
}
