package exam.r07;

public class TestRecord {
    public static void main(String[] args) {
        System.out.println("Hello Records!");

        WorkerRecord wr = new WorkerRecord("Tomek");
        System.out.println(wr);
    }
}

record WorkerRecord(String name) {

    // constructor -> chapter 7
    // compact constructor
    public WorkerRecord {
        name = name + "!";
    }

    //public exam.r07.WorkerRecord( String name) {
    //  this.name = name + "!";
    //}
}
