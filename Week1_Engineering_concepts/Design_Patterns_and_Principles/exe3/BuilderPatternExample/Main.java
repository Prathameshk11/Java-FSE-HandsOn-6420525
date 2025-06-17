public class Main {
    public static void main(String[] args) {
        Computer basicPC = new Computer.Builder("Intel i3", "4GB")
                .build();

        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        System.out.println("Basic PC Specs:");
        basicPC.showSpecs();

        System.out.println("\nGaming PC Specs:");
        gamingPC.showSpecs();
    }
}
