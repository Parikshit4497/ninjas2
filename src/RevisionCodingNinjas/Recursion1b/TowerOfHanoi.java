package RevisionCodingNinjas.Recursion1b;

public class TowerOfHanoi {
    public static void towerOfHanoi(String source ,String Destination,String help,int n){
        if(n==0){
            return;
        }
        towerOfHanoi(source,help,Destination,n-1);
        System.out.println("Move "+ n +" from "+source+ " to "  +Destination);
        towerOfHanoi(help,Destination,source,n-1);
    }
    public static void main(String[] args) {
        towerOfHanoi("A","B","C",3);
    }
}
