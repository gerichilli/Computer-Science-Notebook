public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStartUsesIt;

    public String getBrand() {
       return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public boolean isRockStartUsesIt() {
        return rockStartUsesIt;
    }

    public void setRockStartUsesIt(boolean rockStartUsesIt) {
        this.rockStartUsesIt = rockStartUsesIt;
    }
}
