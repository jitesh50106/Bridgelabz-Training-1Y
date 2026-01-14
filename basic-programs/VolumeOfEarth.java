public class VolumeOfEarth{
    public static void main(String[] args) {
        int r = 6378;
        double m = r*0.621371;
        double vk = (4.0/3)*Math.PI*Math.pow(r, 3);
        double vm = (4.0/3)*Math.PI*Math.pow(m, 3);
        System.out.println("The volume of earth in cubic kilometers is "+ vk +" and cubic miles is "+ vm);
    }
}
