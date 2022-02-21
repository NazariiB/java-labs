package com.company;

public record Bank(String name, int clients,
                   int numberOfCredits, int numberOfWorkers,
                   String ownerName, double bankArea) {
    private static double dollarRate = 28.20d;

    public Bank{
        if(clients < 0)clients = 0;
        if(numberOfCredits < 0)numberOfCredits = 0;
        if(numberOfWorkers < 0)numberOfWorkers = 0;
        if(bankArea < 0)bankArea = 0;
    }
    public Bank(){
        this("", 0, 0);
    }
    public Bank(String name, int clients, int numberOfCredits){
        this(name, clients, numberOfCredits, 0, "", 0);
    }


    @Override
    public String toString() {
        if(name == "")return "Dollar rate: " + dollarRate;
        if(numberOfWorkers == 0)return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                ", numberOfCredits=" + numberOfCredits + "}";
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                ", numberOfCredits=" + numberOfCredits +
                ", numberOfWorkers=" + numberOfWorkers +
                ", ownerName='" + ownerName + '\'' +
                ", bankArea=" + bankArea +
                '}';
    }

    public static double dollarRate(){
        return dollarRate;
    }
}
