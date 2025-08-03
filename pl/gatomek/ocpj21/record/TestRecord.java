public class TestRecord {
    public static void main( String[] args) {
        System.out.println( "Hello Records!");
        
        WorkerRecord wr = new WorkerRecord( "Tomek");
        System.out.println( wr);
    }
}

record WorkerRecord( String name){
}
