package OOPSPRACT;
 class OverloadingConstruct {
     double width;
     double length;
     double height;
    OverloadingConstruct(){
        width=-1;
        length=-1;
        height=-1;
    }
    OverloadingConstruct(double w,double l,double h){
        width=w;
        length=l;
        height=h;
    }
    OverloadingConstruct(double len){
        length=width=height=len;
    }
    double volume(){
        return  length*height*width;
    }

}
class Box6{
    public static void main(String[] args) {
        OverloadingConstruct o1=new OverloadingConstruct(6);
        OverloadingConstruct o2=new OverloadingConstruct(6,7,9);
        OverloadingConstruct o3=new OverloadingConstruct();
        System.out.println("The volume of first cube "+ o1.volume());
        System.out.println("The volume of second cube " + o2.volume());
        System.out.println("The volume of third cube is " + o3.volume());

    }
}