package Java.Heritance;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Bob", 1000.0);
        System.out.println(worker.getName() + " tiene un sueld de $" + worker.calculateSalary());
        WorkerExtraHours workerExtraHours = new WorkerExtraHours("Maria", 1000.0, 3, 100.0);
        System.out.println(workerExtraHours.getName() + " tiene un sueldo de $" + workerExtraHours.calculateSalary());
    }
}
