package PlanetObs;

/**
 * ALL MEASURMENTS ARE IN METRIC UNITS **
 */
public class Planet extends GravitationalObject {
    
    /**
     *
     */
    protected String LoD; //length of Day in HOURS

    /**
     *
     */
    protected String DfS; //Distance from Sun in 10^6 KILOMETERS

    /**
     *
     */
    protected String NoM;    //number of moons 

    /**
     *
     */
    protected String Op;  //orbital period (times it takes to orbit sun) DAYS

    /**
     *
     */
    protected String rings; //ring system (yes or no) 
    
    //default constructor

    /**
     *
     */
     public Planet() {
         LoD = "0.0";
         DfS = "0.0";
         NoM = "0";
         Op = "0.0"; 
         rings = "No";
    }
     
     //data modified constructor 

    /**
     *
     * @param mass
     * @param diameter
     * @param density
     * @param temp
     * @param LoD
     * @param DfS
     * @param NoM
     * @param Op
     */
     public Planet(String mass, String diameter, String density, String temp, 
             String LoD, String DfS, String NoM, String Op) {
         
         setMass(mass);
         setDiameter(diameter);
         setDensity(density);
         setTemp(temp);
         this.LoD = LoD; 
         this.DfS = DfS;
         this.NoM = NoM;
         this.Op = Op; 
         this.rings = rings; 
         
     }
    
    /**
     * @return the LoD
     */
    public String getLoD() {
        return LoD;
    }

    /**
     * @param LoD the LoD to set
     */
    public void setLoD(String LoD) {
        this.LoD = LoD;
    }

    /**
     * @return the DfS
     */
    public String getDfS() {
        return DfS;
    }

    /**
     * @param DfS the DfS to set
     */
    public void setDfS(String DfS) {
        this.DfS = DfS;
    }

    /**
     * @return the NoM
     */
    public String getNoM() {
        return NoM;
    }

    /**
     * @param NoM the NoM to set
     */
    public void setNoM(String NoM) {
        this.NoM = NoM;
    }

    /**
     * @return the Op
     */
    public String getOp() {
        return Op;
    }

    /**
     * @param Op the Op to set
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * @return the rings
     */
    public String getRings() {
        return rings;
    }

    /**
     * @param rings the rings to set
     */
    public void setRings(String rings) {
        this.rings = rings;
    }
    
    /**
     *
     * @return
     */
    @Override 
    public String toString() {
        return  "Name: " +name+ 
                "\nMass: " +mass+
                "\nDiameter " +diameter+ "\nDensity " +density+
                "\nTemperature: " +temp+ "\nLength of Day: " +getLoD()+
                "\nDistance from Sun: " +getDfS()+ 
                "\nNumber of moons: " +getNoM()+
                "\nOrbital Period: " +getOp()+ 
                "\nRing system: "    +getRings(); 
    }
}
