package volumencuboesfera;

public class Volumenr {
    
    public static double volres (int l ){
        double radio = l/ 2;
        double pi = Math.PI;
        double volumen = (4 * pi * (Math.pow(radio, 3)))/3;
        System.out.println(volumen);
        double volcubo = Math.pow(l, 3);
        System.out.println(volcubo);
        double resta= volcubo- volumen;
        return resta;
    }
    
    public static void main(String[] args) {
        
        System.out.println(volres (3));
        
    }
    
}
