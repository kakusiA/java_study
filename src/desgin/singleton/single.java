package desgin.singleton;

public class single {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();
        SingletonEnum.INSTANCE.aHello();
        if (a == b){
            System.out.println("1");
        }
        System.out.println("End");
    }

}

class Singleton{
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("생성완료");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

enum SingletonEnum{
    INSTANCE;
    public void aHello(){
        System.out.println("aHello");
    }
}

class TicketMaker{
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticketNumber = 1000;
    private TicketMaker(){
        System.out.println("hi");
    }
    public static int generateTicket(){
        ticketMaker.ticketNumber++;
        return ticketMaker.ticketNumber;
    }
}

class test1213{
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.aHello();
        int ticketMaker = TicketMaker.generateTicket();
        int ticketMaker1 = TicketMaker.generateTicket();
        int ticketMaker2 = TicketMaker.generateTicket();
        int ticketMaker3 = TicketMaker.generateTicket();
        int ticketMaker4 = TicketMaker.generateTicket();
        int ticketMaker5 = TicketMaker.generateTicket();
        int ticketMaker6 = TicketMaker.generateTicket();
        int ticketMaker7 = TicketMaker.generateTicket();
        int ticketMaker8 = TicketMaker.generateTicket();
        int ticketMaker9 = TicketMaker.generateTicket();
        int ticketMaker10 = TicketMaker.generateTicket();
        System.out.println(ticketMaker10);
        Triple alpha = Triple.getInstance("ALPHA");
        Triple beta = Triple.getInstance("BETA");
        Triple gamma = Triple.getInstance("GAMMA");
        System.out.println(alpha);
        System.out.println(beta);
        System.out.println(gamma);
    }
}

class Triple{
    private static Triple[] triples = {
                    new Triple("ALPHA"),
                    new Triple("BETA"),
                    new Triple("GAMMA")};
    private String name;
    Triple(){
    }
    Triple(String name){
        this.name = name;
    }
    public static Triple getInstance(String name){
        for(Triple triple:triples){
            if(triple.name.equals(name)){
                return triple;
            }
        }
        throw new RuntimeException("<UNK>");
    }
}

