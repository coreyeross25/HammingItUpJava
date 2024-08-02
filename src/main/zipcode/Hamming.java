package zipcode;

public class Hamming {
    //needed to variables based on what was defined in the constructor

    private String s;
    private final String s1;

    public Hamming(String s, String s1) {
        if(s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.s = s;
        this.s1 = s1;

    }
    //

    public int getHammingDistance() {


        int count = 0;
        for(int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) != this.s1.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
