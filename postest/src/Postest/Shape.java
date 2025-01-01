package Postest;

public class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;
    
    public Shape(double l, double w, double h){
        width=w;
        height=h;
        length=l;
    }
    public double compareTo(Shape s){
       double comp = s.volume-volume;
       return comp;
    }
    
    private double calculateVolume(){
        volume=length*height*width;
        return volume;
    }
    
    public void cetak(){
        System.out.println("Panjang x lebar x tinggi : "+length+" x "+width+" x "+height);
        System.out.println("Volumenya adalah : "+calculateVolume());
    }
    
    
}
