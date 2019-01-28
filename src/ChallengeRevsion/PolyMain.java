package ChallengeRevision;

class Movie
{
    private String name;
    public Movie(String name)
    {
        this.name=name;
    }
    public String plot()
    {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie
{
    public  Jaws()

    {
        super("Jaws");
    }
    public String plot()
    {
        return "Alien attempt to take over planet earth ";
    }
}
class IndependenceDay extends Movie
{
    public IndependenceDay()
    {
        super("Indepenedence");
    }
    public String plot()
    {
        return "Alien attempt to take over planet earth ";
    }
}
class MazeRunner extends  Movie {
    public MazeRunner() {
          super("Maze Runner");
    }
    public String plot()
    {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public  StarWars()
    {
        super("Stars Wars");
    }
    public  String plot()
    {
        return "Imperial Force try to take over the universe:";
    }
}
class Forgettable extends Movie{
    public Forgettable()
    {
        super("Forgettable ");
    }
}
public class PolyMain {
    public static void main(String[] args) {
           for(int i=1;i<11;i++)
           {
               Movie movie=randomMovie();
               System.out.println("Movie #" + i +": "+ movie.getName()+"\n"+"plot:" + movie.plot()+"\n");
           }
    }
    public static Movie randomMovie()
    {
        int randomNumber =(int)(Math.random()*5)+1;
        System.out.println("Random numbers generated was:" + randomNumber);
        switch(randomNumber)
        {
            case 1:
                return  new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();

            case 4:
                return  new StarWars();
            case 5:
                return new Forgettable();
                default:
                    return  null;
                    

        }
    }
}
