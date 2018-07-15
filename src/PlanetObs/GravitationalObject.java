package PlanetObs;

public class GravitationalObject implements Comparable<GravitationalObject> {

    /**
     *
     */
    protected String name; 

    /**
     *
     */
    protected String mass; // KILOGRAMS

    /**
     *
     */
    protected double massActual; // in terms of kg 10^24

    /**
     *
     */
    protected String diameter; // KILOMETERS

    /**
     *
     */
    protected String density; // KILOGRAMS/MASS^3

    /**
     *
     */
    protected String temp; //average temperature CELCIUS

    /**
     *
     */
    protected String image; 
    //default constructor

    /**
     *
     */
    public GravitationalObject() {
        mass = "0.0";
        massActual = 0.0;
        diameter = "0.0";
        density = "0.0";
        temp = "0.0"; 
        image = "None"; 
    }
    
    /**
     *
     * @return
     */
    public double getMassActual(){
        return massActual;
    }
    /**
     * @return the mass
     */
    public String getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * @return the diameter
     */
    public String getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

   /**
     * @return the density
     */
    public String getDensity() {
        return density;
    }


  /**
     * @param density the density to set
     */
    public void setDensity(String density) {
        this.density = density;
    }

 
 /**
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

  
/**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  "Object name: " +name+
                "\nMass: " +mass+
                "\nDiameter " +diameter+ "\nDensity " +density+
                "\nTemperature: " +temp; 
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *
     * @return
     */
    public String getImage(){
        return this.image;
    }
    
    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(GravitationalObject o){
        
        if(getMassActual() > o.getMassActual())
            return 1;
        else if(o.getMassActual()>getMassActual())
            return -1;
        else
            return 0;
        
    }

    
    
}


