public class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public double getPrinciple() {
        return principle;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }

    public double calculateInterest() {
        return (principle * time * rate) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(100000);
        si.setTime(2);
        si.setRate(10);
        
        System.out.println("Principle: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}