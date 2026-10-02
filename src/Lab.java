public class Lab  // NO CHANGES NEEDED        
{
	public static void main(String[] args) {
		DogPark d = new DogPark();
		d.setLength(5);
		d.setWidth(7);
	    System.out.println("This neighborhood's dog park: " + d.reportMaterials());	
	}
}

class DogPark
{
    private Fence outerFence = new Fence();
    private GrassArea grassyArea = new GrassArea();
    public int length;
    private int width;
    
    public void setLength(int l)
    {
        length = l; 
    }
    
    private void setWidth(int w)
    {
        width = w;
    }
    
    public String reportMaterials()
    {
        outerFence.setWidth(width);
        outerFence.setLength(length);
        grassyArea.setWidth(width);
        grassyArea.setLength(length);
        int totalFenceLength  = outerFence.calculateFenceTotalLength();
        int grassSeedNeeded = grassyArea.calculateGrassSeedAmount();
        return "Needs " + totalFenceLength+ " feet of fence material and " + grassSeedNeeded + " pounds of grass seed"; 	// NO CHANGES NEEDED        
    }
}

class Fence
{
    private int length;
    private int width;
    public void setLength(int l)
    {
        length = l; 
    }
    
    public void setWidth()
    {
        width = w;
    }    
    
    public int calculateFenceTotalLength()
    {
        return (length * 2 + width * 2) * 2;  // NO CHANGES NEEDED        
    }
}

class GrassArea
{
    private int length;
    private int width;
    public void setLength(int l)
    {
        length = l; 
    }
    
    public void setWidth(int w)
    {
        width = w;
    }

    public int calculateGrassSeedAmount()
    {
        return length * width * 4;  // NO CHANGES NEEDED        
    }    
    
}