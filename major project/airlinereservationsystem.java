import java.util.*;

class Flight {
    private int num;
    private String src;
    private String des;
    private int a;
    private int tot;

    public Flight(int num, String src, String des, int a, int tot) {
        this.num = num;
        this.src = src;
        this.des = des;
        this.a = a;
        this.tot = tot;
    }

    public int getNum() {
        return num;
    }

    public String getSrc() {
        return src;
    }

    public String getDes() {
        return des;
    }

    public int getAvi() {
        return a;
    }

    public boolean bookSeat(int n) {
        if (n > 0 && n <= a) {
            a = a - n;
            return true;
        }
        return false;
    }
}

class ReservationSystem {
    private List<Flight> flights;
    private Scanner sc;

    public ReservationSystem() {
        this.flights = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void addFlight(Flight f) {
        flights.add(f);
    }

    public void display() {
        System.out.println("The flights are:");
        for (Flight x : flights) {
            System.out.println(x.getNum() + " " + x.getAvi() + " " + x.getDes() + " " + x.getSrc());
        }
    }

    public void bookSeat() {
        System.out.println("Enter the flight number: ");
        int sk = sc.nextInt();
        Flight d = null;
        for (Flight f : flights) {
            if (f.getNum() == sk) {
                d = f;
                break;
            }
        }
        if (d != null) {
            System.out.println("Enter the number of seats:");
            int c = sc.nextInt();
            if (d.bookSeat(c)) {
                System.out.println("Booking successful!");
            } else {
                System.out.println("Seats are not available.");
            }
        } else {
            System.out.println("Error: Flight not found.");
        }
    }
}

class airlinereservationsystem{
    public static void main(String[] args) {
        ReservationSystem r = new ReservationSystem();
        r.addFlight(new Flight(203, "Chennai", "Vizag", 100, 100));
        r.addFlight(new Flight(204, "Chennai", "Bengaluru", 100, 100));

        // Creating a Flight object separately
        Flight f = new Flight(205, "C", "L", 100, 100);
        r.addFlight(f);

        r.display();
        r.bookSeat();
        r.display();
    }
}
