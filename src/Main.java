public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.post();

        Worker worker = new Worker();
        worker.post();

        Accountant accountant = new Accountant();
        accountant.post();
    }
}